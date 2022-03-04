package exercicio1;

/**
 * @author Margarida Silva
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        System.out.println("EXERCÍCIO CALCULADORA");
        Calculadora.soma(10, 2);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(10, 2);
        Calculadora.divisao(5, 2);
        
        System.out.println("\nEXERCÍCIO MENSAGENS");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(19);
        
        System.out.println("\nEXERCÍCIO EMPRÉSTIMO");
        Emprestimo.calcular(5, 100);
        Emprestimo.calcular(10, 200);
        Emprestimo.calcular(15, 300);
    }
    
}
