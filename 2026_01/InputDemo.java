import java.util.Scanner;
public class InputDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.nextLine();

        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("姓名：" + name + "年龄：" + age);
        sc.close();
    }
}