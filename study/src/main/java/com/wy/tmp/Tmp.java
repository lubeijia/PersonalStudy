package com.wy.tmp;

import java.util.*;

/**
 * @program: PersonalStudy
 * @description:
 * @author: Wuyong
 * @create: 2019-04-16 10:05
 **/
public class Tmp {
    public static void test(){
        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        for(Map.Entry tmp :map.entrySet()){
            System.out.println(tmp.getKey()+"===="+tmp.getValue());
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) {
        Tmp.test();
    }
}
