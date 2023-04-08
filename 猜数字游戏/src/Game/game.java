package Game;
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args){

        System.out.println("**********************************");
        System.out.println("******1.paly*********0.exit*******");
        System.out.println("**********************************");
        System.out.println("请选择(1/0)：");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        if(input==1){
            System.out.println("开始游戏！请猜数字：");
            Random rand=new Random();
            int randomnum=rand.nextInt(1,20);
            int num=0;
            do{
                num=scan.nextInt();
                if(num<randomnum){
                    System.out.println("猜小了");
                }else if(num>randomnum){
                    System.out.println("猜大了");
                }else {
                    System.out.println("猜对了！");

                }
            }while(randomnum!=num);

        }else {
            System.out.println("退出游戏!");
        }


    }
}
