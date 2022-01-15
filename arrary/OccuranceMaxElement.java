package arrary;

import java.util.Arrays;

public class OccuranceMaxElement {
  static   int[] arr = {1,1,2,1,6,6,6,8,5,9,7,1};
    public static void main(String[] args) {
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);
        for (int a = 0; a <arr.length ; a++) {
            int count=1;
            if (visited[a]==true)
                continue;
            for (int j = a+1; j < arr.length; j++) {
                if (arr[a]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[a]+ " "+count);
        }

    }
}
