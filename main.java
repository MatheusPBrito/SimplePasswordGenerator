package main;

import java.util.Scanner;
import java.util.Random;

public class main{

  public static void main(String... args){
    int digitos = 0; 
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    while(true){
      System.out.println("Quantos digitos? (maximo de 40 digitos)");
      if (input.hasNextInt()) {
        digitos = input.nextInt(); 
      }
      if (digitos < 41 && digitos > 0){
        char password[];
        int digitNumber = 0;
        for (int i = 0; i < digitos; i++){
            int randomNumber = rand.nextInt(94) + 33;
            digitNumber = randomNumber; 
            System.out.print((char)digitNumber); 
        }
        System.out.printf("\n");
        break;
      }
      else {
        System.out.println("digitos invalidos");
      }
    }
  }
}
