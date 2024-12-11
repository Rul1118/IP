//Repas de xarxes2: 
// Fes un programa que et demani una adreça IP en format decimal (Ex: 192.164.0.4)  El programa cal que et retorni si l’adreça és 
// de classe A, B, C, D o E. Cal comprovar que la IP té el format correcte (4 números de 0 a 255) i anar demanant fins que 
// sigui correcte

    // Classe A: entre 0 i 127.
    // Classe B: entre 128 i 191.
    // Classe C: entre 192 i 223.
    // Classe D: entre 224 i 239.
    // Classe E: entre 240 i 255.

package EstructuresRepeticio;
import java.util.Scanner;

public class EstructuresRepeticio2_3 {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Definim les variables que utilitzarem per demanar els 4 blocs de la IP.
    int num1;
    int num2;
    int num3;
    int num4;

    // Demanem al usuari quatre vegades que introdueixi els numeros per formar la IP.
    System.out.print("Introdueix els primers 3 numeros de la IP: ");
        num1 = scanner.nextInt();

    System.out.print("Introdueix els segons 3 numeros de la IP: ");
        num2 = scanner.nextInt();

    System.out.print("Introdueix els tercers 3 numeros de la IP: ");
        num3 = scanner.nextInt();

    System.out.print("Introdueix els quarts 3 numeros de la IP: ");
        num4 = scanner.nextInt();

    // Fem una condicio per establir la classe de la IP nomes mirant els tres primers numeros i la mostrem per pantalla.
    if (num1 >0 && num1 <= 127) {
        System.out.println("La IP es de Classe A. ");
    } else if (num1 >=128 && num1 <= 191) {
        System.out.println("La IP es de la Classe B.");
    } else if (num1 >=192 && num1<= 223) {
        System.out.println("La IP es de la Classe C.");
    } else if (num1 >=224 && num1 <= 239) {
        System.out.println("La IP es de la Classe D.");
    } else if (num1 >=240 && num1 <=255) {
        System.out.println("La IP es de la classe E.");
    } else {
        System.out.println("Numero fora de rang. Introdueix un numero entre 0 i 255.");
    }

    // Mostrem per pantalla la IP ben formada.
    System.out.print("La direccio IP es: " + num1 + "." + num2 + "." + num3 + "." + num4);

    scanner.close();

    }
}