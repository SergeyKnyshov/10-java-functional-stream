package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {

        /*
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
        */
        for(int i = 0; i < 30; i++){
            System.out.printf(Integer.toString((int) (i % Math.pow(2,2))));
        }
    }

    public static IntStream cycleGrayCode(int n){

        if(n >= 1 && n <= 16){
            return  IntStream.iterate(0, x -> x + 1)
                    .map(x ->(int) (x % Math.pow(2,n)))
                    .map(x -> x ^ (x >> 1));
        }else{
            throw new IllegalArgumentException("Wrong format");
        }
        // your implementation here

    }

}
