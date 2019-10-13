package bibliotekaPlyt;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplikacja {
    private static final Biblioteka BIBLIOTEKA = new Biblioteka();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner odczyt = new Scanner(System.in);
        Scanner odczyt2 = new Scanner(System.in);
        String tmp;

        do  {
            System.out.println("1 - Jeżeli chcesz zapisać bibliotekę");
            System.out.println("2- Jeżeli chcesz odczytać dane biblioteki");
            System.out.println("3 - Jeżeli chcesz wyświetlić dane biblioteki");
            System.out.println("4 - Dodać płytę");
            System.out.println("5 - usunaąć płytę");
            System.out.println("6 - wyszukać płytę");
            System.out.println("0 = zakończyć proram");

            tmp = odczyt.nextLine();

            switch(tmp) {
                case"1":
                    BIBLIOTEKA.save();
                    break;
                case "2":
                    BIBLIOTEKA.read();
                    break;
                case "3":
                    System.out.println(BIBLIOTEKA);
                    break;
                case "4":
                    System.out.println("Podaj nazwę płyty");
                    String title = odczyt.nextLine();
                    System.out.println("Podaj rok wydania płyty");
                    String year = odczyt.nextLine();
                    List<Utwor> lista = new ArrayList<>();
                    CD cd = new CD(title, year, lista);
                    BIBLIOTEKA.addCD(cd);
                    do {
                        System.out.println("Podaj nazwę utworu");
                        String nazwaUtworu = odczyt.nextLine();
                        System.out.println("Podaj wykonawcę utworu");
                        String artist = odczyt.nextLine();
                        System.out.println("Podaj długość utworu");
                        Double dlugoscUtworu = odczyt2.nextDouble();
                        lista.add(new Utwor(title, artist, dlugoscUtworu));
                        System.out.println("Czy dodac kolejny utwór?");
                        String wybor = odczyt.nextLine();
                        if("n".equals(wybor)) {
                            break;
                        }
                    }while(true);
                    break;
                case "5":

                        break;
                case "6":
                    System.out.println("Podaj nazwę płyty, którą chcesz wyszukać");
                    String nazwaPlyty = odczyt.nextLine();
                    CD searchResult = BIBLIOTEKA.search(nazwaPlyty);
                    if(searchResult != null) {
                        System.out.println(searchResult);
                    } else System.out.println("Nie znaleziono nazwy płyty o podanej nazwie");
                    break;
            }
            if("0".equals(tmp)) {
                break;
            }


        }while(true);


    }
}
