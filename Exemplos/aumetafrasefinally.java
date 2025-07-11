public class aumetafrasefinally {
       public static void main(String args[]) {
              String frase = null;
              String novaFrase = null;
              try {
                     novaFrase = frase.toUpperCase();
              } catch (NullPointerException e) {
                     System.out.println(
                                   "A frase inicial está nula, para resolver, foi lhe atribuido um valor default.");
                     frase = "Fraze vazia";
              } finally {
                     novaFrase = frase.toUpperCase();
              }
              System.out.println("Frase antiga: " + frase);
              System.out.println("Frase nova: " + novaFrase);
       }
}