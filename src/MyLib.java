import java.util.Scanner;

public class MyLib {
    private static final Scanner sc = new Scanner(System.in);

    public static int inputInt(String message, int min, int max) throws Exception {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            int number = Integer.parseInt(input);
            if (number >= min && number <= max) {
                return number;
            } else {
            }
        }
    }
    // Nhập số nguyên không giới hạn
    public static int inputInt(String message) throws Exception {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            return Integer.parseInt(input); 
        }
    }

    // Nhập số thực
    public static double inputDouble(String message) throws Exception {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            return Double.parseDouble(input);
        }
    }

    // Nhập chuỗi không rỗng
    public static String inputString(String message) throws Exception {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("❌ Input must not be empty.");
            }
        }
    }

    // Nhập ký tự (chỉ 1 ký tự)
    public static char inputChar(String message) throws Exception {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("❌ Please enter exactly one character.");
            }
        }
    }
}
