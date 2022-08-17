package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<1000; i++){
            list.add((int) (Math.random()*1000+100));
        }
        List<String> newList = list.stream()
                .filter( (n) -> n%7==0)
                .map((n) -> "Number: "+n)
                .filter((n) -> n.endsWith("0"))
                .map((n) -> n+"!")
                .collect(Collectors.toList());

        runIt();

    }

    private static void runIt(){
        List<Integer> nums = new ArrayList<>(1000);
        for (int i=0; i<1000; i++){
            nums.add((int) (Math.random()*100 + 100));
        }
        List<String> list = nums.stream()
                .filter((n) -> n%2==0 && n%5==0 )
                .map(Math::sqrt) // (n) -> Math.sqrt(n) - просто проброс параметра
                .map((n) -> "Корень: "+n)
                .collect(Collectors.toList());

        for (String str : list){
            System.out.println(str);
        }
    }

}