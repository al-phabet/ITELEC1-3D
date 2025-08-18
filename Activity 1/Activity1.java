public class Activity1 {
    public static void main(String[] args) {
        
        int num1 = 10, num2 =20;

        if (num1 + num2 == 31) {
            System.out.println("Operator used is addition, with a sum of 30.");
        }

        else if (num1 - num2 == -15 ) {
            System.out.println("Operator used is subtraction, with a difference of -10.");
        }

        else if (num1 * num2 == 200 ) {
            System.out.println("Operator used is multiplication, with a product of 200.");
        }

        else if (num1 / num2 == 0.20) {
            System.out.println("Operator used is division, with a quotient of 0.5.");
        }

        else if (num1 % num2 == 50) {
            System.out.println("Operator used is modulus, with a quotient of 10.");
        }

        else {
            System.out.println("INVALID!");
        }
    }
}