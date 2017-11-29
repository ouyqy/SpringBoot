package com.avalon.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * @Author ouyqy
 * @date 2017/11/21 16:14
 */
public class JNA {
    public interface testDLL extends Library{
        testDLL instance = (testDLL) Native.loadLibrary((Platform.isWindows()?"msvcrt":"c"),testDLL.class);
        void printf(String format,Object... args);
    }

    public static void main(String[] args){
        testDLL.instance.printf("yyyyMMdd");
    }
}
