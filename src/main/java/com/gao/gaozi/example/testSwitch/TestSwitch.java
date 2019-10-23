package com.gao.gaozi.example.testSwitch;

public class TestSwitch {
    private static final String V11 = "【V11】";

    private static final String V12 = "【V12】";

    private static final String V13 = "【V13】";

    public static void main(String[] args) {

        switch11(1);

        switch12(2);

        switch13(1);
    }

    public static void switch11(int num) {
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println(V11 + 123);
                break;
            case 4:
                System.out.println(V11 + 4);
                break;
            case 5:
            case 6:
                System.out.println(V11 + 56);
                break;
            case 7:
                System.out.println(V11 + 7);
                break;
        }
    }

    public static void switch12(int num) {
        switch (num) {
            case 1, 2, 3 -> System.out.println(V12 + 123);
            case 4 -> System.out.println(V12 + 4);
            case 5, 6 -> System.out.println(V12 + 56);
            case 7 -> System.out.println(V12 + 7);
        }
    }

    public static void switch13(int num) {
        System.out.println(
                switch (num) {
                    case  1 -> V13 + "one";
                    case  2 -> V13 + "two";
                    default -> V13 + "many";
                }
        );
    }
}
