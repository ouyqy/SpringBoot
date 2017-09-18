package com.avalon.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by ouyqy on 2017/9/18.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //@ExceptionHandler在此定义全局处理,通过@ExceptionHandler的value属性可过滤拦截条件,
    //在此处我们可以看出我们拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    public String exception(Exception exception){
        System.err.println("抛出异常："+exception.getMessage());
        return exception.getMessage();
    }

    //使用@modelAttribute注解将键值对添加到全局,所有注解的@RequestMapping的方法可获得此键值对
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder){
//        webDataBinder.setDisallowedFields("id");
//    }
}
