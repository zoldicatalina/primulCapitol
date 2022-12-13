import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myVariables();
        cerinta2();
        cerinta7();
        myVariables2();
        cerinta4();
        cerinta1();
        cerinta3();
    }



    static void cerinta1() {

        System.out.println("Imi place Java");
    }

    static void cerinta2() {
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

    }

    static void cerinta3() {
        System.out.println(24 - 6);
    }

    public static void cerinta4(){
        System.out.println("In cos am mere din livada");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Textul citit de la tastatura este:" + text);
    }

    public static void myVariables(){
        int intreg = 6;
        System.out.println("Intreg:" + intreg);
        String acasa = "acasa";
        System.out.println("String:" + acasa);
        boolean estefalse = false;
        System.out.println("Boolean:" + estefalse);

    }

    public static void myVariables2(){
        System.out.println("Numar 8");
        System.out.println("Numar 3");
        Scanner scanner = new Scanner(System.in);
        String numar = scanner.nextLine();
        System.out.println("Intreger citit este:" + numar);
    }

    public static void cerinta7(){
        Scanner scanner = new Scanner(System.in);
        double nr= scanner.nextDouble();
        System.out.println("Afiseaza double:" + nr);
        double suma = nr + 5;
        double scadere = nr - 12.3;
        double inmultire = nr * -3.2;
        double impartire = nr / 4;
        double modul = nr % 6;
        System.out.println("suma:" + suma + "scadere:" + scadere + "inmultire:" + inmultire + "impartire:" + impartire + "modul:" + modul);
    }

  }





















