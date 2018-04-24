import javax.swing.JOptionPane;

public class ExemploWhile05{

    public static void main (String[]args){

    String nome = JOptionPane.showInputDialog(
    "\n 1 Pizza de calabresa R$ 25,00" +
    "\n 2 Pizza de 4 queijos R$ 27,00" +
    "\n 3 Pizza de bacon R$ 45,00" +
    "\n4 - Sair");

    double preco = 0, precoTotal = 0;
    int numero = 0;
    while (numero != 4){
        if(numero == 1){
            preco = 25.00;
        }else if (numero == 2){
            preco = 27.00;
        }else if(numero == 3){
            preco = 45.00;
        }

    JOptionPane.showMessageDialog(null,
    "O preço é: "+ preco);

    //ctrl+shift+botão direito para edição em lotes
    numero = Integer.parseInt(
        JOptionPane.showInputDialog(
             "\n 1 Pizza de calabresa R$ 25,00" +
             "\n 2 Pizza de 4 queijos R$ 27,00" +
             "\n 3 Pizza de bacon R$ 45,00" +
             "\n4 - Sair"));
    }
    }
}