package com.avalon.java.access;

/**
 * @Author ouyqy
 * 2018/4/16 11:23
 */
public class AccessTest {

    public static void main(String[] args){
        String var1 = System.getProperty("java.version");
        System.out.println(var1);
        boolean useJAWT_DLL = var1.compareTo("1.4.1")>0;
        System.out.println(useJAWT_DLL);
        System.out.println(var1.compareTo("1.4.1"));
        String path = System.getProperty("java.library.path");
        System.out.println(path);

        String tomcat = "C:\\Program Files\\apache-tomcat-8.0.35";
        String tomcat1 = "C:\\Program Files\\apache-tomcat-8.0.35";

        System.out.println(tomcat.compareTo(tomcat1));

        String version01 = "1.4";
        String version02 = "1.21";
        String version03 = "1.41";
        String version04 = "2.10";

        System.out.println(version01.compareTo(version02));
        System.out.println(version01.compareTo(version03));
        System.out.println(version01.compareTo(version04));

        System.out.println("888Aaa".compareTo("888a"));

        System.out.println(Integer.TYPE);
    }

}
