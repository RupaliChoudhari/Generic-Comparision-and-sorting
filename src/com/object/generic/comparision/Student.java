package com.object.generic.comparision;

public class Student implements Comparable<Student>{
    int roll_no;
    String  name;
    float marks;

    public Student(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return  (int)(this.marks-s.marks);
    }

}
