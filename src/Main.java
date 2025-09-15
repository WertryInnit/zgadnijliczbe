import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("noelo");
        //typy proste
        //zmienne nie obiekty- pisane małymi literami
        //typy całkowite
        byte liczba=120;
        short liczba2=300;
        int liczba3=123123;
        long liczba4=321321321;
        //System.out.println("liczba Całkowite "+liczba4);
        //typy zmiennoprzecinkowe
        float liczba5=12.121f;
        double liczba6=12.12321;
        //typy logiczne
        boolean toczynie=true;
        //typ znakowy
        char znak='a';
        /*
        * napisz program w którym zgadniesz liczbe wylosowana z zakresu od 1-100
        *
        * */
        int LosowaLiczba= (int)(Math.random()*100+1);//rzutowanie
        //wpisywanie liczby
        System.out.println("podaj liczbe");
        Scanner LiczbapInput=new Scanner(System.in);
        int wpisanaliczba=LiczbapInput.nextInt();
        if(LosowaLiczba==wpisanaliczba){
            System.out.println("Prawidłowa liczba");
        }
        else{
            System.out.println("zle prawidłowa liczba to"+LosowaLiczba);
        }








    }
}