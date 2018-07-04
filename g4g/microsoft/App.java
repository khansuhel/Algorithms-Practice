package com.practice.g4g.microsoft;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.calc();
    }

    public void calc(){

        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());
        int[] out = new int[totalCases];
        sc.next();
        while (totalCases!=0){
            int inputLength = Integer.parseInt(sc.nextLine());
            int[] input = new int[inputLength];
            int smallest = 0;
            int largest = 0;
            for(int i =0;i<inputLength;i++){
                input[i] = sc.nextInt();
                if(input[i]>input[largest])
                    largest = i;
                if(input[i]<input[smallest] && i<largest)
                    smallest = i;
            }
            out[totalCases-1]=(input[largest] - input[smallest]);
            totalCases--;
        }
        int len = out.length;
        while (len!=0){
            System.out.println(out[len-1]);
            len--;
        }
    }
}
