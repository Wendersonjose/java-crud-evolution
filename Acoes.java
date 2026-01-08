import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe controladora que gerencia todas as ações e operações CRUD do sistema.
 * <p>
 * Esta classe é responsável por controlar o fluxo da aplicação, exibindo
 * o menu principal e executando as operações de cadastro, listagem,
 * alteração e remoção de pessoas. Utiliza JOptionPane para interação
 * com o usuário através de caixas de diálogo.
 * </p>
 *
 * @author Wenderson José
 * @version 1.0
 * @since 2026-01-08
 */
public class Acoes {

    /**
     * Construtor da classe Acoes.
     * <p>
     * Inicializa o sistema exibindo o menu principal e processando
     * as opções escolhidas pelo usuário em um loop até que a opção
     * de finalizar seja selecionada.
     * </p>
     */
    public Acoes() {
        int opcaoMenu;

        do {
            opcaoMenu = menu();

            switch (opcaoMenu) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    alterar();
                    break;

                case 4:
                    remover();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcaoMenu != 5);
    }

    /**
     * Exibe o menu principal do sistema.
     * <p>
     * Apresenta as opções disponíveis ao usuário através de uma caixa
     * de diálogo e retorna a opção selecionada.
     * </p>
     *
     * @return Número inteiro correspondente à opção escolhida pelo usuário
     */
    private int menu() {
        String opcoes = "MENU\n";
        opcoes += "1º Cadastrar\n";
        opcoes += "2º Listar\n";
        opcoes += "3º Alterar\n";
        opcoes += "4º Remover\n";
        opcoes += "5º Finalizar";

        return Integer.parseInt(JOptionPane.showInputDialog(opcoes));
    }

    /**
     * Lista os nomes de todas as pessoas cadastradas com seus respectivos índices.
     * <p>
     * Este método é utilizado auxiliarmente pelas operações de alterar e remover,
     * permitindo que o usuário selecione uma pessoa específica através do seu índice.
     * Realiza validação verificando se há pessoas cadastradas e se o índice
     * selecionado é válido.
     * </p>
     *
     * @return O índice da pessoa selecionada, ou -1 caso não haja pessoas
     *         cadastradas ou o índice seja inválido
     */
    private int listarNomes() {
        if (Armazenamento.pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há pessoas cadastradas.");
            return -1;
        }

        String listagem = "Pessoas registradas:\n\n";

        for (int indice = 0; indice < Armazenamento.pessoas.size(); indice++) {
            listagem += indice + ") " + Armazenamento.pessoas.get(indice).getNome();
            listagem += "\n";
        }

        int indiceNome = Integer.parseInt(JOptionPane.showInputDialog(listagem));

        if (indiceNome < 0 || indiceNome >= Armazenamento.pessoas.size()) {
            JOptionPane.showMessageDialog(null, "Índice inválido!");
            return -1;
        }

        return indiceNome;
    }

    /**
     * Coleta todos os dados necessários para criar ou atualizar uma pessoa.
     * <p>
     * Solicita ao usuário, através de caixas de diálogo, todas as informações
     * necessárias para preencher um objeto Pessoa (nome, CPF, data de nascimento,
     * telefone, cidade e e-mail). A data de nascimento é convertida do formato
     * dd/MM/yyyy para LocalDate.
     * </p>
     *
     * @return Um objeto Pessoa preenchido com os dados fornecidos pelo usuário
     */
    private Pessoa obterDados() {
        Pessoa p = new Pessoa();

        p.setNome(JOptionPane.showInputDialog("Informe o nome."));
        p.setCpf(JOptionPane.showInputDialog("Informe o Cpf"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        p.setDataNascimento(
                LocalDate.parse(
                        JOptionPane.showInputDialog("Informe a data (dd/MM/yyyy)"),
                        formatter
                )
        );

        p.setTelefone(JOptionPane.showInputDialog("Informe Telefone"));
        p.setCidade(JOptionPane.showInputDialog("Informe a cidade."));
        p.setEmail(JOptionPane.showInputDialog("Informe o Email"));

        return p;
    }

    /**
     * Realiza o cadastro de uma nova pessoa no sistema.
     * <p>
     * Coleta os dados através do método obterDados(), adiciona a nova
     * pessoa à lista de armazenamento e exibe uma mensagem de confirmação.
     * </p>
     */
    private void cadastrar() {
        Pessoa p = obterDados();
        Armazenamento.pessoas.add(p);
        JOptionPane.showMessageDialog(null, "Cadastro realizado!");
    }

    /**
     * Lista todas as pessoas cadastradas com seus respectivos dados completos.
     * <p>
     * Exibe em uma caixa de diálogo todas as informações de cada pessoa
     * cadastrada no sistema, incluindo nome, CPF, data de nascimento
     * (formatada como dd/MM/yyyy), telefone, cidade e e-mail.
     * </p>
     */
    private void listar() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String listagem = "Pessoas registradas:\n";

        for (int indice = 0; indice < Armazenamento.pessoas.size(); indice++) {
            listagem += "\nNome: " + Armazenamento.pessoas.get(indice).getNome();
            listagem += "\nCpf: " + Armazenamento.pessoas.get(indice).getCpf();
            listagem += "\nData de Nascimento: " +
                Armazenamento.pessoas.get(indice).getDataNascimento().format(formatter);
            listagem += "\nTelefone: " + Armazenamento.pessoas.get(indice).getTelefone();
            listagem += "\nCidade: " + Armazenamento.pessoas.get(indice).getCidade();
            listagem += "\nEmail: " + Armazenamento.pessoas.get(indice).getEmail();
            listagem += "\n";
        }

        JOptionPane.showMessageDialog(null, listagem);
    }

    /**
     * Permite alterar os dados de uma pessoa já cadastrada.
     * <p>
     * Exibe a lista de nomes para seleção, solicita novos dados através
     * do método obterDados() e substitui os dados antigos pelos novos
     * na posição correspondente. Se não houver pessoas cadastradas ou
     * o índice for inválido, a operação é cancelada.
     * </p>
     */
    private void alterar() {
        int indicePessoa = listarNomes();
        if (indicePessoa == -1) return;

        Pessoa p = obterDados();
        Armazenamento.pessoas.set(indicePessoa, p);

        JOptionPane.showMessageDialog(null, "Alteração realizada!");
    }

    /**
     * Remove uma pessoa do sistema.
     * <p>
     * Exibe a lista de nomes para seleção e remove a pessoa correspondente
     * da lista de armazenamento. Se não houver pessoas cadastradas ou
     * o índice for inválido, a operação é cancelada.
     * </p>
     */
    private void remover() {
        int indicePessoa = listarNomes();
        if (indicePessoa == -1) return;

        Armazenamento.pessoas.remove(indicePessoa);

        JOptionPane.showMessageDialog(null, "Remoção realizada!");
    }
}
