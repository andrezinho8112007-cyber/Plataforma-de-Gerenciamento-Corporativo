# TASKFLOW - Plataforma de Gerenciamento Corporativo

## 📌 Sobre o Projeto

O TASKFLOW é uma plataforma web desenvolvida para auxiliar empresas no gerenciamento de funcionários e mercadorias de forma simples, organizada e intuitiva.

O sistema permite:

* Cadastro de empresas
* Login de usuários
* Gerenciamento de funcionários
* Gerenciamento de mercadorias
* Dashboard com indicadores
* Histórico de ações por empresa
* Controle de acesso por usuário

---

## 🛠 Tecnologias Utilizadas

### Backend

* Java 17
* Spring Boot
* Spring Data JPA
* Maven

### Banco de Dados

H2

### Frontend

* HTML5
* CSS3
* JavaScript

### Controle de Versão

* Git
* GitHub

---

## 🧱 Conceitos de POO Aplicados

### Abstração

Foram criadas classes que representam entidades reais do sistema:

* Usuario
* Funcionario
* Mercadoria

Cada classe possui responsabilidades específicas dentro da aplicação.

### Encapsulamento

Os atributos das classes foram declarados como privados e acessados através de métodos getters e setters, garantindo maior segurança e controle dos dados.

Exemplo:

```java
private String senha;
```

### Herança

Foi criada uma hierarquia de usuários:

* Usuario
* Admin
* Gerente
* Colaborador

As classes especializadas herdam características da classe base Usuario.

### Polimorfismo

O método:

```java
gerarRelatorio()
```

foi sobrescrito nas classes:

* Admin
* Gerente
* Colaborador

Cada perfil gera um relatório diferente de acordo com sua função.

---

## 📂 Estrutura do Projeto

```text
src
 ├── controller
 │    ├── FuncionarioController
 │    ├── MercadoriaController
 │    └── UsuarioController
 │
 ├── model
 │    ├── Usuario
 │    ├── Admin
 │    ├── Gerente
 │    ├── Colaborador
 │    ├── Funcionario
 │    └── Mercadoria
 │
 ├── repository
 │    ├── UsuarioRepository
 │    ├── FuncionarioRepository
 │    └── MercadoriaRepository
 │
 └── ApiApplication
```

---

## ⚙️ Como Executar o Projeto

### 1. Clonar o Repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Abrir o Projeto

Abra o projeto no Visual Studio Code.

### 3. Extensões Recomendadas

* Extension Pack for Java
* Spring Boot Extension Pack
* Maven for Java
* Live Server (opcional)

### 4. Instalar Dependências

Na raiz do projeto execute:

```bash
./mvnw clean install
```

### 5. Executar o Backend

```bash
./mvnw spring-boot:run
```

A aplicação iniciará em:

```text
http://localhost:8080

Com isso, o usuario nao consegue entrar direto no sitema sem passar pelo cadatro e login. Caso de algum erro, entre por:

http://localhost:8080/login.html

```

### 6. Persistência dos Dados

Para fins acadêmicos, o sistema utiliza o LocalStorage do navegador para armazenar:

* Usuário logado
* Histórico de ações
* Informações temporárias da aplicação

Não é necessário instalar ou configurar banco de dados.


### 7.📄 Telas do Sistema
* Login
Permite autenticação dos usuários.

* Cadastro
Permite criar novas empresas e usuários.

* Dashboard
Exibe indicadores gerais da empresa.

* Funcionários
Cadastro, visualização e exclusão de funcionários.

* Mercadorias
Cadastro, visualização e exclusão de mercadorias.

👨‍💻 Desenvolvido por

André Felix da Silva Souza
Yago Ferreira Fernandes
Graziela Andrade da Silva

Projeto A3 acadêmico desenvolvido para a disciplina de Sistemas de Informação. 1° Semestre
