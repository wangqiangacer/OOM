package cn.jacken;

import java.nio.ByteBuffer;

/**
 * Direct buffer memory
 * 最大直接堆内存是 ：-XX：MaxDirectMemorySize=5m
 */
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        //最大的直接内存
        System.out.println("配置的MaxDirectDemo:"+(sun.misc.VM.maxDirectMemory()/(double)1024/1024)+"MB");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);

    }
}
