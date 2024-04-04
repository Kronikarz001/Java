import java.util.Scanner; // Pakiet java.util, klasa Scanner

public class Imie {
    public static void main(String[] args) {
        // Tworzenie obiektu Scanner do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);
        
        // Prośba o wpisanie imienia
        System.out.print("Podaj swoje imię: ");
        
        // Wczytanie imienia od użytkownika
        String imie = scanner.nextLine();
        
        // Wyświetlenie powitania
        System.out.println("Witaj " + imie + "!");
        
        // Zamknięcie obiektu Scanner
        scanner.close();
    }
}
