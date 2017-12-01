package com.avalon.test.main;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ouyqy
 * 2017/12/1 16:55
 */
public class TestClass {
    public static void main(String[] args){

        //isAssignableFrom 判断class是否与参数clazz相同，或class是clazz的父类或接口
        //class.isAssignableFrom(Class<?> clazz)
        if(List.class.isAssignableFrom(ArrayList.class)){
            System.out.println("list is assignable from ArrayList");
        }

        if(ArrayList.class.isAssignableFrom(List.class)){
            System.out.println("ArrayList is assignable from List");
        }

        //instanceof 判断一个实例是否是一个类或接口的或其子类子接口的实例
        // oo instanceof TypeName
        String str = "";
        System.out.println("str instanceof Object="+(str instanceof Object));
        Object object = new Object();
        System.out.println("object instanceof Object="+(object instanceof Object));

        //asSubclass 将调用这个方法的class对象转换成由clazz参数所表示的class对象的某个子类
        //Class.forName(xxx.xx.xx).asSubclass(List.class).newInstance();
        List<String> asList = new ArrayList<String>();
        System.out.println(asList.getClass());
        Class<? extends List> asList_cast = asList.getClass().asSubclass(List.class);
        System.out.println(asList_cast);
        String str1 ="";
        try {
            System.out.println(str1.getClass().asSubclass(Object.class).newInstance().getClass());

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Class clazz = Thread.currentThread().getContextClassLoader().loadClass("java.lang.String");
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
