package com.practice.java.concurrency;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Long> {

    private Long input;

    FactorialCalculator(Long input){
        this.input = input;
    }

    private Long calcFactorial(Long input){
        if(input==0)
            return (long)1;
        return input * calcFactorial(input - 1);
    }

    @Override
    public Long call() throws Exception {
        return calcFactorial(input);
    }
}
