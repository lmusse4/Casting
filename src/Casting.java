public class Casting {
    public static void main(String[] args) {
        double myDouble = 112.35;
        int myInt = (int) myDouble;
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);

        String stringNum = "49";
        int secondInt = Integer.parseInt(stringNum);
        System.out.println("The string value is: " + stringNum);
        System.out.println("The integer value is: " + secondInt);
    }
}
