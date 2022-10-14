package com.start_part_A;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("dnyanesh nimbalkar");
            case 2 -> System.out.println("dnyanada nimbalkar");
            case 3 -> {
                System.out.println("employ ID 3");
                switch (department) {
                    case "comp" -> System.out.println("computer department");
                    case "stat" -> System.out.println("Statistics department");
                    default -> System.out.println("enter valid department");
                }
            }
            default -> System.out.println("enter valid employ ID");
        }

    }
}
