package testaconexao2java;

import java.sql.SQLException;
import java.util.Scanner;

public class TestaDAO {

    public static void main(String[] args) {
        int op;
        ContatoDAO cdao;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("CONTATOS");
            System.out.println("<1> Adicionar contato");
            System.out.println("<2> Listar contatos");
            System.out.println("<0> Sair do programa");
            System.out.print("Opção: ");
            switch (op = in.nextInt()) {
                case 1:
                    Contato contato = new Contato();
                    in.nextLine();
                    System.out.print("Nome: ");
                    contato.setNome(in.nextLine());
                    System.out.print("E-mail: ");
                    contato.setEmail(in.nextLine());
                    System.out.print("Endereço: ");
                    contato.setEndereco(in.nextLine());
                    cdao = new ContatoDAO();
                    try {
                        cdao.adicionar(contato);
                    } catch (SQLException e) {
                        System.out.println("Erro: " + e);
                    }
                    break;
                case 2:
                    System.out.println("Contatos Cadastrados");
                    
                    cdao = new ContatoDAO();
                    try {
                        for (Contato c : cdao.listar()) {
                            System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getEmail() + " - " + c.getEndereco());
                        }
                    } catch (SQLException e) {
                        System.out.println("Erro: " + e);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
