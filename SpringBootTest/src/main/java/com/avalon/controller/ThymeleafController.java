package com.avalon.controller;

import com.avalon.bean.TestValueBean;
import com.avalon.bean.TestValueLocalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author ouyqy
 * @date 2017/11/10.
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @Autowired
    private TestValueLocalBean testValueLocalBean;

    @Value("${server.context-path}")
    private String contextPath;

    /**
     * 返回html模板
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","ouyqy_world");
        model.addAttribute("testValueLocalBean",testValueLocalBean);
        model.addAttribute("num",new Random().nextInt(100));
        model.addAttribute("getHelloUrl","<a href='"+contextPath+"/'>GO TO HELlO...</a>");
        model.addAttribute("id","a286f933-42ee-4e52-a15e-e0505a72920a");
        model.addAttribute("value","value@333(⊙o⊙)…");
        model.addAttribute("style","border:1px solid red;background-color:black;width:100px;height:100px");
        model.addAttribute("onclick","document.getElementById('click233').innerHTML='(⊙o⊙)…'");

        List<TestValueBean> list = new ArrayList<TestValueBean>();
        for(int i =0;i<10;i++){
            TestValueBean testValueBean = new TestValueBean();
            testValueBean.setName("name@index-"+i);
            testValueBean.setPassword("password@index"+i);
            list.add(testValueBean);
        }
        model.addAttribute("list",list);
        return "thymeleaf";
    }
}
