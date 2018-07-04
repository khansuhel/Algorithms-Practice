package com.practice.g4g.soroco;

public class RangeGenerator {

    static String solution(int[] array) {
        StringBuffer s = new StringBuffer();

        for (int i = 0; i< array.length; ) {
            int j = i;
            while (j + 1 < array.length) {
                if (array[j + 1] - array[j] == 1) {
                    j++;
                } else {
                    break;
                }
            }
            if (j - i >= 2) {
                if(s.length()==0){
                    s.append(array[i]+"-"+array[j]);
                }else{
                    s.append(",").append(array[i]+"-"+array[j]);
                }
                i=j+1;
            } else {
                if (s.length() == 0) {
                    s.append(array[i]);
                } else {
                    s.append(",");
                    s.append(array[i]);
                }
                i++;
            }
        }
        return s.toString();

    }

    public static void main(String[] args) {
        String out = solution(new int[]{
                -3,
                -2,
                -1,
                5,
                6,
                7,
                9,
                11,
                12,
                13,
                15,
                16});
        System.out.println(out);
    }

}
