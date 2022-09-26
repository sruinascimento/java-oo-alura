import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    public void bonusZero() {
        var bonus = new BonusService();
//        Assertions.assertThrows(IllegalArgumentException.class, () -> bonus.calcularBonus(new Funcionario("Rui", LocalDate.now(), new BigDecimal("20000.00"))));

        try {
            bonus.calcularBonus(new Funcionario("Rui", LocalDate.now(), new BigDecimal("20000.00")));
            Assertions.fail("Não funcionou a exception!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void bonusDezPorcento() {
        var f = new Funcionario("Rui", LocalDate.now(), new BigDecimal("2500"));
        var bonus = new BonusService();
        BigDecimal valorBonus = bonus.calcularBonus(f);

        Assertions.assertEquals(new BigDecimal("250.00"), valorBonus );
    }

    @Test
    public void bonusDezPorcentoComSalarioIgualA10K() {
        var f = new Funcionario("Rui", LocalDate.now(), new BigDecimal("10000"));
        var bonus = new BonusService();
        BigDecimal valorBonus = bonus.calcularBonus(f);

        Assertions.assertEquals(new BigDecimal("1000.00"), valorBonus );
    }
}
