/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SkipList
 * Author:   think
 * Date:     2019/8/16 11:18
 * Description: 跳跃表的实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.skipList;

import java.util.Random;

/**
 * 〈一句话功能简述〉<br> 
 * 〈跳跃表的实现〉
 *
 * @author think
 * @create 2019/8/16
 * @since 1.0.0
 */
public class SkipList<T extends Comparable<? super T>> {
    private SkipListNode<T> head,tail;
    private int nodes;
    private int listLevel;
    private Random random;
    public static final double PROBABILITY = 0.5;

    /**
     * 清空跳跃表
     */
    public void clear(){

    }

    public boolean isEmpty(){

    }

    public int size(){

    }

    /**
     * 在最下面那层找到要插入的位置前面的key
     * @param key
     * @return
     */
    private SkipListNode<T> finNode(int key){

    }

    /**
     * 查找是否存储节点，存在返回节点，不存在返回null
     * @param key
     * @return
     */
    public SkipListNode<T> search(int key){

    }

    /**
     * 向跳跃表中添加key-value
     * @param key
     * @param value
     */
    public void put(int key,T value){

    }

    /**
     * 向node1后面加入node2
     * @param node1
     * @param node2
     */
    private void backLink(SkipListNode<T> node1,SkipListNode<T> node2){

    }

    /**
     * 水平双向链接
     * @param node1
     * @param node2
     */
    public void horizontailLink(SkipListNode<T> node1,SkipListNode<T> node2){

    }

    /**
     * 垂直双向链接
     * @param node1
     * @param node2
     */
    public void vertiacllLink(SkipListNode<T> node1,SkipListNode<T> node2){

    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "跳跃表为空";
        }

        StringBuilder builder = new StringBuilder();
        SkipListNode<T> p = head;
        while (p.down != null){
            p = p.down;
        }

        while (p.left != null){
            p = p.left;
        }

        if (p.right != null){
            p = p.right;
        }

        while (p.right != null){
            builder.append(p);
            builder.append("\n");
            p = p.right;
        }
        return p.toString();
    }
}
