/*  5
     shahi //input       shahi   //output
     shafin              shafin
     saba                saba
     sariya              sariya
     sara                sara    */

import java.util.*;
public class Accessingstring{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.next();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}