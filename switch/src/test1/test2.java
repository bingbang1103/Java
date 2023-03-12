
package test1;
import java.util.*;
public class test2
{
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.print("请输入成绩：");
            Scanner out=new Scanner(System.in);
            int num=out.nextInt();
            switch (num/10)
            {
                case 10:
                case 9:
                    System.out.println("非常优秀！");
                    break;
                case 8:
                    System.out.println("优秀！");
                    break;
                case 7:
                case 6:
                    System.out.println("良好！");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("不及格！要补考。");
                    break;
                default:
                    System.out.println("成绩出错！");
                    break;

            }
        }
    }
}
