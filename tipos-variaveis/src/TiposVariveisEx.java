public class TiposVariveisEx {
    public static void main(String[] args) {
        
        // TIPOS PRIMITIVOS
        int idade = 22;                     // inteiro
        double altura = 1.55;               // número decimal
        char inicial = 'V';                 // caractere
        boolean estudante = true;          // verdadeiro ou falso

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("É estudante? " + estudante);

        // STRING - Classe para texto
        String nomeCompleto = "Victória Carvalho";

        // Alguns métodos úteis da classe String
        System.out.println("\nNome completo: " + nomeCompleto);
        System.out.println("Quantidade de letras: " + nomeCompleto.length());
        System.out.println("Tudo em maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Tudo em minúsculas: " + nomeCompleto.toLowerCase());
        System.out.println("Primeira letra: " + nomeCompleto.charAt(0));
        System.out.println("Contém 'Carvalho'? " + nomeCompleto.contains("Carvalho"));
        System.out.println("Parte do nome: " + nomeCompleto.substring(6)); // a partir da posição 6

        // Comparando strings
        String senhaDigitada = "Java123";
        String senhaCorreta = "java123";

        boolean senhaIgual = senhaDigitada.equals(senhaCorreta);
        boolean senhaIgnoraMaiuscula = senhaDigitada.equalsIgnoreCase(senhaCorreta);

        System.out.println("\nSenha exata? " + senhaIgual);
        System.out.println("Senha correta (ignorando maiúsculas)? " + senhaIgnoraMaiuscula);
    }
}

/*public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;



    
 */

