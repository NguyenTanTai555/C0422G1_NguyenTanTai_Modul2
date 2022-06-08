package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int draw;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--- Menu Draw ---" +
                    "\n 1 . Print the rectangle" +
                    "\n 2 . Print the square triangle" +
                    "\n 3 . Print isosceles triangle" +
                    "\n 4 . Exit" +
                    "\n Enter Number ");
            draw = Integer.parseInt(scanner.nextLine());
            switch (draw) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*" + "  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("- Print the  square triangle -");
                    System.out.println("-- Print botton-left -- ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("-- Print top-left -- ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("--- Print top-right-- ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int a = 1; a <= i; a++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("-- Print botton-right -- ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j > 5 - i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("-- Print isosceles triangle --");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println(" Please enter number >0 & <5");
            }

        } while (flag);

    }
}


