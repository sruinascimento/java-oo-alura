import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);


        LocalDate dataInicioCopaDoMundo = LocalDate.of(2022, Month.NOVEMBER, 20);

        Period periodo = Period.between(hoje, dataInicioCopaDoMundo);
        System.out.println("Faltam " + periodo.getDays() + " dias para a copa do mundo");


        LocalDate proximaCopa = dataInicioCopaDoMundo.plusYears(4);
        System.out.println(proximaCopa);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximaCopa.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        LocalDateTime dataCompleta = LocalDateTime.now();
        System.out.println(dataCompleta.format(DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss")));

        LocalTime horaDaily = LocalTime.of(13, 45, 00);
        System.out.println(horaDaily.format(DateTimeFormatter.ofPattern("HH mm")));

        LocalDate dataFerias = LocalDate.of(2022, Month.DECEMBER, 22);
        System.out.println(dataFerias.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    }
}
