package com.avalon.test.queue;

/**
 * Created by ouyqy on 2017/11/3.
 */
public class QueueTest {

    private int maxSize;
    private long[] pQueue;
    private int nItems;

    public QueueTest(int size){
        maxSize = size;
        pQueue = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int j;
        if(nItems == 0)//如果队列为空,直接插入，个数+1
            pQueue[nItems++] = item;
        else{//如果队列不为空，找到要插入的位置
            for(j = nItems - 1;j >= 0; j--){
                //如果插入项大于当前，当前项上移一个位置
                if(item > pQueue[j])
                    pQueue[j+1] = pQueue[j];
                else //找到要插入的位置，跳出循环
                    break;
            }
            pQueue[j+1] = item;
            nItems++;
        }
    }

    public long remove(){
        return pQueue[--nItems];
    }

    public long peekMin(){
        return pQueue[nItems-1];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public static void  main(String[] args){
        QueueTest queueTest = new QueueTest(5);
        queueTest.insert(10);
        queueTest.insert(20);
        queueTest.insert(12);
        queueTest.insert(31);
        queueTest.insert(23);
        System.out.println(queueTest.remove());
        System.out.println(queueTest.remove());
        System.out.println(queueTest.remove());
        System.out.println(queueTest.remove());
        System.out.println(queueTest.remove());
        System.out.println(queueTest.toString());
    }
}
