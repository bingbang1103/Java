package test;
import java.util.Scanner;
public class char_zhuanhuan
{
    public static void   main(String[] args)
    {
        while(true)
        {
            Scanner scan=new Scanner(System.in);
            System.out.print("请输入字母：");
            char ch=scan.next().charAt(0);
            if(65<=ch&&ch<=90)
            {
                int CH=ch+32;
                System.out.println((char)CH);

            } else if (97<=ch&&ch<=122)
            {
                int CH=ch-32;
                System.out.println((char)CH);
            } else
            {
                System.out.println("输入错误！请重新输入：");
            }


        }

    }

}
