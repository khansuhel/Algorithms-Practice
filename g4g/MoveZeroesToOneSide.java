package com.practice.g4g;

import java.util.Scanner;

public class MoveZeroesToOneSide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        while (noOfTestCases!=0){
            int len = sc.nextInt();
            String input = sc.nextLine();
            String[] c = input.split(",");
            int i = len - 1;
            for(int j =i-1 ; j>-1 ; j--){
                int val = Integer.parseInt(c[j].trim());
                if(val==0){
                    String temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                    i++;
                }
            }
            for(String s: c){
                System.out.println(s+" ");
            }
            //System.out.println(input);
            noOfTestCases--;
        }
    }



}
