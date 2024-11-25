package ArraysAndStings;

public class URLfy {

    public static void main(String[] args) {

    }

    /*
    public static String ArraysAndStings.URLfy(String str, int trueLength){
        StringBuilder sb = new StringBuilder();
        int cont = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append("%20");
                cont++;
            }
            else{
                sb.append(str.charAt(i));
                cont++;
            }

            if(cont == trueLength){
                break;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    */

    public static String URLfy(char[] chars, int trueLength) {
        if(chars == null || trueLength == 0){
            return "";
        }

        int spaceCont = 0;
        for(int i = 0; i < trueLength; i++){
            if(chars[i] == ' '){
                spaceCont++;
            }
        }

        int index = trueLength + spaceCont * 2 - 1;
        for(int i = trueLength - 1; i >= 0; i--){
            if(chars[i] == ' '){
                chars[index] = '0';
                chars[index - 1] = '2';
                chars[index - 2] = '%';
                index = index - 3;
            }
            else {
                chars[index] = chars[i];
                index--;
            }
        }
        return new String(chars);
    }


}
