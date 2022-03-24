import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        
       System.out.println("Olá Mundo!");
       System.out.println("Bom dia!");
       //Testando quebra de linda
       
       System.out.print("Olá Mundo!");
       System.out.println("Bom dia!");
       //testando sem quebra de  linha
       
       int y = 32;
       System.out.println(y);
       //Testando variável int
       
       double x = 10.578463;
       System.out.println(x);
       //Testando variável double
       
       System.out.printf("%.2f%n", x);
       //Testtando com duas casas decimais
       
       System.out.printf("%.4f%n", x);
       //Testtando com quatro casas decimais
       
       Locale.setDefault(Locale.US);
       System.out.printf("%.4f%n", x);
       //Testanto como usar . inves de ,
       
       System.out.println("RESULTADO = " + x + " METROS");
       //Contatenando vários elementos em um memso comando de escrita
    
       System.out.printf("RESULTADO = %.2f metros%n", x);
       //Contatenando vários elementos em um mesmo comando de escrita
    
       String nome = "Maria";
       int idade = 24;
       double renda = 4000.0;
       System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome, idade, renda);
       //Contatenando varios elementos em um mesmo comando de escrita, mas tendo uma String, int e double
               
    }

}

