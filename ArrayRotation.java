public class ArrayRotation{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        int n=7;
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