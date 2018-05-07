import javax.swing.JOptionPane;

    public class ex1lista4{

     public static void main (String[] args){


         int[] numeros = new int[16];
         int soma = 0;


        numeros[0] = 21;  
        numeros[1] = 45;
        numeros[2] = 36;
        numeros[3] = 14;
        numeros[4] = 11;
        numeros[5] = 7;
        numeros[6] = 9;
        numeros[7] = 55;
        numeros[8] = 22;
        numeros[9] = 17;
        numeros[10] = 89;
        numeros[11] = 71;
        numeros[12] = 2;
        numeros[13] = 31;
        numeros[14] = 25;
        numeros[15] = 79;


        soma = numeros[0] +
               numeros[1] +
               numeros[2] +
               numeros[3] +
               numeros[4] +
               numeros[5] +
               numeros[6] +
               numeros[7] +
               numeros[8] +
               numeros[9] +
               numeros[10] +
               numeros[11] +
               numeros[12] +
               numeros[13] +
               numeros[14] +
               numeros[15];


               JOptionPane.showMessageDialog(null,"A soma dos vetores é: " + soma);


     }

}               
               

