package com.avalon.runtime;

/**
 * @Author ouyqy
 * 2017/12/1 11:12
 * freeMemory:挖过来的内存里没有用上的内存，一般来说，这个值是比较小的
 *
 * totalMemory:java虚拟机现在从操作系统那里挖过来的内存的大小，也就是java虚拟机这个进程当时所占的所有内存
 * （如果没有Xmx参数，java程序运行的过程，内存总是慢慢的从操作系统那里挖的，基本是用多少挖多少）
 * （如果添加了Xmx参数，则以这个参数的值为准，从操作系统那里直接挖这么多内存过来，在这些内存用的差不多的时候，再去挖）
 *
 * maxMemory:java虚拟机在默认情况下从操作系统那里挖到的最大内存（如果添加了Xmx参数，则以这个参数后面的值为准），以字节为单位
 *
 */
public class MainRuntime {
    public static void main(String[] args) {
        System.out.println("free:" + Runtime.getRuntime().freeMemory() / 2014 / 1024);
        System.out.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println("=================================");

        long t = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] aaa = new String[2000000];
        System.out.println("free:" + Runtime.getRuntime().freeMemory() / 2014 / 1024);
        System.out.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println("=================================");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 2000000; i++) {
            aaa[i] = new String("aaa");
        }

        System.out.println("free:" + Runtime.getRuntime().freeMemory() / 2014 / 1024);
        System.out.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println("=================================");

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
