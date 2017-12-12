package com.avalon.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author ouyqy
 * 2017/12/12 11:10
 */
public class WsdlTest {

    public static void main(String[] args){

        System.err.println(
                "1.生成客户端调用方式\n" +
                "(1)、开发步骤\n" +
                "A、wisimport生成客户端代码\n" +
                "B、创建服务视图\n" +
                "C、获取实现类\n" +
                "D、调用查询方法");

        WebServiceWSDLController2Service service = new WebServiceWSDLController2Service();
        WebServiceWSDLController2 wsdlController2 = service.getWebServiceWSDLController2Port();
        String str = wsdlController2.returnString("ouyqy","123@163.com");
        System.out.println(str+"\n");

        serviceClient();

        HttpURLConnection();
    }

    /**
     * service编程实现调用
     */
    public static void serviceClient(){
        System.err.println("2.service编程实现调用\n" +
                "(1)、开发步骤\n" +
                "A、wisimport生成客户端代码\n" +
                "B、使用serivce类创建服务视图\n" +
                "C、获取服务实现类\n" +
                "D、调用查询方法");
        try {
            //创建WSDL地址，不是服务地址
            URL url = new URL("http://localhost:9090/webservice/WebServiceWSDLController2?wsdl");

            //创建服务名称
            //1. namespaceURI - 命名空间地址 (对应xml <definitions></definitions>标签里的targetNamespace)
            //2. localPart - 服务名称  (对应xml<sevice></service> 标签里的name)
            QName qName = new QName("http://webservice.avalon.com/","WebServiceWSDLController2Service");

            //service 创建视图
            //参数：
            //1. wsdlDocumentLocation - 使用说明书地址
            //2. serviceName - 服务名称
            Service service = Service.create(url,qName);

            //获取实现类
            WebServiceWSDLController2 controller2 = service.getPort(WebServiceWSDLController2.class);

            //调用对象的方法
            String request = controller2.returnString("abc","abc@163.com");
            System.out.println(request+"\n");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * HttpURLConnection调用方式
     */
    public static void HttpURLConnection(){
        System.err.println("3.HttpURLConnection调用方式" +
                "(1)、开发步骤\n" +
                "A、创建服务地址\n" +
                "B、打开服务地址的一个连接\n" +
                "C、设置连接参数\n" +
                "D、组织SOAP协议数据，发送给服务器\n"+
                "E、接收服务端的响应");

        try {
            //1:创建服务地址
            URL url = new URL("http://localhost:9090/webservice/WebServiceWSDLController2");

            //2;打开到服务地址的一个连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //3:设置连接参数
            //3.1设置发送方式：POST必须大写
            connection.setRequestMethod("POST");
            //3.2设置数据格式：Content-type
            connection.setRequestProperty("content-type","text/xml;charset=utf-8");
            connection.setRequestProperty("soapActionString","http://webservice.avalon.com/returnString");
            //3.3设置输入输出，新创建的connection默认是没有输出（output）权限的,只有输入（input）权限。
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //4:组织SOAP协议数据，发送给服务端
            String soapXML = getXml("test","test@163.com");
            OutputStream os = connection.getOutputStream();
            os.write(soapXML.getBytes());

            //5:接收服务端响应
            int responseCode = connection.getResponseCode();
//            System.out.println(soapXML);
//            System.out.println("status:"+responseCode);
            System.out.println(connection.getResponseMessage());
            if(200 == responseCode){//表示服务端响应成功
                InputStream in = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);

                StringBuilder sb = new StringBuilder();
                String temp = null;

                while((temp = br.readLine())!=null){
                    sb.append(temp+"\n");
                }

                System.out.println(sb.toString());

                in.close();
                isr.close();
                br.close();
            }
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getXml(String name,String email){

        String data = "<soapenv:Envelope xmlns:soapenv=" +
                "\"http://schemas.xmlsoap.org/soap/envelope/\" " +
                "xmlns:q0=\"http://webservice.avalon.com/\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
                "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                    +"<soapenv:Body>"
                        +"<q0:returnString>"
                            +"<arg0>"+name+"</arg0> "
                            +"<arg1>"+email+"</arg1> "
                        +"</q0:returnString>"
                    +"</soapenv:Body>"
                +"</soapenv:Envelope>";

        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:q0=\"http://webservice.avalon.com/\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                    +"<soap:Body>"
                        +"<q0:returnString>"
                            +"<arg0>"+name+"</arg0>"
                            +"<arg1>"+email+"</arg1>"
                        +"</q0:returnString>"
                    +"</soap:Body>"
                +"</soap:Envelope>";

        return soapXML;
    }
}
