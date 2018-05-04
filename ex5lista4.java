import javax.swing.JOptionPane;

    public class ex5lista4{

     public static void main (String[] args){

         double[] pesos = new double[5];
         double soma;
         double media;

         pesos[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro peso"));
         pesos[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo peso"));
         pesos[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro peso"));
         pesos[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe o quarto peso"));
         pesos[4] = Double.parseDouble(JOptionPane.showInputDialog("Informe o quinto peso"));

         soma = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4];

         media = soma / 5;

         JOptionPane.showMessageDialog(null, "Soma total dos pesos: " + soma +
                                       "\nMedia dos pesos: " + media);


     }

}                                        


