package labPrograms.program6;

import java.util.Arrays;

public class Lib {
    public static final String extract(String str,int m,int n){
        return str.substring(n,n+m);
    }

    public static int countAWord(String str, String word){

        String[] allWords = str.split(" ");
        int count = 0;
        for (String x: allWords){
            if (x.equals(word))
                count++;
        }
        return count;
    }

    public static String reArrange(String str){

        char[] strChars = str.toCharArray();
        Arrays.sort(strChars); //Arrays is a utility class in java
        return new String(strChars);
    }
}
