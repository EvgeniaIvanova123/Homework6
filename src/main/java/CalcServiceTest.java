import org.example.CalcService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calc.csv")
    public void testRegistredUnderLimit(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, result);

    }
}

