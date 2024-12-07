/*   5
     3 4 5 6 7 
    [3, 0, 0, 0, 0]
    [3, 4, 0, 0, 0]
    [3, 4, 5, 0, 0]
    [3, 4, 5, 6, 0]
    [3, 4, 5, 6, 7]   */
import java.util.*;
public class Arraymain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
}