package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void reajustarSalario(Funcionario funcionario, Desempenho desempenho) {

        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajustarSalario(reajuste);

//        if  (desempenho == Desempenho.A_DESEJAR) {
//            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
//            funcionario.reajustarSalario(reajuste);
//        }
//
//        if (desempenho == Desempenho.BOM) {
//           BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
//           funcionario.reajustarSalario(reajuste);
//       }
//
//        if (desempenho == Desempenho.OTIMO) {
//            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
//            funcionario.reajustarSalario(reajuste);
//        }
    }
}
