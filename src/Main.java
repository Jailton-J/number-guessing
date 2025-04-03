import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] Args){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int hiddenNumber = random.nextInt(100) + 1; //A classe Random gera um número aleatório dentro do intervalo especificado.
    
        System.out.println("Um número de 1 a 100 foi gerado!");

        boolean answer = false;
        int attempts = 0;
        
        while (!answer && attempts < 5){
            System.out.println("Adivinhe o número:");
            int guess = scanner.nextInt();

            attempts++;
            
            if (guess == hiddenNumber){
                System.out.println("Parabens! Você acertou, era o número " + hiddenNumber);
                answer =true;
            } else if (Math.abs(guess - hiddenNumber) <= 3) {
                System.out.println("Está bem perto!");
            } else if (guess>hiddenNumber) {
                System.out.println("Tente um número menor.");
            } else if (guess<hiddenNumber) {
                System.out.println("Tente um número maior.");
            }  

        }
        if(!answer){
            System.out.println("Você excedeu as tentativas. O número correto era: " + hiddenNumber);
        } else {
        System.out.println("Você tentou "+ attempts+ " vezes");
        }
        
        scanner.close();
    }
}