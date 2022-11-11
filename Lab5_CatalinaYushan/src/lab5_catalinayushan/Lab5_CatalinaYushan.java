package lab5_catalinayushan;

import java.util.Scanner;

public class Lab5_CatalinaYushan {

    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner input = new Scanner (System.in);
        int opcion = 0;
        boolean choice=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("1. Conjuntos");
        System.out.println("2. Cifrado por Substitución");
        System.out.println("3. Sobre");
        System.out.println("4.Salir");

        System.out.println("Presione el numero que desea realizar: ");
        
         switch(opcion){
            case 1:
                conjuntos();
                break;
            case 2:
                break;
            case 3:
                envelope();
                break;
            case 4:
                System.out.println("Adios! No vuelvas, por favor");
            default:
        }
    }
    public static void conjuntos(String falar,String obrigado){
        Scanner input = new Scanner (System.in);
        int letras = 0;
        System.out.println("Ingrese una cadena de letras separandos estas con una coma: ");
        String abc = input.nextLine();
        System.out.println("Ingrese una segunda cadena de letras separada por comas: ");
        String letters = input.nextLine();
         
        if (abc.equals(letters)){
            System.out.println("Ambos conjuntos son iguales"); 
        }
        }
    public static void envelope(int asterisks){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el tamaño (altura) del sobre: ");
        
        System.out.println("Ingrese el tipo de cáracter que desea usar (*,/,^.!,etc.): ");
        
    }
   
    }    







