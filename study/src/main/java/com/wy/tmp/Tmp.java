package com.wy.tmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @program: PersonalStudy
 * @description:
 * @author: Wuyong
 * @create: 2019-04-16 10:05
 **/
public class Tmp {
    public static void main(String[] args) {
        String camearIdsString = "1,2,3,4";
        String camearIds = Arrays.asList(camearIdsString.split(",")).stream().map(x -> {
            return ("'" + x + "'");
        }).collect(Collectors.joining(","));
        System.out.println(camearIds);
//        String[] camearIdsArray = camearIdsString.split(",");
//        List<String> camearIdsList =  Arrays.asList(camearIdsString.split(","));
//        List<String> result = new ArrayList<>();
//        result = camearIdsList.stream().map(x->{
//            return ("'"+x+"'");}).reduce(new ArrayList<String>(), new BiFunction<ArrayList<String>, String, ArrayList<String>>() {
//                    @Override
//                    public ArrayList<String> apply(ArrayList<String> strings, String s) {
//                        strings.add(s);
//                        return strings;
//                    }
//                }, new BinaryOperator<ArrayList<String>>() {
//                    @Override
//                    public ArrayList<String> apply(ArrayList<String> strings, ArrayList<String> strings2) {
//                        return null;
//                    }
//                }
//
//        );


//                .reduce(new ArrayList<>(),new BiFunction<new ArrayList<String>(),String,ArrayList<String>>(){
//
//        },new BinaryOperator<ArrayList<String>>(){
//
//        });



//        for(String value:result){
//
//        }
    }
}
