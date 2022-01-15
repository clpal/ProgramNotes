package string;

public class MinimumStep {
    public static void main(String[] args) {
        int arr[]={2,4,1};
        int step=0;
        for (int i :arr) {
            step=step + arr[i]-1;
        }

        System.out.println(step);
    }
}
