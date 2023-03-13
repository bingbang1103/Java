//写在类定义的上面
import java.util.Scanner;
public class Scanner
{
	public static void main(String[] args)
	{
		//2.创建对象，准备用Scanner这个类
		Scanner sc=new Scanner(System.in);
		//3.接受数据
		//i变量记录了键盘录入的数据
		int i=sc.nextInt();
		System.out.println(i);
	}
}