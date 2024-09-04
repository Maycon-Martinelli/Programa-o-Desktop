import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletar a lista de nomes do usuário
        System.out.println("Digite os nomes, separados por vírgula (ex: Ana, Bruno, Carla):");
        String input = scanner.nextLine();
        List<String> names = List.of(input.split("\\s*,\\s*"));

        boolean continueFiltering = true;

        while (continueFiltering) {
            // Solicitar ao usuário para escolher uma letra para o filtro
            System.out.println("Digite a letra para filtrar os nomes:");
            char filterLetter = scanner.nextLine().toUpperCase().charAt(0);

            // Criar o predicado para o filtro
            Predicate<String> startsWithLetter = s -> s.toUpperCase().startsWith(String.valueOf(filterLetter));

            // Filtrar a lista usando o método filterStrings
            List<String> filteredNames = StringFilter.filterStrings(names, startsWithLetter);

            // Imprimir os resultados filtrados
            System.out.println("Nomes que começam com a letra '" + filterLetter + "':");
            filteredNames.forEach(System.out::println);

            // Perguntar ao usuário se deseja realizar outro filtro
            System.out.println("Deseja realizar outro filtro? (s/n):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("s")) {
                continueFiltering = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
