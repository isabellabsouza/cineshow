# Cineshow

### Projeto para uma aplicação Web que gerencie cinemas, tornado o usuário capaz de cadastrar sua infraestrutura (salas de cinema), sessões, e filmes que serão exibidos, além de relizar vendas.

#### TECNOLOGIAS:
- Java com Spring e Lombok,
- Thymeleaf
- HTML, CSS, Bootstrap,
- Banco de Dados MySQL

<div align="center" style="display: inline_block"><br>
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />
    <img align="center" height="60" width="60" src="https://www.thymeleaf.org/images/thymeleaf.png" />
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg" />
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original-wordmark.svg" />
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" />
    <img align="center" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" />
</div>

---


### Modelo de Casos de Uso
 
 ![Casos de Uso](assets/Casos%20de%20Uso.png)

Os casos de uso na cor azul foram implementados, enquanto que o caso de uso "Validar Ingresso" foi feito pensando em uma estrutura física: antes de entrar na sala onde o filme será exbido, um funcionário do estabelecimento valida o ingresso, para que não posse ser utilizado mais de uma vez.

### Diagrama de Classes

![diagrama de classes](assets/diagrama%20de%20classes.png)


### Arquitetura

![arquitetura](assets/arquitetura.png)

Essa arquitetura foi modelada utilizando o caso de uso "Gerenciar Filmes" como exemplo, mas será replicada para os demais casos de uso.

Utilizei o padrão de projeto MVC, uma camada Service para restringir a quantidade de classes que tem acesso ao meu Repository. 


