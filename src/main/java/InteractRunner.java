import org.omg.CORBA.UserException;

import java.util.Scanner;

/**
 * Created by lywar on 02.08.2017.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String exit = "no";
            Calculator calculator = new Calculator();
            while (!exit.equals("yes")){
                System.out.println("Enter first arg : ");
                String first = sc.next();
                System.out.println("Enter second arg :");
                String second = sc.next();

                try {
                    calculator.div(Integer.valueOf(first), Integer.valueOf(second));
                }catch (MyException e ){
                    System.out.println(e.getMessage());
                    System.out.println("Please enter two args");
                }

                System.out.println(("Result : " +calculator.getResult()));
                calculator.cleanResult();
                System.out.println("Exit: yes/no");
                exit = sc.next();
            }
        } finally {
            sc.close();
        }
    }
}
