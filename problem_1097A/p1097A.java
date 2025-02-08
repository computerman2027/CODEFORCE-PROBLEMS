import java.util.*;

public class p1097A
{



public static boolean compare(String a,String b)
{
    if(b.indexOf(a.charAt(0))>-1 || b.indexOf(a.charAt(1))>-1)
    return true;
    return false;
}

public static void main(String[] args)
{
    String tablecard="",handcard="";
    Scanner sc = new Scanner(System.in);

    tablecard=sc.next()+sc.nextLine();
    handcard=sc.next()+sc.nextLine();

    StringTokenizer st = new StringTokenizer(handcard);
    while(st.hasMoreTokens())
    {
        if(compare(tablecard,st.nextToken()))
        {
            System.out.println("YES");
            return;
        }
    }
    System.out.println("NO");

}
}