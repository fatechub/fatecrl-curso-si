---
layout: post
title:  "Desenvolvimento para Servidores II"
fatec: fatec-rl
ciclo: 5
teacher: Ciro
date:   2015-01-01
categories: grade-2013 ciclo-5 fatec-rl
---

<span class="label label-warning text-uppercase"><span class="glyphicon glyphicon-star"></span> Fixo</span>

- [Moodle](http://fatecrl.edu.br/moodle/course/view.php?id=395)
- [ciroct@gmail.com](ciroct@gmail.com)

***

## Material, Apostilas e Ferramentas
- [Download NetBeans](https://netbeans.org/)
- [E-book Use a Cabeça JAVA.pdf][URL_livro_ebook_usecabecaJava]

***

## TPs e Provas

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon-star"></span> TP1</span>

**Cadastro Cliente Telefonia**

- Enunciado [DPS2-Ex01.pdf][URL_DPS2_Ex01_pdf]
- Solução netbeans [URL_proj_netbeans_CadastroClienteNet][URL_proj_netbeans_CadastroClienteNet]
- Solução netbeans do Professor [workspace-netbeans/CadastroClienteNetSolucaoProfessor][URL_proj_netbeans_CadastroClienteNetSolucaoProfessor]


<span class="label label-success text-uppercase"><span class="glyphicon glyphicon-star"></span> TP2</span>

**Projeto: WebAppAgenda**

Cadastrar, Editar, Deletar e Login Usuarios e contatos. (JPA + JPQL + PrimeFaces + Ajax + Idiomas + Login Sessão Filtro)

> Criar banco chamado "ciro_agenda" e se necessário mudar dados de acesso (user,pass) no arquivo de persistence

- Solução netbeans: [URL_proj_netbeans_WebAppAgenda][URL_proj_netbeans_WebAppAgenda]

**Screenshot**

<img src="{{ site.url_content }}screenshot-webapp-jsf.gif" class="img-responsive">

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon-star"></span> P1</span> 

**Enunciado + Colinha Consulta + Solução**

- [Dropbox/P1-2015-2SEM][URL_prova1_2015s2]


<span class="label label-success text-uppercase"><span class="glyphicon glyphicon-star"></span> P2</span>

**Enunciado + Colinha Consulta + Solução**

- [Dropbox/P2-2015-2SEM][URL_prova2_2015s2]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon-star"></span> P1+P2 de 2013</span> 

- [Dropbox/P2-2013-2SEM][URL_prova1_2013s2]
- [Dropbox/P1-2013-2SEM][URL_prova2_2013s2]

***

## Aulas e Atividades


### Plano de Ensino
 - [PlanoEnsino-DPS2-2015-1.pdf][URL_PlanoEnsino_DPS2_2015_1_pdf]


### Tecnologias de Programação Web
- [DPS2-01-Historico.pdf][URL_Historico_pdf]


### Java EE: uma visão geral
[DPS2-02-JavaEE.pdf][URL_DPS2_02_JavaEE_pdf]


### Conversores e Validadores
[DPS2-03-Conversores-Validadores.pdf][URL_DPS2_03_Conversores_Validadores_pdf]


#### Projeto: Login:

Formulário de login sem sessão com conversor e validação de dados.

- Solução netbeans: [URL_proj_netbeans_Login][URL_proj_netbeans_Login]


#### Projeto: Pagamento:

Formulário de pagamento - nome, data, código cartão com conversor e validação de dados.

- Solução netbeans: [URL_proj_netbeans_Pagamento][URL_proj_netbeans_Pagamento]


### Facelets
[DPS2-04-Facelets.pdf][URL_DPS2_04_Facelets_pdf]


#### Projeto: Media:
Formulário simples, que calcula média de aluno solicitando notas da P1 e P2.

- Solução netbeans: [URL_proj_netbeans_Media][URL_proj_netbeans_Media]

#### Projeto: ReservaHotel:
Formulário para reserva, envia para outra página de confirmação.

- Solução netbeans: [URL_proj_netbeans_Reserva][URL_proj_netbeans_Reserva]


### Tratamento de Eventos
[DPS2-05-Eventos.pdf][URL_DPS2_05_Eventos_pdf]
 
#### Projeto: Idiomas:
Tratamento de eventos gerados pelo usuário, tais como a seleção de um item de menu (idiomas).

- Solução netbeans: [URL_proj_netbeans_Idioma][URL_proj_netbeans_Idioma]

#### Projeto: AppleMicrosoft:
Tratamento de eventos gerados pelo usuário, tais o clique num botão (imagem mapeada).

- Solução netbeans: [URL_proj_netbeans_AppleMicrosoft][URL_proj_netbeans_AppleMicrosoft]


### Tabela de Dados
[DPS2-06-DataTable.pdf][URL_DPS2_06_DataTable_pdf]

#### Projeto: ListaPessoas:
Fazer uma listagem de usuários (ArrayList) em uma página usando DataTable.

- Solução netbeans: [URL_proj_netbeans_ListaPessoas][URL_proj_netbeans_ListaPessoas]

#### Projeto: Carrinho:
Fazer um carrinho de produtos. 

- Solução netbeans: [URL_proj_netbeans_Carrinho][URL_proj_netbeans_Carrinho]


### Sessão e Filtro
[DPS2-07-Sessao-Filtro.pdf][URL_DPS2_07_Sessao_Filtro_pdf]

#### Projeto: CarrinhoSessao:
Fazer um carrinho de produtos com sessão e filtro de "autenticação". 

- Solução netbeans: [URL_proj_netbeans_CarrinhoSessao][URL_proj_netbeans_CarrinhoSessao]


***

<div class="alert alert-info">Início matéria P2</div>


### AJAX
[DPS2-08-Ajax.pdf][URL_DPS2_08_Ajax_pdf]

#### Projeto: AjaxNumeroAleatorioForm

Gerador de numero aleatorio (ajax)

- Solução netbeans: [URL_proj_netbeans_AjaxNumeroAleatorioForm][URL_proj_netbeans_AjaxNumeroAleatorioForm]

#### Projeto: AjaxContaBanco

ver saldo da conta atraves de codigo e senha (ajax)

- Solução netbeans: [URL_proj_netbeans_AjaxContaBanco][URL_proj_netbeans_AjaxContaBanco]


### JDBC (Java Database Connectivity)
[DPS2-09-JDBC.pdf][URL_DPS2_09_JDBC_pdf]

#### Projeto: TestaConexao (Only Java)

**Tabela Contatos**

```
CREATE TABLE IF NOT EXISTS `contatos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;
```

Cria apenas com JAVA um programa que insere e lista contatos em um DB.

- Solução netbeans: [URL_proj_netbeans_TestaConexaoJAVA][URL_proj_netbeans_TestaConexaoJAVA]

> DICA: Como passar argumentos via "Main" Execução

<img src="{{ site.url_content }}como-passar-argumentos-main.png" class="img-responsive">


#### Projeto: Contatos (JavaWEB)

- Solução netbeans: [URL_proj_netbeans_Contatos][URL_proj_netbeans_Contatos]

> [Como "Instalar" drive mysql no glassfish](http://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-glassfish-config.html)
> 
> - Baixar [mysql-connector-java-5.1.23-bin.jar][URL_proj_netbeans_mysqlConnectorjava_5123bin_jar]
> - Colar em um dos dois:
> - C:\Program Files\glassfish-4.1\glassfish\domains\domain1\lib
> - C:\Program Files\glassfish-4.1\glassfish\lib

**Screenshot**

<img src="{{ site.url_content }}screenshot-contatos-jsf.png" class="img-responsive">


### JPA (Java Persistence API)
[DPS2-10-JPA.pdf][URL_DPS2_10_JPA_pdf]

#### Projeto: JPATeste (Only Java)

> #### PASSOS
> - Add bibliotecas **EclipseLink (JPA 2.1)** e **Driver JDBC do MySQL**
> - configurar user, senha e o banco **ciro_financas** em util/jpa/JPAEntityManager.java e META-INF/persistence.xml

- Solução netbeans: [URL_proj_netbeans_JPATeste][URL_proj_netbeans_JPATeste]

<div class="alert alert-info">Projeto JPATeste <b>deletado</b>... Use "Projeto Financas"</div>


### JPQL (Java Persistence Query Language)
[DPS2-11-JPQL.pdf][URL_DPS2_11_JPQL_pdf]


### PrimeFaces
[DPS2-12-PrimeFaces.pdf][URL_DPS2_12_PrimeFaces_pdf]

#### Projeto: Financas

Cadastrar, Editar, Deletar Conta (JPA + JPQL + PrimeFaces + Ajax)

- Solução netbeans: [URL_proj_netbeans_Financas][URL_proj_netbeans_Financas]


[URL_livro_ebook_usecabecaJava]: https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=exC7yg4Fh4Izgsbi2%2f6JhrI7YDAAfYtrNcBdKX3O4bQ%3d&docid=0d449a6fe69ae4b85944265337b790078
[URL_prova1_2015s2]: https://www.dropbox.com/sh/szzv3j2bsr1go51/AAABw96KHIjgfiKv8nVaU47ra?dl=0
[URL_prova2_2015s2]: https://www.dropbox.com/sh/zcx3mc3ligz06bj/AAD3cVmQezqhx2SpPA7DNpjea?dl=0
[URL_prova1_2013s2]: https://www.dropbox.com/sh/fldfgohp586pbbf/AACo-qQRELnR6G3l9XFMt8hta?dl=0
[URL_prova2_2013s2]: https://www.dropbox.com/sh/73eeo9klpb7ynyp/AAAUSRWwtKyTRxxhnYRQmDsPa?dl=0
[URL_Historico_pdf]: https://www.dropbox.com/s/og7on5p0ymjvawn/DPS2-01-Historico.pdf?dl=0 
[URL_DPS2_02_JavaEE_pdf]: https://www.dropbox.com/s/gc9qkf1recwfqc7/DPS2-02-JavaEE.pdf?dl=0
[URL_DPS2_03_Conversores_Validadores_pdf]: https://www.dropbox.com/s/m5k1taezj3zivvu/DPS2-03-Conversores-Validadores.pdf?dl=0
[URL_DPS2_04_Facelets_pdf]: https://www.dropbox.com/s/56ekeoof5iw5kmf/DPS2-04-Facelets.pdf?dl=0
[URL_DPS2_05_Eventos_pdf]: https://www.dropbox.com/s/193oftbm8zzbugy/DPS2-05-Eventos.pdf?dl=0
[URL_DPS2_06_DataTable_pdf]: https://www.dropbox.com/s/6kzbl2l2kp4nxfu/DPS2-06-DataTable.pdf?dl=0
[URL_DPS2_07_Sessao_Filtro_pdf]: https://www.dropbox.com/s/l52tt90vjfpbqjw/DPS2-07-Sessao-Filtro.pdf?dl=0
[URL_DPS2_08_Ajax_pdf]: https://www.dropbox.com/s/dti9gmayt76ovl4/DPS2-08-Ajax.pdf?dl=0
[URL_DPS2_09_JDBC_pdf]: https://www.dropbox.com/s/2pyecy1rg4y6s3w/DPS2-09-JDBC.pdf?dl=0
[URL_DPS2_10_JPA_pdf]: https://www.dropbox.com/s/bfxo6gti0x7m405/DPS2-10-JPA.pdf?dl=0
[URL_DPS2_11_JPQL_pdf]: https://www.dropbox.com/s/j042tibq8ln2vws/DPS2-11-JPQL.pdf?dl=0
[URL_DPS2_12_PrimeFaces_pdf]: https://www.dropbox.com/s/51r0hn8t8yjpjrt/DPS2-12-PrimeFaces.pdf?dl=0
[URL_DPS2_Ex01_pdf]: https://www.dropbox.com/s/qo1nmvw6qcpbaxo/DPS2-Ex01.pdf?dl=0
[URL_DPS2_Projeto_2015_1_pdf]: https://www.dropbox.com/s/b6hldofftc8rjfg/DPS2-Projeto-2015-1.pdf?dl=0
[URL_PlanoEnsino_DPS2_2015_1_pdf]: https://www.dropbox.com/s/z30p35pmt4p127f/PlanoEnsino-DPS2-2015-1.pdf?dl=0
[URL_proj_netbeans_CadastroClienteNet]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/CadastroClienteNet
[URL_proj_netbeans_CadastroClienteNetSolucaoProfessor]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/CadastroClienteNetSolucaoProfessor
[URL_proj_netbeans_WebAppAgenda]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/WebAppAgenda
[URL_proj_netbeans_Login]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Login
[URL_proj_netbeans_Pagamento]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Pagamento 
[URL_proj_netbeans_Media]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Media
[URL_proj_netbeans_Reserva]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Reserva
[URL_proj_netbeans_Idioma]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Idioma
[URL_proj_netbeans_AppleMicrosoft]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/AppleMicrosoft
[URL_proj_netbeans_ListaPessoas]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/ListaPessoas
[URL_proj_netbeans_Carrinho]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Carrinho
[URL_proj_netbeans_CarrinhoSessao]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/CarrinhoSessao
[URL_proj_netbeans_AjaxNumeroAleatorioForm]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/AjaxNumeroAleatorioForm
[URL_proj_netbeans_AjaxContaBanco]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/AjaxContaBanco
[URL_proj_netbeans_TestaConexaoJAVA]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/TestaConexaoJAVA
[URL_proj_netbeans_Contatos]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Contatos
[URL_proj_netbeans_mysqlConnectorjava_5123bin_jar]: https://www.dropbox.com/s/ob49slz72u4fla5/mysql-connector-java-5.1.23-bin.jar?dl=0
[URL_proj_netbeans_JPATeste]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/JPATeste
[URL_proj_netbeans_Financas]: {{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/Financas
