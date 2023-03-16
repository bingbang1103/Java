package test;
import java.util.*;
public class leap_year
{
    public  static  void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入年份：");
        int num=scan.nextInt();
        if((num/4==0)&&(num/100!=0)||(num/400==0))
        {
            System.out.println(num+"是闰年");

        }
        else
        {
            System.out.println(num+"不是闰年");
        }
    }
}
