package com.avalon.test.zhenze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ouyqy
 * 2017/12/13 16:14
 */
public class Main {

    public static void main(String[] args){
        String str = "1a2B3c4D5e6F";
        //^[a-zA-Z\d_]{6,12}$
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])[\\d\\D]{6,12}$");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
