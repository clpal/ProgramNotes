package string;

public class ReverseWordString {
    public static void main(String[] args) {
        reverseWords("the sky is blue");

    }
    public static String reverseWords(String s) {
        String str[]= s.split(" ");
        for(int j=str.length-1;j>=0;j--){
            System.out.println(str[j]);

        }
        return String.valueOf(str);

    }
}
