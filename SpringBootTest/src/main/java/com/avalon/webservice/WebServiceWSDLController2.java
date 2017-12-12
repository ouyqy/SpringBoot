package com.avalon.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Author ouyqy
 * 2017/12/12 11:01
 */
@WebService
public class WebServiceWSDLController2 {

    public String returnString(String name,String email){
        System.out.println("名字:"+name+";邮箱:"+email);
        return "名字:"+name+";邮箱:"+email;
    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:9090/webservice/WebServiceWSDLController2",new WebServiceWSDLController2());
        System.out.println("service success");
    }
}
