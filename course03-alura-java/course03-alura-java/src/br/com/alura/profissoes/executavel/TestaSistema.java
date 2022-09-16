package br.com.alura.profissoes.executavel;

import br.com.alura.profissoes.classes.Cliente;
import br.com.alura.profissoes.classes.Administrador;
import br.com.alura.profissoes.classes.Gerente;
import br.com.alura.profissoes.classes.SistemaInterno;

public class TestaSistema {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSenha(2021);
        Administrador adm = new Administrador();
        adm.setSenha(2022);
        Cliente c1 = new Cliente();
        c1.setSenha(2022);
        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(adm);
        si.autentica(c1);

    }
}
