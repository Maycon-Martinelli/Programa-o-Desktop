import java.util.List;
import java.util.function.Predicate;

public class IntegerUtils {

    // Método que encontra o primeiro elemento que satisfaz o predicado
    public static Integer findFirstMatch(List<Integer> numbers, Predicate<Integer> predicate) {
        // Usar stream para encontrar o primeiro elemento que corresponde ao predicado
        return numbers.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }
}
