# 🚀 Java CRUD Evolution

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)

## 📋 Sobre o Projeto

Sistema de gerenciamento de pessoas desenvolvido em Java, implementando operações CRUD (Create, Read, Update, Delete) com interface gráfica utilizando JOptionPane. Este projeto representa a evolução de um sistema básico de cadastro, sendo construído de forma incremental e educativa.

## 🎯 Objetivos

Este repositório documenta a evolução de um sistema CRUD em Java, desde sua implementação básica até versões mais complexas e estruturadas. O projeto serve como recurso educacional para demonstrar:

- Conceitos fundamentais de programação orientada a objetos
- Operações CRUD básicas
- Manipulação de coleções em Java
- Boas práticas de desenvolvimento
- Evolução de código e refatoração

## 🏗️ Estrutura do Projeto

```
Crud/
├── Main.java              # Classe principal - Ponto de entrada da aplicação
├── Pessoa.java            # Modelo de dados - Entidade Pessoa
├── Acoes.java             # Controlador - Gerencia operações CRUD
├── Armazenamento.java     # Repositório - Armazena dados em memória
└── README.md              # Documentação do projeto
```

## 📚 Descrição dos Componentes

### Main.java
Classe principal que inicializa a aplicação e instancia o controlador de ações.

### Pessoa.java
Entidade que representa uma pessoa no sistema com os seguintes atributos:
- **Nome**: Nome completo
- **CPF**: Cadastro de Pessoa Física
- **Data de Nascimento**: Data no formato LocalDate
- **Telefone**: Número de contato
- **Cidade**: Cidade de residência
- **Email**: Endereço de e-mail

### Acoes.java
Controlador responsável por gerenciar as operações do sistema:
- ✅ **Cadastrar**: Adiciona uma nova pessoa
- 📋 **Listar**: Exibe todas as pessoas cadastradas
- ✏️ **Alterar**: Modifica dados de uma pessoa existente
- 🗑️ **Remover**: Exclui uma pessoa do sistema

### Armazenamento.java
Classe responsável pelo armazenamento em memória utilizando ArrayList para persistência temporária dos dados.

## 🔧 Tecnologias Utilizadas

- **Java SE**: Linguagem de programação principal
- **Swing (JOptionPane)**: Interface gráfica para interação com usuário
- **ArrayList**: Estrutura de dados para armazenamento
- **LocalDate**: Manipulação de datas

## ⚙️ Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior instalado
- Variáveis de ambiente configuradas

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/Wendersonjose/java-crud-evolution.git
   cd java-crud-evolution
   ```

2. **Compile os arquivos**
   ```bash
   javac *.java
   ```

3. **Execute a aplicação**
   ```bash
   java Main
   ```

## 💡 Funcionalidades

- ➕ Cadastro de pessoas com validação de dados
- 📄 Listagem completa de pessoas cadastradas
- ✏️ Edição de informações de pessoas existentes
- ❌ Remoção de registros
- 🔄 Menu interativo com navegação simples

## 🎓 Conceitos Aprendidos

Este projeto demonstra a aplicação de diversos conceitos importantes:

- **Programação Orientada a Objetos (POO)**
  - Encapsulamento (getters e setters)
  - Classes e objetos
  - Construtores

- **Estruturas de Dados**
  - ArrayList para armazenamento dinâmico
  - Manipulação de coleções

- **Padrões de Projeto**
  - Separação de responsabilidades
  - Camadas de aplicação (Model, Controller, Repository)

- **Boas Práticas**
  - Código limpo e organizado
  - Nomenclatura descritiva
  - Modularização

## 🔄 Evolução do Projeto

Este é um projeto em constante evolução. Futuras implementações podem incluir:

- [ ] Persistência de dados em arquivo
- [ ] Validação avançada de CPF e e-mail
- [ ] Interface gráfica com Swing completo
- [ ] Conexão com banco de dados
- [ ] Implementação de testes unitários
- [ ] Tratamento de exceções robusto
- [ ] Documentação Javadoc completa
- [ ] Implementação de padrões de projeto (MVC, DAO)

## 👨‍💻 Autor

**Wenderson José**
- GitHub: [@Wendersonjose](https://github.com/Wendersonjose)

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🤝 Contribuições

Contribuições são sempre bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abrir um Pull Request

## 📞 Contato

Para dúvidas, sugestões ou feedback, sinta-se à vontade para abrir uma issue ou entrar em contato.

---

⭐ Se este projeto foi útil para você, considere dar uma estrela no repositório!

**Desenvolvido com ❤️ e Java**
