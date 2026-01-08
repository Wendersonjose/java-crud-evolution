import java.time.LocalDate;

/**
 * Classe que representa uma Pessoa no sistema.
 * <p>
 * Esta classe é a entidade principal do sistema CRUD, contendo
 * todos os atributos necessários para representar uma pessoa
 * e seus respectivos métodos getters e setters.
 * </p>
 *
 * @author Wenderson José
 * @version 1.0
 * @since 2026-01-08
 */
public class Pessoa {

    /** Nome completo da pessoa */
    private String nome;
    
    /** CPF (Cadastro de Pessoa Física) da pessoa */
    private String cpf;
    
    /** Data de nascimento da pessoa */
    private LocalDate dataNascimento;
    
    /** Número de telefone para contato */
    private String telefone;
    
    /** Cidade de residência da pessoa */
    private String cidade;
    
    /** Endereço de e-mail da pessoa */
    private String email;

    /**
     * Construtor padrão da classe Pessoa.
     * <p>
     * Cria uma instância de Pessoa sem inicializar os atributos.
     * Os valores devem ser definidos posteriormente através dos métodos setters.
     * </p>
     */
    public Pessoa() {}

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome completo da pessoa
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Define o nome da pessoa.
     *
     * @param nome O nome completo a ser atribuído
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa.
     *
     * @return O CPF cadastrado
     */
    public String getCpf() {
        return cpf;
    }
    
    /**
     * Define o CPF da pessoa.
     *
     * @param cpf O CPF a ser atribuído
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém a data de nascimento da pessoa.
     *
     * @return A data de nascimento no formato LocalDate
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    /**
     * Define a data de nascimento da pessoa.
     *
     * @param dataNascimento A data de nascimento a ser atribuída
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Obtém o número de telefone da pessoa.
     *
     * @return O número de telefone cadastrado
     */
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * Define o número de telefone da pessoa.
     *
     * @param telefone O número de telefone a ser atribuído
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém a cidade de residência da pessoa.
     *
     * @return A cidade cadastrada
     */
    public String getCidade() {
        return cidade;
    }
    
    /**
     * Define a cidade de residência da pessoa.
     *
     * @param cidade A cidade a ser atribuída
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o endereço de e-mail da pessoa.
     *
     * @return O e-mail cadastrado
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Define o endereço de e-mail da pessoa.
     *
     * @param email O e-mail a ser atribuído
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
