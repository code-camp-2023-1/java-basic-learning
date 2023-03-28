package com.jirengu.java.basic.statement;

public class SwitchStatementDemo {
    public static void main(String[] args) {
        int day = 2;
        //顺序执行
        switch (day) {
            case 1: // if (day == 1)
                System.out.println("MON");
                break;
            case 2: // else if (day == 2)
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default: // else
                System.out.println("Invalid day of week: " + day);
        }

        // 通过月份判断季度 1 - 3月：q1 4 - 6月：q2 7 - 9月：q3 10 - 12月：q4
        int month = 8;
        switch (month) {
            case 2:
            case 1:
            case 3:
                System.out.println("Q1");
                break;
            case 5:
            case 6:
            case 4:
                System.out.println("Q2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Q3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Invalid month: " + month);

        }

        String ch = "A";

        switch (ch) {
            case "AAA":
                System.out.println("优秀");
                break;
            default:
                System.out.println("仍需努力");
        }
    }
}
