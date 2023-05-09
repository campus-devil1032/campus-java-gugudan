import java.util.Scanner;
 
public class gugudan {
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(" ╢э ют╥б ");
        int num = scanner.nextInt(); 
        
        for (int j = 1; j< 10; j++) { 
            System.out.println(num + "*" + j + "= " + (num*j));
            
        } 
        scanner.close();
        }
 
}