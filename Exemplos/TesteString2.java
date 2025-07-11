public class TesteString2 {
       private static void aumentarLetras() throws Exception
       {
              String frase = null;
              String novaFrase = null;
              try
              {
                     novaFrase = frase.toUpperCase();
              }
              catch(NullPointerException e)
              {
                     System.out.println("A frase inicial está nula, para resolver, foi lhe atribuido um valor default.");
                     frase = "Fraze vazia";
                     novaFrase = frase.toUpperCase();
              }
              System.out.println("Frase antiga: " + frase);
              System.out.println("Frase nova: " + novaFrase);
       }
       public static void main(String args[])
       {
              try{
                     aumentarLetras();
              }
              catch(Exception e){
                     System.out.println("Ocorreu uma excesão ao execultar o método aumentarLetras()" + e);
              }
       }
}
