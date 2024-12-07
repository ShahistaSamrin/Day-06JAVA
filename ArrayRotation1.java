/* 7 //array size
1 2 3 4 5 6    //array value
3   //k value
5 //output
6
7
1
2
3
4  */
import java.util.*;
public class ArrayRotation1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int j=n-k;
        for(int i=j;i<n;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<j;i++)
        {
            System.out.println(a[i]);
        }
    }
}