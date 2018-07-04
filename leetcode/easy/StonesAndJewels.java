package com.practice.leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StonesAndJewels {

    void check(String J, String S) {
        int finalCount = 0;
        Map sMap = new HashMap<Character, Integer>();
        char[] sChars = S.toCharArray();
        for (char c : sChars) {
            if (!sMap.containsKey(c))
                sMap.put(c, 1);
            else {
                int count = (int) sMap.get(c)+1;
                sMap.put(c, count);
            }
        }

        for (int i = 0; i < J.length(); i++) {
            if (sMap.containsKey(J.charAt(i))){
                int localCount = (int)sMap.get(J.charAt(i));
                finalCount = finalCount + localCount;
            }

        }

        System.out.println(finalCount);
    }

    public static void main(String[] args) {
        StonesAndJewels stonesAndJewels = new StonesAndJewels();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String input  = st.nextToken();

        stonesAndJewels.check("zz", "ZZ");
    }
}
