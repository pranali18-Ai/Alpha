/* //character pattern

import java.util.Scanner;
public class character{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lines: ");
        int n = sc.nextInt();
        char alpha = 'A';  //use '' comma 
        for(int line=1; line<=n; line++){  //outer loop for lines
            for(int ch=1; ch<=line; ch++){
                System.out.println(alpha);
                alpha++; //to increase the value of alphabet
            }

        }

    }
}
/* */

//inverted Character Pattern
import java.util.Scanner;
public class character{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lines: ");
        int n = sc.nextInt();
        char alpha = 'A';
        for(int line = 1 ; line<=n; line++){
            for(int ch = 1; ch<= n-line+1; ch++){
                System.out.print(alpha);  //dont use ln 
                alpha++;
            }
            System.out.println(); //next line
        }
    }
    }
