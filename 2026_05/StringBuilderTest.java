 public class StringBuilderTest{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        //拼接字符串【追加任意类型】
        System.out.println(sb);
        sb.insert(8,"java");
        //插入（位置，内容）
        System.out.println(sb);
        sb.delete(5,8);
        //删除（头，尾）
        System.out.println(sb);

         

    }
}