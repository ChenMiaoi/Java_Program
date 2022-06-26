public class DataType {
    public static void main(String[] args) {
        /*
            1. 整形int -- 4字节
            2. java的标识符：数字、字母、下划线、$，依旧不允许数字开头，不建议以$开头
        */
        int a = 10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // System.out.println(a);  //打印且换行
        // System.out.printf("%d\n", a);   //以格式化输出内容
        // System.out.print(a);    //只打印不换行
    }
}
