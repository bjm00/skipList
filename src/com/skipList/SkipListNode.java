/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SkipListNode
 * Author:   think
 * Date:     2019/8/16 11:32
 * Description: 跳跃表节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.skipList;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈跳跃表节点〉
 *
 * @author think
 * @create 2019/8/16
 * @since 1.0.0
 */
public class SkipListNode<T> {
    public int key;
    public T value;
    public SkipListNode<T> up,down,left,right;

    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int  TAIL_KEY = Integer.MAX_VALUE;

    public SkipListNode(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof SkipListNode<?>)){
            return false;
        }

        SkipListNode<T> ent;
        try {
            ent = (SkipListNode<T>)o;
        }catch (ClassCastException e){
            return false;
        }
        SkipListNode<?> that = (SkipListNode<?>) o;
        return key == that.key &&
                Objects.equals(value, that.value);
    }

    @Override
    public String toString() {
        return "key-value" + key + "-" + value;
    }
}
