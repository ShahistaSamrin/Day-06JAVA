/* 5
* * * * *
    *
    *
    *
* * * * *     */
import java.util.*;
public class pattern03{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1 || i==0 || j==n/2)
                    System.out.print("*"+" ");
                    else{
                        System.out.print(" "+" ");
                    }
            }
            System.out.println();
        }
    }
}