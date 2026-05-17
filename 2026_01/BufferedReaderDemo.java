import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一句话：");
        String content = br.readLine();
        System.out.println("你输入的是：" + content);

        br.close();
    }
}