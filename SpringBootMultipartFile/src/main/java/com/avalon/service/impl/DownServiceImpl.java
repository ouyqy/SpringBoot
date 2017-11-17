package com.avalon.service.impl;


import com.avalon.service.DownService;
import com.avalon.util.FileBean;
import com.avalon.util.Utils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Author ouyqy
 * @date 2017/11/17.
 */
@Service
public class DownServiceImpl implements DownService {

    @Resource
    private FileBean fileBean;

    /**
     * 下载文件
     * @param request
     * @param response
     * @param fileName
     * @return
     */
    @Override
    public String downFile(HttpServletRequest request, HttpServletResponse response, String fileName) {
        if(StringUtils.isEmpty(fileName)){
            return "文件名不能为空";
        }
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;"+ Utils.getDownFileName(request,fileName));
        response.setContentType("application/json;charset=UTF-8");
        try {
            InputStream in = new FileInputStream(new File(fileBean.getAddress()+fileName));
            OutputStream out = response.getOutputStream();
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "下载成功";
    }
}
