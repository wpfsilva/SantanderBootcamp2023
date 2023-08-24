public class Operadores {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 15.7; // + equals soma
        int subtração = 121 - 32; // - equals subtração
        int multiplicação = 232 * 10; // * equals multiplicação
        int divisão = 100/2; // / equals divisão
        int modulo = 18%3; // % equals modulo
        double resultado = (10*7) + (20/4)%5;
        boolean booleano = true;
        booleano = !booleano; // true ==>>> vira false
        String nomeCompleto = "Waldemar " + "Silva";
        System.out.println(nomeCompleto);
        // num-- decremento
        // num++ incremento
        // ! operador de negação
        // x = x+1 equals x += 1 
        // x = x-1 equals x -= 1 
        // x = x*1 equals x *= 1 
        // x = x/1 equals x /= 1 
        // x = x % 1 equals x %= 1 
        // num ++ incrementa após
        // ++num incrementa antes
        int a = 5;
        int b = 5;

        //Normal
        if (a == b)
            System.out.println("Verdadeiro");
        else
            System.out.println("Falso");
        //----Operadores Ternários----
        
        b = 6;

        String ternario = a==b ? "Verdadeiro" : "Falso";
        System.out.println(ternario);
        
        int ternario2 = a==b ? 1 : 0;
        System.out.println(ternario2);


        // Condições

        boolean condição1 = true;
        boolean condição2 = false;

        if (condição1 && condição2)
            System.out.println("As duas condições são verdadeiras");
        
        if (condição1 || condição2)
            System.out.println("Uma das duas condições é verdadeira");
        
        if ( condição1 && (7 > 4))
        {
            System.out.println("As duas condições são verdadeiras");
        }
        
    }
}
