package com.practice.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class MorseCodesTransform {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // 97 -> a in ASCII
        int count = 0;
        Set<String> wordSet = new HashSet();

        for(String word: words){
            StringBuilder tempWord=new StringBuilder();
            for(int i =0;i<word.length();i++){
                int pos = (int)word.charAt(i);
                pos = pos - 97;
                tempWord.append(morseCodes[pos]);
            }
            wordSet.add(tempWord.toString());

        }
        return wordSet.size();
    }

    public static void main(String[] args) {
        MorseCodesTransform mct = new MorseCodesTransform();
        String[] input = {"gin", "zen", "gig", "msg"};
        System.out.println(mct.uniqueMorseRepresentations(input));
    }
}
