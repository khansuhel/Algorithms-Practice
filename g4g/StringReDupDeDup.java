package com.practice.g4g.soroco;


public class StringReDupDeDup {

    static String deDup(String input, int chunkSize) {

        StringBuilder s = new StringBuilder();
        int chunkNo = 0;
        for (int i = 0; i < input.length(); ) {

            String str = input.substring(i, i + chunkSize);
            int index = s.indexOf(str);
            if (index != -1) {
                s.insert(s.indexOf(",", index), "-" + chunkNo);
            } else {
                s.append(str + "-" + chunkNo + ",");
            }
            chunkNo++;
            i += chunkSize;
        }

        return s.toString();
    }

    static String dedupSequence(String input){
        StringBuilder s  = new StringBuilder();
        for(int i=0;i<input.length();){
            int j=i+1;
            int count=1;
            while (j<input.length()){
                if(input.charAt(j)==input.charAt(i)){
                    count++;
                    j++;
                }else{
                    break;
                }
            }
                s.append(input.charAt(i) + "$" + count);
            i=j;
        }
        return s.toString();
    }

    static String reDupSequence(String input){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<input.length();){
            char c = input.charAt(i);
            int index = input.indexOf("$",i);
            if(index!=-1){
                int times = input.charAt(index+1) - '0';
                while(times!=0){
                    str.append(c);
                    times--;
                }
                i=index+2;
            }else{
                str.append(c);
                i++;
            }
        }
        return str.toString();
    }

    static String reDup(String input, int chunkSize) {
        String[] outArr = new String[input.length()];
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < input.length(); ) {
            String str = input.substring(i, i + chunkSize);
            int chunkIndex = input.indexOf(",", i + chunkSize);
            String[] chunkString = input.substring(i + chunkSize, chunkIndex).split("-");

            for (String s : chunkString) {
                if (s.trim().length() != 0) {
                    outArr[Integer.parseInt(s)] = str;
                }
            }
            i += chunkIndex + 1;
        }

        for (String s : outArr) {
            if (s == null) break;
            out.append(s);
        }

        return out.toString();
    }

    public static void main(String[] args) {

        String out = dedupSequence("aaaaabbdbbbd");
        System.out.println(out);

        String out2 = reDupSequence("a$5b$2d$1b$3d$1");
        System.out.println(out2);

        String dedupStr = deDup("abcdexyzvwabcde", 5);
        System.out.println(dedupStr);
        System.out.println(reDup(dedupStr, 5));
    }

}
