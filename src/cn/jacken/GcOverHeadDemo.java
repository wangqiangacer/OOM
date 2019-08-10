package cn.jacken;

import java.util.ArrayList;
import java.util.List;

/**
 * 98%的资源都用来做垃圾回收
 * 2% 的资源用做堆内存
 */
public class GcOverHeadDemo {
    public static void main(String[] args) {
        int i=0;
        List<String> list=new ArrayList<>();
        try {
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        } catch (Throwable e) {
            System.out.println("**************"+i);
            e.printStackTrace();
            throw  e;
        }
    }
}
