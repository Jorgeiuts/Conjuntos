import java.util.HashSet;
import java.util.Scanner;

public class Conjuntos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        HashSet<String> lenguage1 = new HashSet();
        HashSet<String> lenguage2 = new HashSet();
        int numberOfWords;
        int menuValue = 0;

        System.out.println("Cuantas palabras tiene el lenguaje 1");
        numberOfWords = s.nextInt();
        System.out.println("Porfavor ingresa las " + numberOfWords + " palabras del lenguaje 1: ");
        for (int i = 0; i < numberOfWords; i++){
            String word = s.next();
            lenguage1.add(word);
        }

        System.out.println("Cuantas palabras tiene el lenguaje 2");
        numberOfWords = s.nextInt();
        System.out.println("Porfavor ingresa las " + numberOfWords + " palabras del lenguaje 2: ");
        for (int i = 0; i < numberOfWords; i++){
            String word = s.next();
            lenguage2.add(word);
        }

        while(menuValue != 6){
            showMenu();
            menuValue = s.nextInt();
            action(menuValue, lenguage1, lenguage2);
        }

    }

    public static void showMenu() {
        System.out.println("MENU");
        System.out.println(" ");
        System.out.println("Porfavor digite alguna de las siguientes opciones:");
        System.out.println(" ");
        System.out.println("1) Interseccion");
        System.out.println("2) Diferencia");
        System.out.println("3) Concatenacion");
        System.out.println("4) Prefijos de una palabra");
        System.out.println("5) Sufijos de una palabra");
        System.out.println("6) Salir del sistema");
    }

    public static void action(int valueOption, HashSet<String> lenguage1, HashSet<String> lenguaje2){
        switch (valueOption){
            case 1:
                intersection(lenguage1, lenguaje2);
                break;
            case 2:
                difference(lenguage1, lenguaje2);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Porfavor ingresa un valor entre 1 y 6");
                break;
        }
    }

    public static void intersection(HashSet<String> lenguage1, HashSet<String> lenguage2){
        HashSet<String> intersection = new HashSet<>();

        for (String word: lenguage1) {
            if(lenguage2.contains(word)) {
                intersection.add(word);
            }
        }

        System.out.println("El resultado es: ");
        System.out.print("{ ");
        for (String word: intersection) {
            System.out.print(word + ", ");
        }
        System.out.println("}");
    }

    public static void difference(HashSet<String> lenguage1, HashSet<String> lenguage2){
        HashSet<String> difference = new HashSet<>();

        for (String word: lenguage1) {
            if(!lenguage2.contains(word)) {
                difference.add(word);
            }
        }

        System.out.println("El resultado es: ");
        System.out.print("{ ");
        for (String word: difference) {
            System.out.print(word + ", ");
        }
        System.out.println("}");
    }

}
