import java.util.Scanner;
//inicio do programa
public class semanapromocional {

    public static void main(String[] args) {
        //inicio da programação 
        //declaração de variáveis
        String produto;
        double valor, desconto;
       
        //entrada e processamento de dados
        
       Scanner leitor = new Scanner(System.in);
       for (int i=1; i<11; i++) { //laço de repetição para 10 produtos 
           
           System.out.println("===========================================");
           System.out.println("Semana de Aniversário da Padaria de Joaquim");
           System.out.println("Informe o produto "+i+":");
           produto = leitor.next();
           System.out.println("Informe o valor:");
           valor = leitor.nextDouble();
           desconto = (valor / 2);
           
           
           //saida de dados
           System.out.println("O valor do produto "+produto+" com desconto é "+desconto+".");
          
       } //fim da programação
    }
} //fim do programa
