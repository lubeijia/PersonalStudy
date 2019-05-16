package com.wy.regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: PersonalStudy
 * @description:
 * @author: Wuyong
 * @create: 2019-05-16 11:06
 **/
public class TestPattern {
    public static void main(String[] args) {
        String CarPlateNo = "UNknown";
//        Pattern pat = Pattern.compile("(unkown)*(未知)*(无)*\\S*", Pattern.UNICODE_CASE);

        Pattern pat = Pattern.compile("((unknown)|(未)|(无))*\\S*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pat.matcher(CarPlateNo);
        System.out.println(matcher.matches());
    }
}
