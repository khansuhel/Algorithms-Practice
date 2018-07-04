package com.practice.algo;

public class MinSubArrWithMaxSum {



    public int maxProduct(int[] nums){
        int i =0;
        Integer product = null;
        Integer posProd = null;
        Integer max_prod= null;
        while(i<nums.length){
            if(nums[i]==0){
                max_prod = retMax(nums[i],max_prod);
                product = null;
                posProd = null;
            }
            else{
                if(nums[i]>0){
                    posProd = checkVal(posProd) * nums[i];
                    max_prod = retMax(max_prod, posProd);
                }
                product = checkVal(product) * nums[i];
                max_prod = retMax(max_prod, product);
                if(product<0){
                    posProd = null;
                }
            }
            i++;
        }
        return max_prod;
    }

    int checkVal(Integer a ){
        if (a==null)
            return 1;
        else
           return a.intValue();

    }

    public Integer retMax(Integer a, Integer b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a>b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        MinSubArrWithMaxSum minSubArrWithMaxSum = new MinSubArrWithMaxSum();
        int res = minSubArrWithMaxSum.maxProduct(new int[]{2,-5,-2,-4,3});
        System.out.println(res);
    }
}
