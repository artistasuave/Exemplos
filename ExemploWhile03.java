import javax.swing.JOptionPane;

public class ExemploWhile03{

    public static void main (String[]args){
        
        int quatidadeMaxima = 4;
        int atual = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        String nome = " ";

        while(atual < quantidadeMaxima){
            String nome = JOptionPane.showInputDialog(null, "Digite seu nome");

          int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade"));

          if (idade > maiorIdade){
              maiorIdade = idade;
          }
          System.out.println("Atual: "+atual;
          atual = atual +1);
        }
        JOptionPane.showMessageDialog(null, "A maior idade é: "+maiorIdade);
    }
}