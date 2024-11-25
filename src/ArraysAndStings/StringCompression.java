package ArraysAndStings;

import java.util.*;

public class StringCompression {

    public static void main(String[] args) {

        System.out.println(StringCompression("aabcccccaaa"));  // a2b1c5a3
        System.out.println(StringCompression("abcdef"));       // abcdef
        System.out.println(StringCompression("aaabbbccc"));    // a3b3c3
        System.out.println(StringCompression("zzzzz"));        // z5
        System.out.println(StringCompression("aabbbcccccddd"));// a2b3c5d3
        System.out.println(StringCompression("aabccddee"));    // a2b2c2d2e2
        System.out.println(StringCompression("aabbccdd"));     // aabbccdd
        System.out.println(StringCompression(""));             // ""
        System.out.println(StringCompression("a"));            // a
        System.out.println(StringCompression("AaaBBccDD"));    // A1a2B2c2D2
        System.out.println(StringCompression("abababab"));     // abababab
        System.out.println(StringCompression("aaaabbbccccddddeeeeffffgggg")); // a4b3c4d4e3f4g4


    }

    public static String StringCompression(String str){

        if (str == null || str.length() == 0) {
            return str;
        }

        List<List<Object>> array = new ArrayList<>();
        int cont = 1;

        for(int i = 0; i < str.length(); i++){

            if(i != str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                cont++;
            }
            else{
                array.add(Arrays.asList(str.charAt(i), cont));
                cont = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.size(); i++){
            List<Object> pair = array.get(i);
            sb.append(pair.get(0));
            sb.append(pair.get(1));
        }
        String compressed = sb.toString();
        if(compressed.length() >= str.length()){
            return str;
        }

        return compressed;
    }

}
