package oop;

public class Loops4a {


    int Liczba = 2;

    static int[] tablicaLiczb;


    //psvm

    public static void main(String[] args) {

        tablicaLiczb = new int[3];

        tablicaLiczb[0] = 10;
        tablicaLiczb[1] = 20;
        tablicaLiczb[2] = 30;

        for (int number : tablicaLiczb) {
            System.out.println("Liczba : " + number);
        }
        //pętla for klasyczna:
        //dla każdego (inicjacja ; weryfikacja ; aktualizacja)


        for (int i = 0; i < 3; i++) {
            System.out.println("Liczba : " + tablicaLiczb[i]);
            tablicaLiczb[i]++;

        }
        //dopóki (warunek jest prawdziwy ) {
        // wykonuj kod;
        //}

        int i = 1;
        while (i < 10) {
//            System.out.println(++i);
            System.out.println(i++);
            if (i == 5) System.out.println("jestem w połowie");
        }
    }
}








//import java.util.Arrays;
//import java.util.List;

//public class Collections4a {





//static List<String> lista = new ArrayList<>();
//static List<String> lista2 = Array.asList("ala", "ma", "kota")

//public static

