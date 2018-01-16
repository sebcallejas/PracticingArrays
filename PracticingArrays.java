/*
* Sebastian Callejas
* Period 3
* Project: PracticingArrays
 */
package practicing.arrays;

import java.util.*;

/**
 *
 * @author 18051
 */
public class PracticingArrays {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // And so it begins....
//The Five Names   
        String[] names = new String[5];
        System.out.println("Enter 5 names");
        System.out.println("1.");
        names[0] = scan.nextLine().toUpperCase();
        System.out.println("2.");
        names[1] = scan.nextLine().toUpperCase();
        System.out.println("3.");
        names[2] = scan.nextLine().toUpperCase();
        System.out.println("4.");
        names[3] = scan.nextLine().toUpperCase();
        System.out.println("5.");
        names[4] = scan.nextLine().toUpperCase();

        System.out.print(Arrays.toString(names));
//The 3 Booleans
        boolean[] values = new boolean[3];
        int count2 = 0;
        System.out.println(" ");
        System.out.println("Please enter 3 booleans. (EX: \"True\" \"False\" ");
        System.out.println("1. ");
        values[0] = scan.nextBoolean();
        System.out.println("2. ");
        values[1] = scan.nextBoolean();
        System.out.println("3. ");
        values[2] = scan.nextBoolean();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == false) {
                System.out.println("NO!");
              break;
            }
            else{
                count2++;
                
            }
           
        }
         if (count2 == 3) {
             System.out.println("YES!");
         }
// That "Fire Code"
        
        
        
        
        
    }

}
