package com.avalon.test.math;



/**
 * @Author ouyqy
 * 2017/12/25 17:29
 */
public class Math {
    public static void main(String[] args){
        int a = 123;
        int b = 321;
        System.out.println("a|b="+(a|b));//按位或，计算二进制，a或b只要有一个是1，那么a的值就是1
        System.out.println("a&b="+(a&b));//按位与，计算二进制，a和b的值都为1，a的最终结果才为1
        System.out.println("a^b="+(a^b));//按位异或，计算二进制，当且仅当a和b的值不一致时，a的最终结果才为1，否则为0

//        char[] values = new StringTest().valueaa;
//        System.out.println("values="+values);
//        System.out.println("string="+new String("123").toCharArray());
//
//        char[] chars = new char[]{'a','b','c','d','e','f'};
//        System.out.println(new String(chars,1,5));
//        System.out.println(new String(chars,5,1));
//
//        System.out.println(">>>:"+(65535>>>16==0));
//        System.out.println(">>>:"+(100000000>>>16));
//        System.out.println(">>>:"+Integer.parseInt("10111110101",2));
//        System.out.println(">>>:"+Integer.parseInt("11111111111",2));
//        System.out.println(">>>:"+Integer.parseInt("111111111111111",2));

//        System.out.println("1111111111111111111111111111111".length());
//        System.out.println(">>>:"+(Integer.MAX_VALUE>>>16==0));
//        System.out.println(">>>:"+(Integer.MAX_VALUE>>>16));
//        System.out.println(java.lang.Math.pow(2,16));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE>>>16));

//        System.out.println(Integer.toBinaryString(100000000));
//        System.out.println(Integer.toBinaryString(19950826));
//        System.out.println(Long.toBinaryString(Long.MAX_VALUE).length());

//        System.out.println(Character.MIN_LOW_SURROGATE);
//        System.out.println(Character.MIN_SUPPLEMENTARY_CODE_POINT);
//        System.out.println(Character.MIN_HIGH_SURROGATE);
//        System.out.println(Character.lowSurrogate(100));
//        System.out.println(Character.toSurrogates(100, new char[2]{'c','b'}, 1));
//        System.out.println('A'&'A');
//        System.out.println("0xff="+0xff);
//        System.out.println(Byte.MAX_VALUE);
//        int inta = 100;
//        System.out.println(java.lang.Math.pow(2,8));
//        System.out.println(inta <<= 8);
//        System.out.println(inta >>= 8);
//        System.out.println(inta & 0xff);
//
//        char d = (char)-1;
//        System.out.println((int)-1&0xff);
//        System.out.println((int)d);
//
//        System.out.println(Integer.toBinaryString(Byte.MAX_VALUE));
        System.out.println(Integer.toBinaryString(0xff));
        System.out.println(0xff);
//        System.out.println(Integer.toBinaryString(127));
//        System.out.println(Integer.toBinaryString(-127));
//
//        System.out.println(Integer.toBinaryString(128));
//        System.out.println(Integer.toBinaryString(-128));
//
//        byte bytetest = 127;
//        System.out.println((byte)(bytetest+(byte) 1));
        byte[] te =new byte[]{1,2,3,4,5,6,7,8,9,0};
        String string = new String(te,0,0,10);
        System.out.println(string);

//        System.out.println(Integer.toBinaryString(Character.MAX_VALUE));
//        System.out.println(Integer.toBinaryString(Character.MIN_VALUE));
//        System.out.println(Integer.toBinaryString(Character.MAX_VALUE).length());
//        System.out.println(java.lang.Math.pow(2,16));

        String str = "Ƶis the set of integers";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(4));
//        System.out.println(str.charAt(5));
        System.out.println(str.codePointAt( 0));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0,5));

        System.out.println(str.offsetByCodePoints(1,4));
        System.out.println(str.codePointCount(0,4));
        char[] chars = new char[23];
        str.getChars(4,str.length(),chars,4);
        System.out.println("chars->");
        System.out.println(chars);

        byte[] bytes = new byte[23];
        bytes = str.getBytes();
        System.out.println(bytes);

        System.out.println(1000<<50);
        System.out.println(1000/50);
    }
}

class StringTest{
    public final char valueaa[];


    public  StringTest(){
        this.valueaa="".toCharArray();
    }
}