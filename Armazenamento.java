import java.util.ArrayList;

/**
 * Classe responsável pelo armazenamento de dados em memória.
 * <p>
 * Esta classe utiliza um ArrayList estático para manter os dados
 * das pessoas cadastradas durante a execução da aplicação.
 * Os dados são armazenados em memória volátil e são perdidos
 * quando a aplicação é encerrada.
 * </p>
 *
 * @author Wenderson José
 * @version 1.0
 * @since 2026-01-08
 */
public class Armazenamento {
    
    /**
     * Lista estática que armazena todas as pessoas cadastradas no sistema.
     * <p>
     * Utiliza ArrayList para permitir operações dinâmicas de adição,
     * remoção e modificação de elementos. Sendo estático, os dados
     * são compartilhados entre todas as instâncias e acessíveis
     * de qualquer parte da aplicação.
     * </p>
     */
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
}
