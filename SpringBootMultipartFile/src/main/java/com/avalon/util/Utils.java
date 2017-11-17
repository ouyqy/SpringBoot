package com.avalon.util;


import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeUtility;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Author ouyqy
 * @date 2017/11/17.
 */
public class Utils {

    /**
     * 解决各浏览器，下载文件名显示不正确的情况
     * @param request
     * @param fileName
     * @return
     */
    public static String getDownFileName(HttpServletRequest request, String fileName){
        String new_fileName = null;

        try {
            new_fileName = URLEncoder.encode(fileName,"UTF8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String userAgent = request.getHeader("User-Agent");
        String rtn = "fileName=\""+new_fileName+"\"";
        //如果没有UA,则默认使用IE的方式进行编码,毕竟IE还是占多数的
        if(userAgent!=null){
            userAgent = userAgent.toLowerCase();
            //IE浏览器，只能采用URLEncoder编码
            if(userAgent.indexOf("msie")!=-1){
                rtn = "fileName=\""+new_fileName+"\"";
            }
            //opera浏览器只能采用fileName*
            else if(userAgent.indexOf("opera")!=-1){
                rtn = "fileName*=UTF-8''"+new_fileName;
            }
            //Safari浏览器 只能采用ISO编码的中文输出
            else if(userAgent.indexOf("safari")!=-1){
                try {
                    rtn = "fileName=\""+new String(fileName.getBytes("UTF-8"),"ISO8859-1")+"\"";
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            //Chrome浏览器，只能采用MimeUtility编码或ISO编码的中文输出
            else if(userAgent.indexOf("applewebkit")!=-1){
                try {
                    new_fileName = MimeUtility.encodeText(fileName,"UTF8","B");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                rtn = "fileName=\""+new_fileName+"\"";
            }
            //
            else if(userAgent.indexOf("mozilla")!=-1){
                rtn = "fileName*=UTF-8''"+new_fileName;
            }

        }
        return rtn;
    }
}
