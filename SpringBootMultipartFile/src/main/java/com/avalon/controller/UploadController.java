package com.avalon.controller;

import com.avalon.service.DownService;
import com.avalon.util.FileBean;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by ouyqy on 2017/9/18.
 */
@RestController
public class UploadController {

    @Resource
    private DownService downService;

    @Resource
    private FileBean fileBean;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam(name = "file") MultipartFile file){
        try {
            String fileName = file.getOriginalFilename();
            String fileEndName = fileName.substring(0,fileName.indexOf("."))+"_"+
                    System.currentTimeMillis()+fileName.substring(fileName.indexOf("."));
            FileUtils.writeByteArrayToFile(
                    new File(fileBean.getAddress()+fileEndName),file.getBytes());
            return "success:"+fileEndName;
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping(value = "/downloadFile",method = RequestMethod.POST)
    public String downFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("fileName") String fileName){
        return downService.downFile(request,response,fileName);
    }
}
