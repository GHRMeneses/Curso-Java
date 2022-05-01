//Exercício de fixação
import java.util.Locale;


public class Exercicio {

    public static void main(String[] args) {
        
        String produto1 = "Computer";
        String produto2 = "Office desk";
        
        int idade = 30;
        int code = 5290;
        char gender = 'F';
        
        double preco1 = 2100.0;
        double preco2 = 650;
        double measure = 53.234567;
        
        System.out.println(produto1 + ", which price is $ " + preco1);
        System.out.println(produto2 + ", which price is $ " + preco2);
        System.out.printf("RECORD: %d years old, code %d and gender: %s %n", idade, code, gender);
        System.out.printf("Measue with decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places) %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
       
    }
}
