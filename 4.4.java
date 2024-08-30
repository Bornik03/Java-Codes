import java.util.*;
class Account
{
    int accno;
    double bal;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your acc no");
        accno=sc.nextInt();
        System.out.println("Enter your balance");
        bal=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Your acc no is :"+accno);
        System.out.println("Your balance is :"+bal);
    }
}
class Person extends Account
{
    String name;
    long no;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your Aadhar no");
        no=sc.nextLong();
    }
    void display()
    {
        super.display();
        System.out.println("Your name is :"+name);
        System.out.println("Your Aadhar no is :"+no);
    }
}
class top
{
    public static void main(String args[])
    {
        Person p=new Person();
        p.input();
        p.display();
    }
}