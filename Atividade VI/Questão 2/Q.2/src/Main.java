import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lista de números que inclui alguns negativos
        List<Integer> numbers = List.of(-5, 3, -2, 7, -1, 8);

        // Exibir lista antes da remoção
        System.out.println("Lista antes da remoção: " + numbers);

        // Converter a lista imutável para uma lista mutável para realizar remoção
        List<Integer> mutableNumbers = new ArrayList<>(numbers);

        // Remover números negativos usando o método removeNegativeNumbers
        NumberUtils.removeNegativeNumbers(mutableNumbers);

        // Exibir lista após a remoção
        System.out.println("Lista após a remoção: " + mutableNumbers);
    }
}
