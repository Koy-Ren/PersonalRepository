package com.koy.demo;

import java.util.regex.Pattern;

public class RegularDemo {
    public static void main(String[] args){
        String content = "Koy Ren 25";
        String partten = ".*Ren.*";
        boolean isMatch = Pattern.matches(partten, content);
        System.out.println(isMatch);
    }
}
