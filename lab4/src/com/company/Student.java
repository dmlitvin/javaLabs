package com.company;

import java.util.Comparator;
import java.util.Random;

public class Student {
    private int age = 17;
    private int scholarship = 1000;
    private int averageMark = 7;
    final private String firstName;
    final private String lastName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student() {
        firstName = firstNames[i];
        lastName = lastNames[i];
        
        if (random.nextInt() % 3 == 0) {
            ++age;
        }

        if (random.nextInt() % 4 == 0) {
            averageMark += 2;
        }

        if (random.nextInt() % 2 == 0) {
            ++averageMark;
        }

        if (++i > firstNames.length) {
            i = 0;
        }
    }

    static int i = 0;

    static String[] firstNames = {
            "Liam",
            "Noah",
            "William",
            "James",
            "Oliver",
            "NAME6",
            "NAME7",
            "NAME8",
    };
    static String[] lastNames = {
            "am",
            "no",
            "too",
            "lazy",
            "to",
            "find",
            "last",
            "names",
    };
    static Random random = new Random();
}

class SortByAge implements Comparator<Student>
{
    public int compare(Student a, Student b) {
        return a.getAge() - b.getAge();
    }
}

class SortByAverageMarkReverse implements Comparator<Student>
{
    public int compare(Student a, Student b) {
        return b.getAverageMark() - a.getAverageMark();
    }
}
