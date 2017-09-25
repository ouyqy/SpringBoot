package com.avalon.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by ouyqy on 2017/9/18.
 */
@RestController
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam(name = "file") MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(
                    new File("e:/upload/"+file.getOriginalFilename()),file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
