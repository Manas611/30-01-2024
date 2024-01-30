public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4,4,4,4, 5};
        int x = 4;
        int n = arr.length;

        int fr = -1, end = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
                fr = i;
                while (i<n && arr[i] == x) {
                    end = i;
                    i++;
                }
                break;
            }
        }
        System.out.println(fr+" "+end);
    }
}
