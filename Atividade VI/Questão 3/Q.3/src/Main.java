import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 15, 23, 35, 47, 50);

        // Exemplo de predicado: encontrar o primeiro número maior que 30
        Predicate<Integer> greaterThan30 = n -> n > 30;

        // Encontrar o primeiro número que satisfaz o predicado
        Integer result = IntegerUtils.findFirstMatch(numbers, greaterThan30);

        // Imprimir o resultado
        System.out.println("Primeiro número maior que 30: " + result); // Output: 35

        // Exemplo de predicado que não corresponde a nenhum elemento
        Predicate<Integer> lessThan10 = n -> n < 10;

        // Encontrar o primeiro número que satisfaz o predicado
        result = IntegerUtils.findFirstMatch(numbers, lessThan10);

        // Imprimir o resultado
        System.out.println("Primeiro número menor que 10: " + result); // Output: null
    }
}
