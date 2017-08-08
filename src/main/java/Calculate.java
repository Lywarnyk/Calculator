import java.util.Scanner;

/**
 * Created by lywar on 02.08.2017.
 */
public class Calculate {
    static Calculator calc = new Calculator();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = "";
        while (!operation.equals("yes")) {

            System.out.println("What would you like to do: add/multi/sub/div");
            operation = sc.next();
            System.out.println("Enter first arg : ");
            String first = sc.next();
            System.out.println("Enter second arg :");
            String second = sc.next();
            switch (operation){
                case "add":
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));
                    end();
                    break;
                case "multi":
                    calc.multi(Integer.valueOf(first), Integer.valueOf(second));
                    end();
                    break;
                case "sub":
                    calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                    end();
                    break;
                case "div":
                    try {
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                        end();
                    }catch (MyException e ){
                        System.out.println(e.getMessage());
                        System.out.println("Please enter two args");
                    }
                    break;
                    default:
                        System.out.println("You should choose one of correct operations!");
                        break;

            }
            System.out.println("Exit: yes/no");
            operation = sc.next();
            System.out.println("");

        }
        sc.close();
        System.out.println("Goodbye)");
    }

    private static void end() {
        System.out.println(("Result : " +calc.getResult()));
        calc.cleanResult();
    }
}
