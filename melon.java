import java.util.*;
class melon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        if(W%2==0)
        {
            W/=2;
            if(W%2==0)
            System.out.println("True");
            else
            System.out.println("False");
        }
        else
        System.out.println("False");
    }
}