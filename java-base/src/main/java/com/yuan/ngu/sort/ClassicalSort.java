package com.yuan.ngu.sort;

import java.util.Arrays;

/**
 * 经典排序算法
 * 参考 https://blog.csdn.net/qq_25591259/article/details/82819485
 */
public class ClassicalSort {

    /**
     * 冒泡排序
     * 1.一开始交换的区间是0~n-1,也就是整个数组
     * 2.先拿第一个数和第二个数比较,那个大那个就放在后面,然后拿第二个数和第三个数进行比较,那个大那个就放在后面,这样依次交换过去,最大的一个数被放在了最后一个位置
     * 3.然后把范围从 0~n-1 变为 0~n-2,这样以来,第二组最大的数被放在了数组的倒数第二个位置
     * 4.我们依次进行这样的交换过程,从范围从0~n-1到最后范围变为1的时候整个数组就变得有序了
     */
    public static Integer[] bubbleSort(Integer[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     * 时间复杂度为O(n^2)
     * 1.一开始从范围0~n-1中选择一个最小值
     * 2.然后把他放在位置0上，
     * 3.再从范围1~n-1上选择一个最小值，把他放在位置1上
     * 4.依次进行这样的交换，最后从范围0~n-1，1~n-1，最后只剩下1个数的时候，整个数组就变得有序了
     */
    public static Integer[] selectionSort(Integer[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * 插入排序
     * 时间复杂度为O(n^2)
     * 1.首先是位置1上的数和位置0上的数进行比较
     * 2.如果位置1上的数更小，那么他就和位置0上的数进行交换
     * 3.如果位置a上的数记为q的话,a就和位置1上的数比较，如果a比位置1上的数更小，那么和位置1上的数交换，
     * 4.交换之后，在和位置0上的数开始比较,如果比位置0上的数更小,就和位置0上的数进行交换
     * 5.接下来拿位置K上的数据记为b,b就和他前面的所有数据开始比较,知道b<=他前面的数,b就插入到当前位置
     * 6.那么,我们从1位置到n-1位置都进行这样插入的过程,最终整个数组就变得有序了
     */
    public static Integer[] insertionSort(Integer[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                Arrays.asList(array).forEach(currentValue -> System.out.print(currentValue + ","));
                preIndex--;
                System.out.println();
            }
            array[preIndex + 1] = current;
        }
        return array;
    }


    public static void quickSort(Integer[] numbers, Integer start, Integer end) {
        if (start < end) {
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
            int temp; // 记录临时中间值
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end))
                    i++;
                while ((numbers[j] > base) && (j > start))
                    j--;
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
        Arrays.asList(numbers).forEach(integer -> System.out.println(integer));
    }
}
