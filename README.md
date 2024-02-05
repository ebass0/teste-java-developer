# Projeto TGID - Processo Seletivo para Vaga Back-end Java

Este projeto foi desenvolvido como parte de um processo seletivo da empresa TGID para a posição de Desenvolvedor Back-end Java. O objetivo era criar um sistema de transações financeiras envolvendo usuários do tipo Cliente e Empresa.

## Funcionalidades Implementadas

- **Dois Tipos de Usuários:** O sistema suporta dois tipos de usuários, Cliente e Empresa, cada um com suas características específicas.

- **Validação de CPF e CNPJ:** Foi implementada a validação de CPF para usuários do tipo Cliente e CNPJ para usuários do tipo Empresa.

- **Taxas de Sistema:** Cada Empresa possui pelo menos um tipo de taxa de sistema que é aplicada no momento das transações (depósito ou saque).

- **Saldo e Taxas de Administração:** As Empresas possuem um saldo que é afetado pelos depósitos e saques realizados pelos Clientes, já considerando o abate das taxas de administração do sistema.

- **Notificações:** Após cada transação, é enviado um callback para a Empresa informando a transação. Além disso, o Cliente recebe algum tipo de notificação (e-mail, SMS, etc.).

## Tecnologias Utilizadas

- **Java:** A linguagem de programação principal para o desenvolvimento.

- **Maven:** Gerenciador de dependências para o projeto.

- **JUnit:** Framework de testes para garantir a qualidade do código.

## Como Executar o Projeto

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em sua IDE Java favorita.
3. Execute a aplicação.

Certifique-se de que possui o ambiente Java configurado corretamente e todas as dependências do Maven instaladas.

Este projeto foi desenvolvido com ênfase em boas práticas de código, lógica de negócios clara e tratamento adequado de erros. A estrutura do código segue princípios de Clean Code e busca ser facilmente mantida e estendida.
