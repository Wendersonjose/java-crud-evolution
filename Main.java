/**
 * Classe principal da aplicação CRUD de Pessoas.
 * <p>
 * Esta classe contém o método main que serve como ponto de entrada
 * da aplicação. Ao iniciar, instancia a classe Acoes que gerencia
 * todo o fluxo de operações CRUD.
 * </p>
 *
 * @author Wenderson José
 * @version 1.0
 * @since 2026-01-08
 */
public class Main {
    
    /**
     * Método principal que inicia a execução da aplicação.
     * <p>
     * Cria uma instância da classe Acoes, que inicializa o menu
     * e gerencia todas as operações do sistema.
     * </p>
     *
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        new Acoes();
    }
}
