package com.avalon.controller;

import com.avalon.bean.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ouyqy on 2017/9/15.
 */
@RestController//申明是控制器,返回数据时不需要@ResponseBody
@RequestMapping("/rest")
public class DemoRestController {

    //返回数据的媒体类型为json
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj demoObj){
        //直接返回对象,对象会自动转换成json
        return new DemoObj(String.valueOf(
                Integer.parseInt(demoObj.getId()==null?"0":demoObj.getId())+1),
                demoObj.getName()+"yy");
    }

    //返回数据的媒体类型是xml
    @RequestMapping(value = "/getXml",produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj demoObj){
        //直接返回对象,对象的类型会转换成xml
        return new DemoObj(String.valueOf(
                Integer.parseInt(demoObj.getId()==null?"0":demoObj.getId())+1),
                demoObj.getName());
    }
}
