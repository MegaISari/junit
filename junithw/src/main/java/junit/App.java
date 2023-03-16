package junit;

public class App {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int divInt(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Can't divide by 0");
        }
        return num1 / num2;
    }

    public void voidCheck(String input) {
        if ("Check".equalsIgnoreCase(input)) {
            System.out.println("Working on something");
            ;
        } else {
            throw new IllegalArgumentException("Bad argument:" + input);
        }
    }

    public boolean returnABoolean(String input) {
        if ("Save".equalsIgnoreCase(input)) {
            return true;
        } else {
            return false;
        }
    }
}