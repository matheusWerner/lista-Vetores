import javax.swing.JOptionPane;

    public class ex2lista4{

     public static void main (String[] args){

         String[] nomes = new String[10];

         nomes[0] = "Daniel";
         nomes[1] = "Maria";
         nomes[2] = "Fabricio";
         nomes[3] = "Tony";
         nomes[4] = "Amarildo";
         nomes[5] = "Josué";
         nomes[6] = "Arnaldo";
         nomes[7] = "Carlos";
         nomes[8] = "Fernando";
         nomes[9] = "Mario";

         JOptionPane.showMessageDialog(null, nomes[0] + "\n" + 
                                             nomes[1] + "\n" +
                                             nomes[2] + "\n" + 
                                             nomes[3] + "\n" +
                                             nomes[4] + "\n" + 
                                             nomes[5] + "\n" +
                                             nomes[6] + "\n" + 
                                             nomes[7] + "\n" +
                                             nomes[8] + "\n" + 
                                             nomes[9] + "\n");
     

     }

}           