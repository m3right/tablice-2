import java.io.*;

public class Main {

   public static int suma(int[] tablica, int rozmiar) {
      int s = 0;
      for ( int i = 0; i < rozmiar; i++ )
         s += tablica[i];
      return s;
   }

   public static int minimum(int[] tablica, int rozmiar) {
      int min = tablica[0];
      for ( int i = 1; i < rozmiar; i++ )
         if ( tablica[i] < min )
            min = tablica[i];
      return min;
   }
  public static float average(int[] tablica, int rozmiar) {
      float average = (float)suma(tablica,rozmiar)/rozmiar;
    return average;
      
   }
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe: ");
         tablica[i] = Integer.parseInt(in.readLine());
      }
   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
     try{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int r;
        System.out.println("Podaj rozmiar: ");
        r = Integer.parseInt(in.readLine());
        int[] t = new int[r];
        wczytaj_tablice(t, r);
        System.out.println("To jest suma: " + suma(t,r));
        System.out.println("To jest minimum: " + minimum(t,r));
        System.out.println("To jest srednia: " + average(t,r));
     }
     catch(IOException e)
     {
     }
     
     
      
   }
}

/*
 * Cwiczenia:
 * 1. Z pomoca zaproponowanych funkcji napisz programy podajace 
 * odpowiednio sume i minimum podanych przez uzytkownika (lub wygenerowanych) liczb.
 * 2. Napisz funkcje obliczajaca srednia dla podanego (lub 
 * wygenerowanego) ciagu liczb.
 */
 
