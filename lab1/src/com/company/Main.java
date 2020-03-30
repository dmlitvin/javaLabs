package com.company;

class Main
{
    public static int a = 1111;

    Main mm = new Main();

    static
    {
        System.out.println("static: " + a);

        a = a-- - --a;

        System.out.println("static: " + a);
    }

    {
        System.out.println("dynamic: " + a);

        a = a++ + ++a;

        System.out.println("dynamic: " + a);
    }

    public static void main(String[] args) {
        System.out.println(a);

        new Main();
    }
}
