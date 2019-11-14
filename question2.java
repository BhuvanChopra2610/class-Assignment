import java.util.*;
import java.util.Scanner;
class SubArray{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=0;
        int count=0;
        int k=in.nextInt();
        int arr[]=new int[100];
        n=in.nextInt();
        int m=n+1-k;
        count=(m*(m+1))/2;
        System.out.println(count);
    }
}