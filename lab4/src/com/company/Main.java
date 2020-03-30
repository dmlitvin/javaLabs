package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int studentCount = 6;

        Student[] students = new Student[studentCount];
        for (int i = 0; i != studentCount; ++i) {
            students[i] = new Student();
        }

        System.out.println();
        System.out.println("introduction");

        printStudents(students, studentCount);

        Arrays.sort(students, new SortByAge());

        System.out.println();
        System.out.println("sort by age");

        printStudents(students, studentCount);

        Arrays.sort(students, new SortByAverageMarkReverse());

        System.out.println();
        System.out.println("sort by average mark, reverse");

        printStudents(students, studentCount);
    }

    private static void printStudents(Student[] students, int studentCount) {
        for (int i = 0; i != studentCount; ++i) {
            Student student = students[i];
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                ", age: " + student.getAge() + ", average mark: " + student.getAverageMark());
        }
    }
}
