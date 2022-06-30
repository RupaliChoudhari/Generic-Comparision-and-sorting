package com.object.generic.comparision;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentSort a = new StudentSort(1,"AAA",75);
        StudentSort b = new StudentSort(2,"BBB",89);
        StudentSort c = new StudentSort(3,"CCC",85);

        StudentSort [] students_list = {a,b,c};
        Arrays.sort(students_list); // It;s sorting based on compareTo method
        System.out.println(Arrays.toString(students_list));
          }
}