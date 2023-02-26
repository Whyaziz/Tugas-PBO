import java.util.ArrayList;
import java.util.Arrays;

public class assignment1 {
    public static void main (String[] args){

        ArrayList<String> belanja = new ArrayList<String>(Arrays.asList("Cabai","Bayam","Bawang","Tempe","Beras"));

        System.out.println("Daftar belanja Dina adalah sebagai berikut : "+belanja);
        System.out.println("===Catatan Belanja===");
        for (String i : belanja){
            System.out.println(i);
        }

    }
    
}
