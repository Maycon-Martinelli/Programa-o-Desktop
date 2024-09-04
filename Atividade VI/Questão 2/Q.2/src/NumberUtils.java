import java.util.List;
import java.util.function.Predicate;

public class NumberUtils {

    // Método que remove todos os números negativos de uma lista
    public static void removeNegativeNumbers(List<Integer> numbers) {
        // Definir o predicado para identificar números negativos
        Predicate<Integer> isNegative = n -> n < 0;

        // Usar removeIf para remover elementos que satisfazem o predicado
        numbers.removeIf(isNegative);
    }
}
