package com.avalon.controller;

import com.avalon.bean.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ouyqy on 2017/9/15.
 */
@Controller //申明是一个控制器
@RequestMapping("/anno")//映射此类的访问路径是/anno
public class DemoAnnotationController {

    //此方法未标注路径,因此使用类级别的路径的/anno;produces可定制返回的response的媒体类型和字符集
    //如果需要返回值是json对象,则设置produces="application/json;charset=UTF-8"
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request, @ModelAttribute("msg") String msg){
        try {
//            int a = 1/0;
            return "url: "+ request.getRequestURL()+" can access "
                    +request.getAttribute("startTime")+" model:"+msg;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    //接收路径参数,并在方法参数前结合@PathVariable使用,访问路径为/anno/pathvar/xx
    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String dempPathVar(@PathVariable String str,HttpServletRequest request){
        return "url: "+request.getRequestURL()+" can access,str: "+str;
    }

    //常规的request参数获取,例如访问路径为/anno/requestParam?id=100
    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(String id,HttpServletRequest request){
        return "url: "+request.getRequestURL()+" can access,id:"+id;
    }

    //参数为对象,例如访问路径为/anno/obj?id=100&name=ouyqy
    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")
    @ResponseBody//用在方法上
    public String passObj(DemoObj demoObj,HttpServletRequest request){
        return "url: "+request.getRequestURL()+" can access,demoObj id:"+demoObj.getId()
                +" demoObj name:"+demoObj.getName();
    }

    //映射不同的路径到相同的方法,访问路径为/anno/name1或/anno/name2
    @RequestMapping(value = {"/name1","name2"},produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url: "+request.getRequestURL()+" can access";
    }


}
