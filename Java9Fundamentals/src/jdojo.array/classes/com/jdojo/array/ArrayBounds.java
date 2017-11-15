// ArrayBounds.java
package  com.jdojo.array;

public class ArrayBounds {
    public static void main(String[] args) {
        int[] test = new int[3];
            
        System.out.println("Assigning 12 to the first element");
        test[0] = 12;  // OK. Index 0 is between 0 and 2.

        System.out.println("Assigning 79 to the fourth element");
        
        // Index 3 is not between 0 and 2. At runtime, an exception is thrown.
        test[3] = 79; 
        
        System.out.println("We will not get here");
    }
}
