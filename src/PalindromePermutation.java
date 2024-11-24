import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String[] args) {

        System.out.println(PalindromePermutation("") + " and expected was true"); // Caso 1: String vazia (esperado: true)
        System.out.println(PalindromePermutation("a") + " and expected was true"); // Caso 2: String com um único caractere (esperado: true)
        System.out.println(PalindromePermutation("aa") + " and expected was true"); // Caso 3: String com dois caracteres iguais (esperado: true)
        System.out.println(PalindromePermutation("ab") + " and expected was false"); // Caso 4: String com dois caracteres diferentes (esperado: false)
        System.out.println(PalindromePermutation("racecar") + " and expected was true"); // Caso 5: Palíndromo clássico (esperado: true)
        System.out.println(PalindromePermutation("taco cat") + " and expected was true"); // Caso 6: String com espaços (esperado: true)
        System.out.println(PalindromePermutation("a man a plan a canal panama") + " and expected was true"); // Caso 7: Palíndromo com espaços e maiúsculas (esperado: true)
        System.out.println(PalindromePermutation("abcde") + " and expected was false"); // Caso 8: Não é permutação de palíndromo (esperado: false)
        System.out.println(PalindromePermutation("aabbcc") + " and expected was true"); // Caso 9: Permutação válida de palíndromo (esperado: true)
        System.out.println(PalindromePermutation("abccba") + " and expected was true"); // Caso 10: Já é um palíndromo (esperado: true)
        System.out.println(PalindromePermutation("madam") + " and expected was true"); // Caso 11: Já é um palíndromo (esperado: true)
        System.out.println(PalindromePermutation("a!a@a") + " and expected was false"); // Caso 12: Com caracteres especiais (esperado: false)
        System.out.println(PalindromePermutation("12321") + " and expected was true"); // Caso 13: Palíndromo com números (esperado: true)
        System.out.println(PalindromePermutation("abccbaX") + " and expected was true"); // Caso 14: Quase palíndromo, mas tem um caractere extra (esperado: true)
        System.out.println(PalindromePermutation("no lemon no melon") + " and expected was true"); // Caso 15: Palíndromo válido com espaços (esperado: true)

    }



    public static boolean PalindromePermutation(String str){

        if(str.length() <= 1){
            return true;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        str = str.replace(" ", "");
        int odd = 0;
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(char c : map.keySet()){
            if(map.get(c) % 2 != 0){
                odd++;
            }
        }
        return odd <= 1;

    }
}
