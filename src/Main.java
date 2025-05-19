import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //HashMap<Targa,Proprietario>=
        String nome, cognome, targa;
        for (int i=1;i<4;i++){
            System.out.print("Inserisci il nome del proprietario "+i+": ");
            nome= input.next();
            System.out.print("Inserisci il cognome del proprietario "+i+": ");
            cognome= input.next();
            System.out.print("Inserisci la targa del veicolo "+i+": ");
            targa= input.next();
        }

    }
}