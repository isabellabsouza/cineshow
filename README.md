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
 
 ![Casos de Uso](https://github.com/isabellabsouza/cineshow/assets/87506772/d4f336ab-4358-4cbd-a6c4-79dc5a0a16b9)

Os casos de uso na cor azul foram implementados, enquanto que o caso de uso "Validar Ingresso" foi feito pensando em uma estrutura física: antes de entrar na sala onde o filme será exbido, um funcionário do estabelecimento valida o ingresso, para que não posse ser utilizado mais de uma vez.

### Diagrama de Classes

![diagrama de classes](https://github.com/isabellabsouza/cineshow/assets/87506772/f68562c8-a42f-4196-ba59-243b8b4a733e)


### Arquitetura

![arquitetura](https://github.com/isabellabsouza/cineshow/assets/87506772/d2ca03c4-b349-43f2-887e-6756e1d7e608)

Essa arquitetura foi modelada utilizando o caso de uso "Gerenciar Filmes" como exemplo, mas será replicada para os demais casos de uso.

Utilizei o padrão de projeto MVC, uma camada Service para restringir a quantidade de classes que tem acesso ao meu Repository. 


