import java.util.Scanner;

public class Main {


   /* public static void drawLine(String ch, int length) {

        for (int i = 0; i <= length; i++) {
            System.out.print(ch);

        }
        System.out.println("\n"+"welcome");
    }*/




    public static int sumNumber() {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter counter");
        int counter = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {

            System.out.println("enter number ");

            int number = scanner1.nextInt();
            sum+=number;
          }
        return  sum ;
    }
    public static int Average()
    {
        int Average = (sumNumber() / 3);
        System.out.println(" Average = "+"\t"+Average);
        return Average;
    }

    public static void main(String[] args) {

Average();
    }
}