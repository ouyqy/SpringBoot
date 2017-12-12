package com.avalon.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Author ouyqy
 * 2017/12/12 10:19
 */
@WebService
public class WebServiceWSDLController {

    /**
     * 供客户端调用的方法
     * @param name
     * @return
     */
    public String getValue(String name){
        return "hello "+name;
    }

    public static void main(String[] args){
        /*
        * 用于发布服务器 端口可任意（必需是未占用的），第二个参数new的为本类的类名
        * */
        Endpoint.publish("http://localhost:8080/service/test",new WebServiceWSDLController());
        System.out.println("service success");
    }
}
