import java.util.HashMap;

public class CheckPermutation {

    public static void main(String[] args) {

        System.out.println("POSITIVOS:");
        checkPermutation("", "");
        checkPermutation("a", "a");
        checkPermutation("abc", "abc");
        checkPermutation("abc", "cab");
        checkPermutation("aabbcc", "bbaacc");
        checkPermutation("a b c", "c b a");
        checkPermutation("a@b#c!", "!c@b#a");
        checkPermutation("!!aa@@bb", "a@b!b!a@");
        checkPermutation("AaBbCc", "bBcCaA");

        System.out.println("NEGATIVOS:");
        checkPermutation("abc", "ab");
        checkPermutation("abc", "abd");
        checkPermutation("aabbcc", "aabbc");
        checkPermutation("abc", "abcc");
        checkPermutation("abc", "ABC");
        checkPermutation("aaaaabbbbbccccc", "aaaabbbbccccd");
        checkPermutation("aabb", "abcc");




    }

    public static boolean checkPermutation(String str1, String str2) {

        /*
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);
        for(int i = 0; i < str1.length(); i++){
            if(arrStr1[i] != arrStr2[i]){
                System.out.println("F");
                return false;
            }
        }
        System.out.println("T");
        return true;
        */

        if(str1.length() != str2.length()){
            System.out.println("F");
            return false;
        }

        int cont = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str1.length(); i++){
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for(int i = 0; i < str2.length(); i++){
            if(map.containsKey(str2.charAt(i)) && map.get(str2.charAt(i)) != 0){
                cont++;
            }
        }

        if(cont == str1.length()){
            System.out.println("T");
            return true;
        }

        System.out.println("F");
        return false;

    }

}
