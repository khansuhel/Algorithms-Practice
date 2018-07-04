package com.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {
    Set<String> set = new HashSet<>();

    public List<String> letterCasePermutation(String s) {
        letterCasePermutation(s,0);
        return new ArrayList<String>(set);
    }

    void letterCasePermutation(String s, int index){
        if(!set.contains(s))
            set.add(s);
        while(!isAllCapital(s)){
            char[] chars = s.toCharArray();
            for(int i = index;i<chars.length;i++){
                char c = chars[i];
                if(c>=97 && c<=122){
                    int num = (int)c;
                    num = num-32;
                    c = (char)num;
                    chars[i] = c;
                    letterCasePermutation(s = String.valueOf(chars), i+1);
                }else{
                    continue;
                }
            }
        }
    }

    boolean isAllCapital(String input){
        if(input.toUpperCase().equals(input))
            return true;
        return false;
    }

    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        List<String> list = sp.letterCasePermutation("s");

        for(String s : list){
            System.out.println(s);
        }
//        System.out.println(sp.isAllCapital("SUHEL1"));
    }

}
