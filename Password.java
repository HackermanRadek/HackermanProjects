
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("====");

        System.out.println("Please, enter your password:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Please, repeat your password:");
        String password2 = scanner.nextLine();
        if(password.length()<8){
            System.out.println("Your password should have atleast 8 charakters");
        }


        else if(password.equals(password2)){
            System.out.println("Your password is OK!");
        }else{
            System.out.println("Wrong password!");
        }

        }

                }








