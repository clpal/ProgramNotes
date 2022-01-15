package string;

public class RemoveDublicateelement {

    public static void main(String[] args) {
        String s = "bcabc";
        int index = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int j;
            for (j = 0; j < i; j++) {

                if (ch[j] == ch[i]) {
                    break;

                }
            }
            if (j == i) {
                ch[index++] = ch[i];
            }
        }

        for (Character c : ch) {
            System.out.print(c);
        }
    }
}
