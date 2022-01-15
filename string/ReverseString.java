package string;

public class ReverseString {
    public static void main(String[] args) {
         String S = "madam";
        //System.out.println(revStr(S));
        //System.out.println(revChar(S));
        //ReverseSwapping();
       revString(S);

    }
    static  String reverseChar(String str){
        char c[]=str.toCharArray();
        char []ch=new char[str.length()];

        for (int i = 0; i < c.length; i++) {
            ch[c.length-1-i]=c[i];
        }
        return  new String(ch);
    }
    static String revStr(String S) {
        byte[] ch= S.getBytes();
        byte    result[]=new byte[ch.length];
        for (int i = 0; i < ch.length; i++) {
            result[ch.length-i-1]=ch[i];
        }
        return new String(result);
    }
    static String revChar(String S) {
        byte[] ch= S.getBytes();
        int left=0;
        int right= ch.length-1;
               while (right>left){
                   byte c=ch[left];
                   ch[left]=ch[right];
                   ch[right]=c;
                   right --;
                   left++;
               }
        return new String(ch);
    }
    static void ReverseCharSwapping(){
        String s = "madam";
        char[] ch = s.toCharArray();
        int l = 0;
        int h = ch.length - 1;
        while (l < h) {
            char c = ch[l];
            ch[l] = ch[h];
            ch[h] = c;
            l++;
            h--;
        }

        String ch1 = String.valueOf(ch);
        if (ch1.equals(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
     static void  revString(String A){
        int count = 0;
        for(int i=0; i<A.length()/2;i++)
            if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;
    }


}
