package com.object.generic.comparision;

public class Main {
    public static void main(String[] args) {
        Student A = new Student(1,"AAA",90);
        Student B = new Student(2,"BBB",80);
        Student C = new Student(3,"CCC",85);

        if(A.compareTo(B)>0){
            System.out.println("A's marks are greater than B");
        }
        else if(A.compareTo(B)<0){
            System.out.println("A's marks are less than B");
        }
        else
            System.out.println("A's marks are equal to B");
    }
}