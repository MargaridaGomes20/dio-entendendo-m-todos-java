package exercicio1;

/**
 * @author marga
 */
public class Calculadora {
    
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("Somando  " + numero1 + " com " + numero2 + ":\nO resultado é = " + resultado);
    }
    
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Subtraindo  " + numero1 + " do " + numero2 + ":\nO resultado é = " + resultado);
    }
    
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Multiplicando  " + numero1 + " pelo " + numero2 + ":\nO resultado é = " + resultado);
    }
    
    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Dividindo  " + numero1 + " pelo " + numero2 + ":\nO resultado é = " + resultado);
    }
}
