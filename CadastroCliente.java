
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class CadastroCliente {
    
    String[] nomes = new String[100];
    int[] idades = new int [100];
    char[] sexos = new char [100];
    String[] cpfs = new String [100];
    String[] estados = new String [100];
    String[] cidades = new String [100];
    String[] bairros = new String [100];
    String[] logradouros = new String [100];
    String[] ceps = new String [100];
    String[] numeros = new String [100];
    String[] complementos = new String [100];
    int atual = 0;
    
    public void cadastrar(){
        //TODO implementar cadastro
        nomes[atual] = JOptionPane.showInputDialog(null, "Digite seu nome");
        
        idades[atual] = Integer.parseInt(JOptionPane.showInputDialog(nomes[atual] + ", "
                + "Digite a sua idade"));
        
        sexos[atual] = JOptionPane.showInputDialog(nomes[atual] + ", digite o seu sexo").charAt(0);
        
        cpfs[atual] = JOptionPane.showInputDialog(nomes[atual] + ", digite o seu CPF").replace(".", "").replace("-","");
        
        estados[atual] = JOptionPane.showInputDialog("Digite o seu estado").trim().toUpperCase();
        
        cidades[atual] = JOptionPane.showInputDialog("Digite a sua cidade");
        
        logradouros[atual] = JOptionPane.showInputDialog("Digite o seu logradouro");
        bairros[atual] = JOptionPane.showInputDialog("Digite o seu bairro");
        ceps [atual] = JOptionPane.showInputDialog("Digite o seu cep");
        numeros [atual] = JOptionPane.showInputDialog("Digite o seu número");
        complementos [atual] = JOptionPane.showInputDialog("Digite o complemento");
        atual ++;
    
    }
    
    public void listar(){
        //TODO implementar a apresentação dos clientes
        String texto = "";
        for(int i = 0; i < atual; i++){
            texto += nomes[i] + " " + cpfs[i] + "\n";
        }
    }
        
    public void editar(){
        //TODO implementar edição do cliente
    }
    
    public void buscarPeloNome(){
        //TODO implemnetar busca pelo nome
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        
        for(int i = 0; i < atual; i++){
        if(nomes[i].contains(busca)){
            JOptionPane.showMessageDialog(null,
            "Nome: "+ nomes[i]+
            "\nIdade: "+ idades[i]+
            "\nCPF: "+ cpfs[i]+
            "\nEstado: "+ estados [i]+
            "\nCidade: "+ cidades [i]+
            "\nBairro: "+ bairros [i]+
            "\nLogradouro: "+ logradouros [i]+
            "\nCEP: "+ ceps[i]+
            "\nNúmero: "+ numeros[i]+
            "\nComplemento: "+ complementos[i]
            );
        }
    }
    }
    
    public void contabilizarPeloNome(){
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++){
            if (nomes[i].contains(busca)){
                quantidadeRegistros++;
            }
        }
    }
    
    public void buscarPeloCPF(){
        //TODO implementar busca pelo CPF
        String cpfBuscado = JOptionPane.showInputDialog("Digite o cpf para a busca").replace(".","").replace("-","");
        for(int i = 0; i < atual; i++){
            if (cpfs[i].equals(cpfBuscado)){
                JOptionPane.showMessageDialog(null,
                        "Nome: "+nomes[i]
                        +"\nIdade: "+idades[i]
                        +"\nCPF: "+cpfs[i]
                        +"\nEstado: "+ estados [i]
                        +"\nCidade: "+ cidades [i]
                        +"\nBairro: "+ bairros [i]
                        +"\nLogradouro: "+ logradouros [i]
                        +"\nCEP: "+ ceps[i]
                        +"\nNúmero: "+ numeros[i]
                        +"\nComplemento: "+ complementos[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }
    
}
