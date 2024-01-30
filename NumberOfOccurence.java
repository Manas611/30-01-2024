public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        int x = 3;
        int n = arr.length;
        int cnt = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
