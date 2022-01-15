package basic;

import java.util.Arrays;

public class OccuranceElement {
    static String str[]={ "Noida","Delhi","Noida","Agara","Noida"};

    public static void main(String[] args) {
       // char ch []=str.
       // int countstr[]=new int[str.length];
        Arrays.sort(str);
                int count=1;
        for ( int i = 0; i <str.length-1 ; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i].equals(str[j]))
                    count ++;
            }
            if (count >= 1) {
                System.out.println(str[i]+"-->"+ count);
                i+=(count-1);
            }

        }

    }
}
