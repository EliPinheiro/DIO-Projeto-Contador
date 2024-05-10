import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);
            

            System.out.println("Enter the first number");
            int first = scanner.nextInt();

            System.out.println("Enter the second number");
            int second = scanner.nextInt();
        


            interacao(first, second);
        
    }

    static void interacao(int first, int second) throws ParametrosInvalidosException{
        if(first >= second){
            throw new ParametrosInvalidosException("The second number must be greater than zero. ");
        }
        else{
            int result = second - first;
            
            for(int x=1; x <= result; x++){
                System.out.println("Printing number "+x);
            }
        }
    }
}
