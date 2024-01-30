import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {0, 2 ,1 ,2 ,3 };
        int n = arr.length;

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i:arr)
        {
            if(m.containsKey(i))
            {
                m.put(i, m.get(i)+1);
            }
            else
            {
                m.put(i, 1);
            }
        }

        for (int key : m.keySet()) {
            if(m.get(key) > 1)
            {
                System.out.print(key+" ");
            }


            // System.out.println("Element: " + key + ", Count: " + m.get(key));
        }


    }
}
