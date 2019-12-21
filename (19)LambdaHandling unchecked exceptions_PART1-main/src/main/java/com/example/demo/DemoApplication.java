package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(3,9,7,0,10,20);
    integers.forEach(lambdaWrapper(i -> (System.out.println(50 / i)));
    }

    private static Consumer<Integer> lambdaWrapper(Consumer<Integer> cunsumer) {
        return i->{
            try {
                cunsumer.accept(i);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occured:"+e.getMessage());
            }
        };
    }
}
