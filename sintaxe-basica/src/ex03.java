public class ex03 {
    
    public static void main(String[] args) {
    String nome = "Victória Eduarda";

    System.out.println("Quantas letras tem: " + nome.length());
    System.out.println("Qual o 1º nome?" + nome.substring(0, nome.indexOf(" ")));
    System.out.println("Tudo em maiúsculo: " + nome.toUpperCase());
    System.out.println("Tem a letra a? "+ nome.contains("a"));

    }

}
