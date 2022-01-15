package string;

public class PalindromeString {
    //https://www.techiedelight.com/reverse-string-kotlin/
    public static void main(String[] args) {
       // reverseString();
        String s="abaa";
        int l=0;
        int r=s.length()-1;
        char ch[]=s.toCharArray();
       boolean b= isPalin(ch,l,r);
        System.out.println(b);
    }
  static  void   reverseString(){
        String s="RADAR";

        String rev="";
        boolean b=false;

        for (int i=s.length()-1 ; i >= 0 ; i--) {
            rev +=s.charAt(i);
        }
        if (s.equals(rev)) {
            b = true;
            System.out.print(b);
        } else {
            System.out.print(b);
        }

    }
    // a
    // aba
    static boolean isPalin(char []s,int l,int r){
        if (l >=r)
            return true;
        if (s[l] !=s[r]) return  false;
        return isPalin(s,l+1,r-1);
    }
}
