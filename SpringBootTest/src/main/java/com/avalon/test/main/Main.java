package com.avalon.test.main;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * Created by ouyqy on 2017/11/8.
 */
public class Main {
    public static void main(String[] args) {
        //获取加载类列表
//        List<ApplicationListener> loadFactories = SpringFactoriesLoader.loadFactories(ApplicationListener.class, null);
//
//        System.out.println(loadFactories.size());//长度
//        for(ApplicationListener app : loadFactories){
//            System.out.println(app.getClass().getName());//加载类名称
//        }

        try {

//            String endpoint = "http://localhost:3000/hy/gw/queryConsignOrder?wsdl";
            String endpoint = "http://60.191.102.221:8096/webServiceZJ/ChooseSLRYPort?wsdl";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            // WSDL里面描述的接口名称(要调用的方法)
//            call.setOperationName("getChooseSLRYPort");
            // 接口方法的参数名, 参数类型,参数模式  IN(输入), OUT(输出) or INOUT(输入输出)
//            call.addParameter("证书编号", XMLType.XSD_STRING, ParameterMode.IN);
//            call.addParameter("验证信息", XMLType.XSD_STRING, ParameterMode.IN);
//            call.addParameter("consignOrderNo", XMLType.XSD_STRING, ParameterMode.IN);
//            call.addParameter("orderNo", XMLType.XSD_STRING, ParameterMode.IN);
            // 设置被调用方法的返回值类型
//            call.setReturnType(XMLType.XSD_STRING);
            //设置方法中参数的值
//            Object[] paramValues = new Object[] {"4PL","NJHY,NJHF","TC201309172206",""};
            Object[] paramValues = new Object[] {"浙交安A(17)G00223","slry_qycx"};

            // 给方法传递参数，并且调用方法
//            String result = (String) call.invoke(paramValues);
            String result = (String) call.invoke(paramValues);

            System.out.println("result is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
