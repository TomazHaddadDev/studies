package ArraysAndStings;

public class OneAway {

    public static void main(String[] args) {



// Casos Limite

        // Casos de Inserção
        System.out.println(OneAway("ple", "pale") + " and expected was true"); // Inserir 'a' no meio (esperado: true)
        System.out.println(OneAway("pal", "pale") + " and expected was true"); // Inserir 'e' no final (esperado: true)
        System.out.println(OneAway("ale", "pale") + " and expected was true"); // Inserir 'p' no começo (esperado: true)

// Casos de Remoção
        System.out.println(OneAway("pale", "ple") + " and expected was true"); // Remover 'a' no meio (esperado: true)
        System.out.println(OneAway("pale", "pal") + " and expected was true"); // Remover 'e' no final (esperado: true)
        System.out.println(OneAway("pale", "ale") + " and expected was true"); // Remover 'p' no começo (esperado: true)

// Casos de Substituição
        System.out.println(OneAway("pale", "bale") + " and expected was true"); // Substituir 'p' por 'b' (esperado: true)
        System.out.println(OneAway("pale", "pall") + " and expected was true"); // Substituir 'e' por 'l' (esperado: true)
        System.out.println(OneAway("pale", "pate") + " and expected was true"); // Substituir 'l' por 't' (esperado: true)

// Casos Negativos (Mais de Uma Edição)
        System.out.println(OneAway("pale", "bake") + " and expected was false"); // Substituir 'p' por 'b' e 'l' por 'k' (esperado: false)
        System.out.println(OneAway("pale", "palesr") + " and expected was false"); // Inserir 'r' e 's' (esperado: false)
        System.out.println(OneAway("pale", "plem") + " and expected was false"); // Substituir 'a', inserir 'm' (esperado: false)

// Casos Idênticos
        System.out.println(OneAway("pale", "pale") + " and expected was true"); // Strings iguais (esperado: true)
        System.out.println(OneAway("", "") + " and expected was true"); // Strings vazias (esperado: true)

// Casos Limite
        System.out.println(OneAway("a", "") + " and expected was true"); // Remover único caractere (esperado: true)
        System.out.println(OneAway("", "a") + " and expected was true"); // Inserir único caractere (esperado: true)
        System.out.println(OneAway("a", "b") + " and expected was true"); // Substituir único caractere (esperado: true)
        System.out.println(OneAway("abc", "a") + " and expected was false"); // Remover dois caracteres (esperado: false)
        System.out.println(OneAway("a", "abc") + " and expected was false"); // Inserir dois caracteres (esperado: false)
        System.out.println(OneAway("abc", "acb") + " and expected was false"); // Trocar ordem de dois caracteres (esperado: false)

// Casos com Strings Longas
        System.out.println(OneAway("abcdefghijkl", "abcdefghijk") + " and expected was true"); // Remover último caractere (esperado: true)
        System.out.println(OneAway("abcdefghijk", "abcdefghijkl") + " and expected was true"); // Inserir último caractere (esperado: true)
        System.out.println(OneAway("abcdefghijkl", "abcdeghijkl") + " and expected was true"); // Substituir caractere no meio (esperado: true)
        System.out.println(OneAway("abcdefghijkl", "abcdefhijklm") + " and expected was false"); // Substituir e adicionar caractere (esperado: false)



    }

    public static boolean OneAway(String str1, String str2){

        if(str1.equals(str2)){
            return true;
        }
        if(Math.abs(str1.length() - str2.length()) > 1) return false;

        int cont = 0;
        int j = 0;
        int i = 0;
        // Remove case and Insert case
        if((Math.abs(str1.length() - str2.length()) == 1)){
            while(i < str1.length() && j < str2.length()){

                if(str1.charAt(i) != str2.charAt(j)){
                    cont++;
                    if(cont > 1) return false;
                    if(str1.length() > str2.length()){
                        i++;
                    }
                    else if(str2.length() > str1.length()){
                        j++;
                    }
                }
                else{
                    i++;
                    j++;
                }
            }
            return true;
        }

        cont = 0;

        if(str1.length() == str2.length()){
            for(i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    cont++;
                }
            }
        }
        if(cont > 1) return false;

        return true;
    }
}




