package com.object.generic.comparision;

public class StudentSort implements Comparable<StudentSort>{
    int roll_no;
    String  name;
    float marks;

    public StudentSort(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(StudentSort s) {
        return  (int)(this.marks-s.marks);
    }

}
