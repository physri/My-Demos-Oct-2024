package com.in28minutes.springboot.basics.springbootin10steps.java8demos;

import java.util.*;
import java.util.stream.Collectors;

public class Test3454 {
    public static void main(String[] args) {
        //String name = "SRIKUMAR IYER";
        //char[] names = name.toCharArray();
        //Stream opt = Stream.of(names);
        //Stream.of(names).filter(x -> x.toString().mat)
        //Set<Character> myChars = new HashSet<>();
        //Stream.of(names).filter(x -> !myChars.add()).count();
        int i = 1234;
        char[] x = String.valueOf(i).toCharArray();
        int out = 0;
//        Stream.of(i).filter(x -> x.toString().split())
//                forEach(System.out::print);
        List<Integer> nums = Arrays.asList(45, 23, 11, 88, 100, 1, 3, 5, 10, 21, 18);
        Long numsCount = nums.stream().collect(Collectors.counting());
        System.out.println("nums count => " + numsCount);
        IntSummaryStatistics summarizingInt = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("IntSummaryStatistics for nums list is => " + summarizingInt);
        seperateOddEvenNums(nums);
        List<String> myWordList = Arrays.asList("Srikumar", "Lakshmi", "Adhrith", "Radha", "Shanthi", "Ayyappan", "Sriram", "Sivaram", "Srikumar", "Adhrith");
        //mapping - maps based on the length & returns the list of lengths
        System.out.println("map & collect lengths of my word list ==> "+myWordList.stream().collect(Collectors.mapping(String::length, Collectors.toList())));
        //mapping - overwrites the mapping & returns only the count of each elem
        System.out.println("count of myWordList ==> "+myWordList.stream().collect(Collectors.mapping(String::length, Collectors.counting())));
        //collect / counting/ returns the total count only
        System.out.println("alternate way :::: count of myWordList ==> "+myWordList.stream().collect(Collectors.counting()));
        //joining based on delimter/ prefix/ suffix
        System.out.println("joining => by comma ::: "+myWordList.stream().collect(Collectors.joining(":::", "$", "#")));
        //groupingBy - eg: group by length & count of each elem & return map
        System.out.println(myWordList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        //filtering - eg: f & c only the even nums
        //facing compilationg issue => Usage of API documented as @since 9+
        //List<Integer> myEvenNums = nums.stream().collect(Collectors.filtering(num -> num%2==0, Collectors.toList()));
        //collectingAndThen() - eg: coll. a stream of strings into a Set & return its count
        int myWordsCount = myWordList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
        Set<String> myWordSet = new HashSet<>();
        System.out.println("using mapping to filter WORDS for dupes & return as list =>"+myWordList.stream().collect(Collectors.mapping(word -> myWordSet.add(word), Collectors.toList())));
        System.out.println("collectingAndThen - c as Set & return size only => "+myWordsCount);
        //collect the lengths of all strings & return their sum
        int totalSumWords = myWordList.stream().collect(
                Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue))
        );
        System.out.println("total Sum Of Length of the Words ==> "+totalSumWords);
        List<Product> myProducts = new ArrayList<>();
//        myProducts.add(Product.builder().productId(100201l).productName("Logitech Keyboard").productPrice(1500l).build());
//        myProducts.add(Product.builder().productId(100201l).productName("Logitech Keyboard").productPrice(1500l).build());
        Product myProduct1 = new Product();
        myProduct1.setProductName("Logitech Keyboard");
        myProduct1.setProductPrice(1500L);
        myProduct1.setProductId(457L);
        myProducts.add(myProduct1);
        Order myOrder1 = new Order();
        myOrder1.setOrderId(100254L);
        myOrder1.setProductList(myProducts);
        List<Order> orderList = new ArrayList<>();
        orderList.add(myOrder1);
//        orderList.add(Order.builder().orderId(145l).productList(myProducts).build());
//        orderList.add(Order.builder().orderId(159l).productList(myProducts).build());
        //find unique product names from the list of orders
//        orderList.stream().collect()
    }

    public static void seperateOddEvenNums(List<Integer> nums) {
        //seperate odd & even nums from given int[]
/*        System.out.println(
            nums.stream().collect(
                    Collectors.partitioningBy(num -> num%2==0)
            )
        );*/
        Map<Boolean, List<Integer>> results =
                nums.stream()
                        .collect(
                                Collectors.partitioningBy(num -> num % 2 == 0)
                        );
        System.out.println("TRUE list => " + results.get(true));
        System.out.println("FALSE list => " + results.get(false
        ));
    }
}