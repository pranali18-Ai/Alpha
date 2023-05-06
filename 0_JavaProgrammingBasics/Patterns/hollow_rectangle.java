import java.util.*;
public class hollow_rectangle{

    public static void rectangle(int row, int col){
        //outer loop  i-rows
        for(int i=1; i<=row; i++){
            //inner loop j-columns
            for(int j=1; j<=col; j++){
                //cell - (i,j)
                if(i==1 || i==row || j==1 || j==col){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //nextline
        }
        }

    public static void main(String[] args){
        rectangle(6,6);
    }
}
import java.util.*;
public class hollow_rectangle{

    public static void rectangle(int row, int col){
        //outer loop  i-rows
        for(int i=1; i<=row; i++){
            //inner loop j-columns
            for(int j=1; j<=col; j++){
                //cell - (i,j)
                if(i==1 || i==row || j==1 || j==col){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //nextline
        }
        }

    public static void main(String[] args){
        rectangle(6,6);
    }
}
