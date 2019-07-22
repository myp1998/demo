package com.myp.demo;

import org.junit.Test;

import java.util.Arrays;

public class Demo {
    public void InsertionSort(int[] sourceArray) {
        int j, temp;
        //从最第二个元素开始把最小的元素放在排序完成的位置
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] < sourceArray[i - 1]) {
                //当前元素比前一个元素小，需要在排好序的部分腾出一个位置放当前元素
                temp = sourceArray[i];
                for (j = i - 1; j >= 0 && temp < sourceArray[j]; j--) {
                    //temp > sourceArray[j],终止向前找位置,sourceArray[j+1]变为temp位置
                    sourceArray[j + 1] = sourceArray[j];//前一个赋给后一个
                }
                sourceArray[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(sourceArray));
    }

    @Test
    public void test() {
        int array[] = {10, 3, 6, 8, 0, 10, 9, 9, 9, 8};
        InsertionSort(array);
    }
}
