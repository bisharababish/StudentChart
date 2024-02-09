package NidaaQuestions;
    import java.util.ArrayList;
    import java.util.Collections;
    
    public class Q4 {
        public static void main(String args[]) {
            // Creating arraylist
            ArrayList<Integer> arr = new ArrayList<Integer>();
    
            // Adding object in arraylist
            arr.add(10);
            arr.add(20);
            arr.add(5);
            arr.add(8);
    
            // Finding the size of ArrayList
            int n = arr.size();
    
            // printing the ArrayList elements
            System.out.println("ArrayList elements are :");
    
            for (int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }
    
            System.out.println();
    
            // Finding the minimum and maximum from the
            // arraylist using min and max method of collection
            // class
    
            int max = Collections.max(arr);
            System.out.println("Maximum is : " + max);
    
            int min = Collections.min(arr);
            System.out.println("Minimum is : " + min);
        }
    }   

