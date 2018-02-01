package calculatrice2;

import java.util.Scanner;

public class calculette { 
  	
     	public static void main(String []args) {


	Scanner sc = new Scanner(System.in);

 		int a = 0;
		int b = 0;


	System.out.println("Entrez le premier nombre: ");
 		a = sc.nextInt();

System.out.println("Entrez le deuxieme nombre: ");
b = sc.nextInt();


	System.out.println("L'addition de " + a + " et de " + b + " est égale à " + (a+b));
	System.out.println("La soustraction de " + a + " et de " + b + " est égale à " + (a-b));
   	System.out.println("La multiplication de " + a + " et de " + b + " est égale à " + (a*b));

	
  }
    }