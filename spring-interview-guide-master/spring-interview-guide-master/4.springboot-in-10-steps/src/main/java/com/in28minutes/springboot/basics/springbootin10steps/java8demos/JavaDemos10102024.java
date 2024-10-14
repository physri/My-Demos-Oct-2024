package com.in28minutes.springboot.basics.springbootin10steps.java8demos;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaDemos10102024 {
    int i;

    public static void main(String[] args) {
        int localVar;
        JavaDemos10102024 mainObj = new JavaDemos10102024();
        System.out.println("printing class level int variable without initializing....==> " + mainObj.i);
        String inputStr = "java 8 prog to count the occurences of each char in the given String!!!";
        Map<String, Long> counters =
                Arrays
                        .stream(inputStr.split(""))
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                )
                        );
        System.out.println("output ==> " + counters);
    }
}