import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Acoes {

    // 1º Método: Construtor
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

    // 2º Método: Menu
    private int menu() {
        String opcoes = "MENU\n";
        opcoes += "1º Cadastrar\n";
        opcoes += "2º Listar\n";
        opcoes += "3º Alterar\n";
        opcoes += "4º Remover\n";
        opcoes += "5º Finalizar";

        return Integer.parseInt(JOptionPane.showInputDialog(opcoes));
    }

    // 3º Método: Listar nomes (Utilizado para alterar e remover)
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

    // 4º Método: Obter dados
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

    // 5º Método: Cadastrar
    private void cadastrar() {
        Pessoa p = obterDados();
        Armazenamento.pessoas.add(p);
        JOptionPane.showMessageDialog(null, "Cadastro realizado!");
    }

    // 6º Método: Listar
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

    // 7º Método: Alterar
    private void alterar() {
        int indicePessoa = listarNomes();
        if (indicePessoa == -1) return;

        Pessoa p = obterDados();
        Armazenamento.pessoas.set(indicePessoa, p);

        JOptionPane.showMessageDialog(null, "Alteração realizada!");
    }

    // 8º Método: Remover
    private void remover() {
        int indicePessoa = listarNomes();
        if (indicePessoa == -1) return;

        Armazenamento.pessoas.remove(indicePessoa);

        JOptionPane.showMessageDialog(null, "Remoção realizada!");
    }
}
