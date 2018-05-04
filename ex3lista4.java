import javax.swing.JOptionPane;

    public class ex3lista4{

     public static void main (String[] args){


         String[] nomes = new String [7];
         double[] produtos = new double [7];

         nomes[0] = "Bicicleta";
         nomes[1] = "Motoca";
         nomes[2] = "Sofá";
         nomes[3] = "Cadeira";
         nomes[4] = "Televisão";
         nomes[5] = "Torneira";
         nomes[6] = "Panela";

         produtos[0] = 50.00;
         produtos[1] = 35.00;
         produtos[2] = 25.00;
         produtos[3] = 15.00;
         produtos[4] = 60.00;
         produtos[5] = 45.00;
         produtos[6] = 95.00;


         JOptionPane.showMessageDialog(null, "Produto: " + nomes[0] + " -  Preço: R$" + produtos[0] +
                                             "\nProduto: " + nomes[1] + " -  Preço: R$" + produtos[1] +
                                             "\nProduto: " + nomes[2] + " -  Preço: R$" + produtos[2] +
                                             "\nProduto: " + nomes[3] + " -  Preço: R$" + produtos[3] +
                                             "\nProduto: " + nomes[4] + " -  Preço: R$" + produtos[4] +
                                             "\nProduto: " + nomes[5] + " -  Preço: R$" + produtos[5] +
                                             "\nProduto: " + nomes[6] + " -  Preço: R$" + produtos[6]);

     }
     
}                                                