import javax.swing.JOptionPane;

    public class ex7lista4{

     public static void main (String[] args){

         double[] altura = new double[4];
         double menorAltura = 0;  

         altura[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da Girafa"));
         altura[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da Zebra"));
         altura[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do Urso"));
         altura[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do Elefante"));

         menorAltura = Double.MAX_VALUE;

          if(altura[0] < menorAltura){
             menorAltura = altura[0];
         }  
          if(altura[1] < menorAltura){
             menorAltura = altura[1];
         }  
          if(altura[2] < menorAltura){
             menorAltura = altura[2];
         }
          if(altura[3] < menorAltura){
             menorAltura = altura[3];
         }

         JOptionPane.showMessageDialog(null, "A menor altura é: " + menorAltura);



         


     }

}          