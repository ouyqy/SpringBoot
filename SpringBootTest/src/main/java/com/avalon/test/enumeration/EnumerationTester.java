package com.avalon.test.enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Author ouyqy
 * 2017/12/20 13:27
 */
public class EnumerationTester {

    public static void main(String[] args){
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        Vector<String> vector = (Vector<String>) dayNames.clone();
        for(String string : vector){
            System.err.println(string);
        }

        String oldvalue = dayNames.set(0,"Sunday_001");
        System.out.println("oldValue:"+oldvalue);
        Iterator<String> iterator = dayNames.iterator();
        int i = 0;
        while (iterator.hasNext()){
            System.out.println((i++)+":"+iterator.next());
        }
        vector.add("0000000001");
        for(String string : vector){
            System.err.println("2:"+string);
        }
        for(String string : dayNames){
            System.err.println("dayNames:"+string);
        }

        vector.retainAll(dayNames);
        for(String string : vector){
            System.err.println("3:"+string);
        }

        vector.addAll(dayNames);
        for(String string : vector){
            System.err.println("4:"+string);
        }
    }
}
