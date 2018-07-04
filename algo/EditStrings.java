package com.practice.algo;

public class EditStrings {

    public void tellMeTheEditsRequired(String str1, String str2) {
        int[][] temp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i < temp[0].length; i++) {
            temp[0][i] = i;
        }
        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = i;
        }

        for(int i=1;i<str1.length();i++){
            for(int j=1;j<str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    temp[i][j] = temp[i-1][j-1];
                }else {
                    temp[i][j] = 1+ min(temp[i-1][j],temp[i][j-1],temp[i-1][j-1]);
                }
            }
        }

        tellMeActualEdits(temp,str1,str2);
    }

    private void tellMeActualEdits(int[][] temp, String str1, String str2){

        int i = temp[0].length-1;
        int j = temp.length-1;

        while (true){
            if(i==0 || j==0) {
                break;
            }
            if(temp[i][j]==temp[i-1][j-1]){
                i--;
                j--;
            }else if(temp[i][j] == temp[i-1][j-1]+1){
                System.out.println("Change "+temp[i][j]+" in String 2 to "+temp[i-1][j-1]);
                i--;j--;
            }else if(temp[i][j] == temp[i-1][j]+1){
                System.out.println("Delete "+temp[i-1][j]+" in String 1.");
                i--;
            }else if(temp[i][j] == temp[i][j-1]+1){
                System.out.println("Delete "+temp[i][j-1]+" in String 2.");
                j--;
            }else {
                throw new IllegalArgumentException("That Nonsense!");
            }
        }


    }

    private int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }

    public static void main(String[] args) {
        EditStrings es = new EditStrings();
        es.tellMeTheEditsRequired("suhel","fuhel");
    }

}
