package tpgarciapersistenciatipocliente;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int id;
        String nome;
        Double anuidade;
        TipoCartao tipocartao;
        
        /*
        ADICIONAR
        */
        System.out.println( "\n\nADICIONAR NOVO" );
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Anuidade: ");
        anuidade = in.nextDouble();
        System.out.print("<0>GOLD \n<1>SILVER \n<2>PLATIUM \n<3>BLACK \n\nTipo Cartão: ");
        tipocartao = TipoCartao.values()[in.nextInt()];
        
        Cliente c = new Cliente(nome, anuidade, tipocartao);
        
        DAO dao = new DAO(Cliente.class);
        dao.adicionar(c);
        
        /*
        LISTAR
        */
        System.out.println( "\n\nLISTAR TODOS" );
        List<Cliente> clientes = dao.listar("select c from Cliente c");
        for(Cliente cli : clientes){
            System.out.println( cli.toString() );
        }
        
        /*
        CONSULTAR
        */
        System.out.println( "\n\nCONSULTAR POR ID" );
        System.out.print("Digite o ID: ");
        id = in.nextInt();   
        Cliente achado = (Cliente) dao.consultar( id );
        System.out.println( achado.toString() );
        
        /*
        ALTERAR
        */
        System.out.println( "\n\nALTERAR O CONSULTADO" );
        System.out.print("Alterar Nome para: ");
        achado.setNome(in.next());
        System.out.print("Alterar Anuidade para: ");
        achado.setAnuidade(in.nextDouble());
        System.out.print("<0>GOLD \n<1>SILVER \n<2>PLATIUM \n<3>BLACK \n\nAlterar Tipo Cartão para: ");
        achado.setTipoCartao( TipoCartao.values()[in.nextInt()]);
        
        dao.alterar( achado );
        System.out.println( "\n\nREGISTRADO ALTERADO!" );
    }
    
}
