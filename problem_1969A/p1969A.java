import java.util.*;

public class p1969A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nooftestcase =sc.nextInt();
        int i,j;
        for(i =0;i<nooftestcase;i++)
        {
            int noOfFriends=sc.nextInt();
            int arr[] = new int[noOfFriends];

            for(j=0;j<noOfFriends;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println(noofinvite(arr));
        }
    }
    public static int noofinvite(int[] arr)
    {
        int i;
        for(i=1;i<=arr.length;i++)
        {
            if(i==arr[arr[i-1]-1])
            return 2;
        }
        return 3;
    }
}