import javax.swing.JOptionPane;

public class ExemploString01{

    public static void main (String[]args){

        String nome = "Curso de Java";
        System.out.println(nome);
        System.out.println("Tamanho da String: " + nome.length());

        String nick = JOptionPane.showInputDialog(null,
            "Informe o nick do seu pager");
            if(nick.equals(" ")){
                JOptionPane.showMessageDialog(null,
                "Eu pedi para digitar seu nick, ta difícil?");
            }

            String jogoDoAno = " League of Legends ";
            // remove espaços do começo e do fim
            jogoDoAno = jogoDoAno.trim();

            // Transfere todos os caracteres para caixa alta
            String sistemaOperacional = sistemaOperacional.toUpperCase();
            System.out.println(sistemaOperacional);

            // Transfere todos os caracteres para caixa baixa
            sistemaOperacional = sistemaOperacional.toLowerCase();
            System.out.println(sistemaOperacional);

            // Coletar um caracter específico de um determinado índice
            char letra = sistemaOperacional.charAt(2);

            /* Coleta um trecho específico de um índice.
            OBS.: O número apontado no final é onde o sistema irá parar, portanto, se
            a posição idicada para término é o 12, ele irá
            coletar e apresentar somente até a posição 11*/
            String nomeCompleto = "Juan Roberto da Rocha";
            System.out.println(nomeCompleto.substring(5,12));

            // Coleta o último caractere. No exemplo retorna se é plural ou não
            String nome = "casas";
            char letra = nome.charAt(nome.length() -1);
            if (letra == 's'){
                //plural
            }else{
                //singular
            }


    }
}