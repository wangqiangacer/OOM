package cn.jacken;

/**
 * OOM产生的原因：
 * 1.stack溢出
 * 2.堆内存不够 xms和xmx不能满足对象的使用
 */
public class StackOverFolwErrorDemo {
    public static void main(String[] args) {
        StackOverFolwError();
    }

    private static void StackOverFolwError() {
        //stack溢出
        //StackOverFolwError();
    }
}
