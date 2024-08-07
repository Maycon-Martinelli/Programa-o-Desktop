import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<String>();

        // Adicionando produtos ao estoque
        produtos.add("Camiseta");
        produtos.add("Calça");
        produtos.add("Tênis");
        produtos.add("Boné");

        // Exibindo produtos no estoque
        System.out.println("Produtos no estoque:");
        try {
            for (String produto : produtos) {
                System.out.println(produto);
            }
        } catch (Exception e) {
            System.out.println("Erro ao exibir produtos: " + e.getMessage());
        }

        // Removendo um produto específico
        String produtoARemover = "Camiseta";
        if (produtos.contains(produtoARemover)) {
            produtos.remove(produtoARemover);
        } else {
            System.out.println("Produto não encontrado: " + produtoARemover);
        }

        // Tentando remover um produto que não existe
        String produtoNaoExistente = "Sapato";
        if (!produtos.remove(produtoNaoExistente)) {
            System.out.println("Produto não encontrado: " + produtoNaoExistente);
        }

        // Exibindo produtos atualizados
        System.out.println("\nProdutos atualizados no estoque:");
        try {
            for (String produto : produtos) {
                System.out.println(produto);
            }
        } catch (Exception e) {
            System.out.println("Erro ao exibir produtos: " + e.getMessage());
        }

        // Tentando acessar um produto fora do índice válido
        System.out.println("\nTentando acessar um produto fora do índice válido:");
        try {
            System.out.println(produtos.get(10)); // Esse índice pode não existir
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites - " + e.getMessage());
        }
    }
}
