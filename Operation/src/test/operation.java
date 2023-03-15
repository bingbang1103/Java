package test;
import  java.util.Scanner;
public class operation
{
    public static void main(String[] args)
    {
     /*
       while(true)
       {
           Scanner scan=new Scanner(System.in);
           System.out.println("请输入两个数：");
           int num1=scan.nextInt();
           int num2=scan.nextInt();
           System.out.println("请输入运算符：");
           char ch=scan.next().charAt(0);
           if(ch=='+')
           {
               int sum=num1+num2;
               System.out.println(num1+"+"+num2+"="+sum);
           }else if(ch=='-')
           {
               int sum=num1-num2;
               System.out.println(num1+"-"+num2+"="+sum);
           }else if(ch=='*')
           {
               int sum=num1*num2;
               System.out.println(num1+"*"+num2+"="+sum);
           }if(ch=='/')
           {
               int sum=num1/num2;
               System.out.println(num1+"/"+num2+"="+sum);
           }
       }

      */
        while(true)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入两个数：");
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            System.out.println("请输入运算符：");
            char ch=scan.next().charAt(0);
            switch (ch)
            {
                case '+':
                    int sum=num1+num2;
                    System.out.println(num1+"+"+num2+"="+sum);
                    break;
                case '-':
                    int sum3=num1-num2;
                    System.out.println(num1+"-"+num2+"="+sum3);
                    break;

                case '*':
                    int sum4=num1*num2;
                    System.out.println(num1+"*"+num2+"="+sum4);
                    break;

                case '/':
                    int sum5=num1/num2;
                    System.out.println(num1+"/"+num2+"="+sum5);
                    break;

            }
        }
    }
}
