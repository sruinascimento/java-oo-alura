package br.com.alura.profissoes.executavel;

import br.com.alura.profissoes.classes.Funcionario;
import br.com.alura.profissoes.classes.Gerente;


/**
 * Classe para testes das classes do funcionários
 * @author Rui
 */


public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario rui = new Gerente();
        rui.setNome("Rui");
        rui.setCpf("011.123.123-99");
        rui.setSalario(1800);
        
        System.out.println(rui);
        System.out.printf("%s %.2f", "Bonificação", rui.getBonificacao());

        //testando a classe Gerente

        Gerente ploop = new Gerente();
        ploop.setNome("Ploop");
        ploop.setCpf("123456789-99");
        ploop.setSalario(1000);
        System.out.println(ploop);
        boolean gerenteAutenticado = ploop.autentica(0);
        System.out.println( gerenteAutenticado ? "Autenticado com sucesso": "Falha au ser autenticado" );
        System.out.println(ploop.getBonificacao());


        Funcionario f1 = new Gerente();
        
        
    }
}
