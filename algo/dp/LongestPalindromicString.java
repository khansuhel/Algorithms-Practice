package com.practice.algo.dp;

public class LongestPalindromicString {
    char[] input;

    public String longestPalindrome(String s) {
        String palindrome=null;
        String longestString = null;
        input = s.toCharArray();

        int minlen = 0;

        for(int i =0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                if(check(i,j)){
                    palindrome = s.substring(i,j+1);
                    if(palindrome.length()>minlen){
                        minlen = palindrome.length();
                        longestString = palindrome;
                    }
                    break;
                }
            }
        }
        return longestString;
    }

    boolean check(int i, int j){
        if(input.length==1 || i==j || j<i)
            return true;
        return (input[i]==input[j]) && check(i+1,j-1);
    }

    public static void main(String[] args) {
        LongestPalindromicString lps = new LongestPalindromicString();
        System.out.println(lps.longestPalindrome("bb"));
    }
}
