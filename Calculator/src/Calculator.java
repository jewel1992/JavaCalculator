import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner helper = new Scanner(System.in);  // scanner is for input
        double fnum, snum, answer; // made 3 variables for the numbers

        System.out.println("Enter first number:  "); //
        fnum = helper.nextDouble(); //store whatever was typed into fnum

        System.out.println("Enter Second number: ");
        snum = helper.nextDouble();

        answer = fnum + snum;
        System.out.println(answer);

        }
    }
