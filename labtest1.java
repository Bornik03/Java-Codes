import java.util.*;
class Labtest2
{
    int accno;
    int bal;
    Labtest2(int accno,int bal)
    {
        this.accno=accno;
        this.bal=bal;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your acc no");
        accno=sc.nextInt();
        System.out.println("Enter your balance");
        bal=sc.nextInt();
    }
    void display()
    {
        System.out.println("Your acc no is :"+accno);
        System.out.println("Your balance is :"+bal);
    }
}
class Person1 extends Labtest2
{
    String name;
    int ano;
    Person1(int accno,int bal,String name,int ano)
    {
        super(accno,bal);
        this.name=name;
        this.ano=ano;
    }
    void display()
    {
        System.out.println("Account no is "+accno);
        System.out.println("Balance is "+ bal);
        System.out.println("Your name is :"+name);
        System.out.println("Your Aadhar no is :"+ano);
    }
}
class top1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Person1 p;
        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter acc no, balance, name and aadhar no");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            p=new Person1(a,b,c,d);
            p.display();
        }
    }
}
