package com.practice.g4g.soroco;

public class StringCoDec {

    static String dedup(String inputStr, int chunkSize) {
        int chunks = 0;
        StringBuilder dedup = new StringBuilder();
        for(int i = 0; i< inputStr.length();){
            String str = inputStr.substring(i,i+chunkSize);
            if(dedup.indexOf(str) != -1){
                int ind = dedup.indexOf(str);
                dedup.insert(dedup.indexOf(",", ind), "-"+chunks);
            }
            else{
                dedup.append(str+"-"+chunks+",");
            }
            chunks++;
            i+=chunkSize;
        }

        return dedup.toString();
    }

    static String redup(String deduplicatedStr, int chunkSize) {
        StringBuilder retString = new StringBuilder();
        String[] outArray = new String[deduplicatedStr.length()];

        for(int i = 0; i< deduplicatedStr.length();) {
            String str1 = deduplicatedStr.substring(i, i + chunkSize);


            int chunkIndex = deduplicatedStr.indexOf(",",i+chunkSize);
            String[] indexes = deduplicatedStr.substring(i+chunkSize, chunkIndex).split("-");

            for(String s : indexes){
                if(s.trim().length()!=0){
                    outArray[Integer.parseInt(s)]=str1;
                }
            }
            i=chunkIndex+1;
        }

        for(String s: outArray){
            if(s!=null)
            retString.append(s);
        }

        return retString.toString();
    }

    public static void main(String[] args) {
        String input = "aaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbcccccccccc";
        String dedupStr = dedup(input, 10);
        System.out.println(dedupStr);
        System.out.println(input);
        String reDup = redup(dedupStr, 10);
        System.out.println(reDup);

        System.out.println(input.equalsIgnoreCase(reDup));
    }
}