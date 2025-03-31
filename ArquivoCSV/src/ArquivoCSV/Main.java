package ArquivoCSV;

public class Main {
    public static void main(String[] args) {

    Filme f1 = new Filme("O Rei Leão", 10, true);
    Filme f2 = new Filme("Homem-Aranha", 10, true);
    // Adicionar filmes ao arquivo
    FilmeCSV.adiconarFilme(f1);
    FilmeCSV.adiconarFilme(f2);

    // Ler filmes do arquivo
    FilmeCSV.listarFilme();

    }
}