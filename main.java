// Giovana Santos de França
// Marcela Aparecida de Almeida
// Raissa Santos Ramos
// Nair Santos de Rousa

// 1. Interface Abstract Factory
// Aqui estamos criando uma interface chamada 'LivroFactory'. Ela define os métodos essenciais para a criação de três tipos de livros: físico, digital e audiobook. 
// Cada fábrica concreta vai implementar esses métodos para criar livros de diferentes tipos.
 
interface LivroFactory {
    LivroFisico criarLivroFisico();
    LivroDigital criarLivroDigital();
    Audiobook criarAudiobook();
}
 
// 2. Produtos Concretos
// Agora, temos os produtos que são criados pelas fábricas. Cada tipo de livro (físico, digital e audiobook) tem sua própria classe.
 
class LivroFisico {
    private String titulo;
 
    // O construtor recebe o título do livro e o armazena
    public LivroFisico(String titulo) {
        this.titulo = titulo;
    }
 
    // Representação do livro físico como uma string, para facilitar a visualização quando imprimimos o objeto
    @Override
    public String toString() {
        return "Livro Físico: " + titulo;
    }
}
 
class LivroDigital {
    private String titulo;
 
    // O construtor recebe o título do livro digital e o armazena
    public LivroDigital(String titulo) {
        this.titulo = titulo;
    }
 
    // Representação do livro digital como uma string, para facilitar a visualização quando imprimimos o objeto
    @Override
    public String toString() {
        return "Livro Digital: " + titulo;
    }
}
 
class Audiobook {
    private String titulo;
 
    // O construtor recebe o título do audiobook e o armazena
    public Audiobook(String titulo) {
        this.titulo = titulo;
    }
 
    // Representação do audiobook como uma string, para facilitar a visualização quando imprimimos o objeto
    @Override
    public String toString() {
        return "Audiobook: " + titulo;
    }
}
 
// 3. Fábricas Concretas
// Aqui, temos as fábricas concretas. Elas implementam a interface LivroFactory e são responsáveis por criar diferentes tipos de livros dependendo do gênero.
 
class FiccaoFactory implements LivroFactory {
    // Para o gênero Ficção, criamos os tipos de livros específicos
    @Override
    public LivroFisico criarLivroFisico() {
        return new LivroFisico("Ficção Físico");
    }
 
    @Override
    public LivroDigital criarLivroDigital() {
        return new LivroDigital("Ficção Digital");
    }
 
    @Override
    public Audiobook criarAudiobook() {
        return new Audiobook("Ficção Audiobook");
    }
}
 
class FantasiaFactory implements LivroFactory {
    // Para o gênero Fantasia, criamos os tipos de livros específicos
    @Override
    public LivroFisico criarLivroFisico() {
        return new LivroFisico("Fantasia Físico");
    }
 
    @Override
    public LivroDigital criarLivroDigital() {
        return new LivroDigital("Fantasia Digital");
    }
 
    @Override
    public Audiobook criarAudiobook() {
        return new Audiobook("Fantasia Audiobook");
    }
}
 
class BioagrifiaFactory implements LivroFactory {
    // Para o gênero Bioagrifia, criamos os tipos de livros específicos
    @Override
    public LivroFisico criarLivroFisico() {
        return new LivroFisico("Bioagrifia Físico");
    }
 
    @Override
    public LivroDigital criarLivroDigital() {
        return new LivroDigital("Bioagrifia Digital");
    }
 
    @Override
    public Audiobook criarAudiobook() {
        return new Audiobook("Bioagrifia Audiobook");
    }
}
 
// 4. Classe Principal (Cliente)
// O método 'main' é onde testamos nossas fábricas. Ele chama o método testarFactory para verificar se as fábricas estão criando os produtos corretamente.
 
public class Main {
    public static void main(String[] args) {
        // Testando a fábrica para o gênero Ficção
        System.out.println("Testando Ficção:");
        testarFactory(new FiccaoFactory());
 
        // Testando a fábrica para o gênero Fantasia
        System.out.println("\nTestando Fantasia:");
        testarFactory(new FantasiaFactory());
 
        // Testando a fábrica para o gênero Bioagrifia
        System.out.println("\nTestando Bioagrifia:");
        testarFactory(new BioagrifiaFactory());
    }
 
    // A função testarFactory é responsável por utilizar a fábrica concreta, criar os livros e exibi-los
    public static void testarFactory(LivroFactory factory) {
        LivroFisico livroFisico = factory.criarLivroFisico();
        LivroDigital livroDigital = factory.criarLivroDigital();
        Audiobook audiobook = factory.criarAudiobook();
 
        // Exibindo os produtos criados
        System.out.println(livroFisico);
        System.out.println(livroDigital);
        System.out.println(audiobook);
    }
}
