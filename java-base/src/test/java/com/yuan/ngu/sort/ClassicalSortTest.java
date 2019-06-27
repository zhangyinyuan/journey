package com.yuan.ngu.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ClassicalSortTest {

    private Integer[] src = new Integer[]{5, 3, 1, 6, 2};

    @Before
    public void before() {

    }

    @Test
    public void bubbleSort() {
        Integer[] sortArray = new ClassicalSort().bubbleSort(src);
        for (int i : sortArray) {
            System.out.println(i);
        }
    }

    @Test
    public void selectionSort() {
        Integer[] sortArray = new ClassicalSort().selectionSort(src);
        for (int i : sortArray) {
            System.out.println(i);
        }
    }

    @Test
    public void insertionSort() {
        Integer[] sortArray = new ClassicalSort().insertionSort(src);
        for (int i : sortArray) {
            System.out.println(i);
        }
    }

    @Test
    public void quickSort() {
        new ClassicalSort().quickSort(src, 3, src.length - 1);
    }

}