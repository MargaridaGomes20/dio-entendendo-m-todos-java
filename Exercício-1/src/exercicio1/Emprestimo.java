package exercicio1;

/**
 *
 * @author marga
 */
public class Emprestimo {
    
    public static void calcular(int parcelas, double valor){
        
        double taxa1 = 0.02; // taxa para numero de parcelas de 2 a 5
        double taxa2 = 0.06; // taxa para numero de parcelas de 6 a 10
        double taxa3 = 0.10; // taxa para número de parcelas de 11 ou mais
        
        if(parcelas>=1 && parcelas<=5){
            valor = valor + (valor * taxa1);
            System.out.println("Valor com juros é: " + valor);
        }
        
        if(parcelas>=6 && parcelas<=10){
            valor = valor + (valor * taxa2);
            System.out.println("Valor com juros é: " + valor);
        }
        
        if(parcelas>=11){
            valor = valor + (valor * taxa3);
            System.out.println("Valor com juros é: " + valor);
        }
        
    }
}
