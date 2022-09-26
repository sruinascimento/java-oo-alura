import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {
    private ReajusteService reajusteService;
    private Funcionario funcionario;

    //Inicializa esse teste antes de cada método
    @BeforeEach
    public void inicializar() {
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Rui", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteDeveriaSerTresPorcentoDesempenhoAdesejar() {
        reajusteService.reajustarSalario(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }

    @Test
    public void reajusteDeveriaSerQuinzePorcentoDesempenhoBom() {
        this.reajusteService.reajustarSalario(this.funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), this.funcionario.getSalario());
    }


    @Test
    public void reajusteDeveriaSerVintePorcentoDesempenhoOtimo() {
        reajusteService.reajustarSalario(this.funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), this.funcionario.getSalario());
    }

    @BeforeAll
    public static void antesDeTodos() {
        System.out.println("Antes de todos - BEGIN!");
    }

    @BeforeEach
    public void finalizar() {
        System.out.println("INI!");
    }

    @AfterEach
    public void depois() {
        System.out.println("FIM!");
    }

    @AfterAll
    public static void finalAposTodo() {
        System.out.println("Depois de todos - END!");
    }


}
