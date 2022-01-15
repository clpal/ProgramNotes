package collections;
import java.util.HashSet;
public class DublicateElement {
    public static void main(String[] args) {
         int a[]={1,2,3,2,5,4,5,2};
         // {1,3,4}
     /*   for(int i=0 ;i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if((i!=j)&& a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }

            }
        }*/
     HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int element:a) {
            if (hashSet.add(element) == false) {
                System.out.println(element);
            }

        }

    }
}
