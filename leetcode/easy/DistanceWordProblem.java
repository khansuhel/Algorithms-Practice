package com.practice.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class DistanceWordProblem {

    void finShortestDistance(List<String> words, String a, String b) {

        int state = 0;
        int previous = 0;
        int distance = Integer.MAX_VALUE;
        int i = 0;
        while (i < words.size()) {
            String found = words.get(i);
            if (found.equals(a) || found.equals(b)) {
                if (state == 0) {
                    state = found.equals(a) ? 1 : 2;
                    previous = i;
                } else if (state == 1) {
                    if(found.equals(b)){
                        if (distance > i - previous) {
                            distance = i - previous;
                        }
                    }
                    previous = i;
                }else if(state==2){
                    if(found.equals(a)){
                        if (distance > i - previous) {
                            distance = i - previous;
                        }
                    }
                    previous = i;
                }
            }
            i++;
        }

        System.out.println("The shortest distance is : "+distance);

    }

    public static void main(String[] args) {
        DistanceWordProblem distanceWordProblem = new DistanceWordProblem();
        distanceWordProblem.finShortestDistance(Arrays.asList(new String[]{"suhel","is","the","an","suhel","khan"}),"suhel","khan");
    }

}
