/*    *       * 
      *       * 
      * * * * * 
      *       * 
      *       *   */
import java.util.*;
public class patternH{
    public static void main(String args[]){
        int n=5;
        if(n%2==0)
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==n-1 || j==0 || i==n/2)
                System.out.print("*"+" ");
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}