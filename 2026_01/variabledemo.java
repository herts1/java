public class variabledemo{
    public static void main(String[] args){
        int a = 10;
        System.out.println(a);  //10

        int b = 20;
        System.out.println(a+b);  //30

        a = 20;
        System.out.println(a+b);  //40
        //如果要定义long类型
        //需要在数字后面加上L
        long n=9999999999999L;
        System.out.println(n);
        //如果要定义float类型
        //需要在数字后面加上F
        float m=1.00900F;
        System.out.println(m);
    }
}