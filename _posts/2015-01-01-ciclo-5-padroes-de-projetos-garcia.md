---
layout: post
title:  "Padrões de Projetos"
fatec: fatec-rl
ciclo: 5
teacher: Garcia
date:   2015-01-01
categories: grade-2013 ciclo-5 fatec-rl
---
 
## Material, Apostilas e Ferramentas
- [E-book Use a Cabeça JAVA.pdf][URL_livro_ebook_usecabecaJava]
- Artigo com problemas e soluções Padrões de Projeto por Brizemp [brizeno.wordpress.com/padroes/](https://brizeno.wordpress.com/padroes/)
- Repositório com exemplos de utilização de padrões de projeto implementados em Java. [MarcosX/Padr-es-de-Projeto](https://github.com/MarcosX/Padr-es-de-Projeto)
- E-Book Use a Cabeça  [Padrões de Projetos.pdf][URL_livro_ebook_designpattern]
- Design pattern samples in Java. [github.com/iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns)

***

## TPs e Provas

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> P1</span> 

**Enunciado + Colinha Consulta + Solução**

- [Dropbox/P1-2015-2SEM][Dropbox/P1-2015-2SEM]
- Solução EX1: [URL_proj_eclipse_DesignPatterns-Adapter/src/LinuxDOS][URL_proj_eclipse_DesignPatterns-Adapter/src/LinuxDOS]
- Solução EX2: [URL_proj_eclipse_DesignPatterns-Decorator/src/linguagemToy][URL_proj_eclipse_DesignPatterns-Decorator/src/linguagemToy]
- Solução EX3: [URL_proj_eclipse_Reflection/src/createSelectAnnotationFora][URL_proj_eclipse_Reflection/src/createSelectAnnotationFora]
- Solução EX4: [URL_proj_eclipse_DesignPatterns-Strategy/src/ClienteDesconto][URL_proj_eclipse_DesignPatterns-Strategy/src/ClienteDesconto]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> P2</span> 

**Enunciado + Colinha Consulta + Solução**

- [Dropbox/P1-2015-2SEM][Dropbox/P1-2015-2SEM]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> LISTAS</span>

**Lista 1 Exercicios Reflection**

- Enunciados: [L1.pdf][L1.pdf]
- Soluções: [URL_proj_eclipse_Reflection-Lista1][URL_proj_eclipse_Reflection-Lista1]

**Lista 2 Exercicios Reflection**

- Enunciados: [6PPL2.pdf][6PPL2.pdf]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Outras Provas</span>

- [Dropbox/OUTRAS-PROVAS-PP][Dropbox/OUTRAS-PROVAS-PP]
 
***

## Aulas e Atividades


### Ementa Tópicos especiais em Sistemas para Internet

1. [Polimorfismo](http://pt.wikipedia.org/wiki/Polimorfismo)  para métodos (GENERICS) / Collections
2. [Reflection](http://bit.ly/1F1nRlZ)
3. [Design Patterns](http://pt.wikipedia.org/wiki/Padr%C3%A3o_de_projeto_de_software)
  - [Strategy](http://pt.wikipedia.org/wiki/Strategy)
  - [Abstract Factory](http://pt.wikipedia.org/wiki/Abstract_Factory)
  - [Decorator](http://pt.wikipedia.org/wiki/Decorator)
  - [Singleton](http://pt.wikipedia.org/wiki/Singleton)
  - [Observer](http://pt.wikipedia.org/wiki/Observer)
  - [Visitor](http://pt.wikipedia.org/wiki/Visitor_Pattern)
  - [Proxy](http://bit.ly/1F1nQOE)
4. [Orientação a aspectos](http://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_orientada_a_aspecto)
5. Topicos especiais


### Referências bibliográficas

1. Java reflection in action. Ira Foreman e Nate Foreman - 2004.
2. Design Patterns: Elements of Rensable (?) object-oriented software. Eric Gamma, Rich Helm, Ralph Jhonson e John vissides (?). (Gang of Four ou GOF).
3. Use a cabeça: Design patterns. Eric Freeman e Elisabeth Freeman.


### Polimorfismo de Subtipos

É a maneira de referenciar um objeto de várias formas.

<pre>
Gato g = new Gato()              |       a.arranhar()   [X]
Animal a  = new Gato()           |       g.arranhar()   [✓]

                        _________________________ 
                       |         ANIMAL          | 
                       |                         | 
                       | + void emitirSom()      | 
                       | + void dormir()         |
                       |_________________________|
                            ^                 ^
                            |                 |
       _________________________           _________________________
      |          GATO           |         |        CACHORRO         |
      |                         |         |                         |
      | + void emitirSom()      |         | + void emitirSom()      |
      | + void arranhar()       |         | + void cavar()          |
      |_________________________|         |_________________________|

</pre>

- [Teoria dos tipos](http://pt.wikipedia.org/wiki/Teoria_dos_tipos)
- [Alocação de memória](http://pt.wikipedia.org/wiki/Aloca%C3%A7%C3%A3o_de_mem%C3%B3ria)


### Princípio de POO (Programação Orientada a Objetos)
Programe para uma abstração, nunca para uma implementação.

Dica de leitura: [~viviane.silva/Princípio-de-POO](http://www2.ic.uff.br/~viviane.silva/2010.1/es1/util/aula11_a.pdf)


### Polimorfismo para Método (GENERICS)
Criar um tipo novo que englobe o outro. O foco é na estrutura do novo tipo e não no tipo englobado.

**Ex.:** Movimentar a mochila na cadeira, você pode fazer isso independente do que houver na mochila.

O ARRAY LIST É UM EXEMPLO. Ele lista qualquer coisa que for definido.

{% highlight java %}
ArrayList <String>
ArrayList <Ninja>
{% endhighlight %}

#### Projeto ListaT

- Branch workspace-eclipse: [URL_proj_eclipse_Reflection/ListaT][URL_proj_eclipse_Reflection/ListaT]

### Bound
Usado para fazer restrição. 

**Upper boud**
Ele não passa 'Joia', caso haja uma classe acima ele não pega.

Se for usado uma string dará erro. Só serão aceitos os "filhos" (subclasse  Joia).

{% highlight java %}
public class Caixa < T extends Joia > {
  ...
}
{% endhighlight %}

**Lower bound**

<pre>
      |---------------|               |-------------------------|
      |     list      |               |          Number         |
      |---------------|               |-------------------------|
            ^                               ^             ^
            |                               |             |
      |---------------|             |-------------|    |-------------|
      |   ArrayList   |             |   integer   |    |   integer   |
      |---------------|             |-------------|    |-------------|
</pre>

<pre>
List< ? super Number > a = New arrayList< objeto >;
          |
          |-------> Só pode chegar até *NUMBER*
                    Não poderá chegar na classe *String* nem *Integer* porque é acima. 
</pre>

### Regra PECS

- `super` Só add();
- `extends` só faz get();
 

***


<div class="alert alert-info">Início Matéria Prova</div>

### Reflection
Conhecido como *BlackMagic*, **Reflection** possibilita a exposição de quaisquer membro existente dentro uma classe em *RunTime*. 

> *É nada mais do que a habilidade de enxergar um *.class*' (no java).* - Garcia

É um pacote que te dá permissão de ver informações do seu *.class*. como:

- **MetaDado**
- **MetaObjeto (meta classe)** Representam informações da classe
- **Classes**
- **Type**
- **Method** Métodos.
- **Field** Atributos.
- **Annotations** Marcador para conversas com o compilador.
- **Modifier** abstract, protected, public, private, default.
 
**Vantagens**

Criação de aplicativos mais dinâmicos, Redução na quantidade de repetição de código (Boilerplate), Minimização de erros e Facilidade de manutenção.

**Desvantagens**
Domínio mais avançado de lógica de programação, Exigência de um maior nível de atenção ao codificar e Geração de código complexo.

**Iniciando Reflection...**

{% highlight java %}
myClass (Object o){
  Class< ? > clazz = o.getClass();
}
{% endhighlight %}

**Exemplo de Boilerplate**

Evitamos repetição trecho de código em várias partes do arquivo mudando apenas pequenas coisas, como por exemplo um toString():

{% highlight java %}
public String toString(){
  return "ClasseNome";
}
{% endhighlight %}

**Resolvemos assim:**

{% highlight java %}
public String toString(){
  Class < ? > c = this.getClass(); // Pega infos. da Classe.
  return c.getSimpleName(); // Mostra nome da Classe.
}
{% endhighlight %}


### Slides: Introdução à Metaprogramação com Java Reflection API

<iframe src="//www.slideshare.net/slideshow/embed_code/14082634" width="510" height="420" frameborder="0" marginwidth="0" marginheight="0" scrolling="no" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen> </iframe> <div style="margin-bottom:5px"> <strong> <a href="//pt.slideshare.net/guilherme_farto/introduo-metaprogramao-com-java-reflection-api" title="Introdução à Metaprogramação com Java Reflection API" target="_blank">Introdução à Metaprogramação com Java Reflection API</a> </strong> from <strong><a href="//www.slideshare.net/guilherme_farto" target="_blank">Guilherme de Cleva Farto</a></strong> </div>


#### Projeto PortaJoias
- Solução workspace-eclipse: [URL_proj_eclipse_Reflection/PortaJoias][URL_proj_eclipse_Reflection/PortaJoias]


#### Projeto: Interceptor (SIMULADO P1)

(Interceptação de métodos) Crie uma annotation @Interceptor que possua como valor String um nome de método (`met`) e um Class (`cl`) que representa uma classe.
Faça uma classe `Foo` com os métodos privados `void fazAlgo()` que mostra na tela o nome do método e `void fazNada()` que mostra a mensagem nada, apenas para teste.
Faça uma classe `Bar` com um método `void hello()` publico que mostra uma mensagem de boas-vindas. Este método deve ser marcado com a annotation **@Interceptor** de modo a ter o nome do método de sua escolha (*fazNada, fazAlgo*) e um `Foo.class`.
Faça uma classe `Delegator` que possua o método `void voidExecutor(Object, String)` que recebe um Object de referencia e um nome de método. Se o método não existir, exiba um erro. Se existir procure pela annotation **@Interceptor** e execute o método definido nesta annotation. Após a execução do método definido na annotation. o método em questão de dentro de voidExecutor deve ser chamado tambem.

- Solução workspace-eclipse: [URL_proj_eclipse_Reflection/src/Interceptor][URL_proj_eclipse_Reflection/src/Interceptor]

### Annotations

O conceito mais básico é: anotações são metadados.

São dados adicionais que você relaciona com classes, métodos, atributos, parâmetros e variáveis.

Os dados podem ser usados em tempo de compilação e de execução, conforme definição da anotação.

> *É um marcador que pode ser salvo no bytecode* - Garcia

Alguns Annotations: *@Override, @SupressWarnings e @ManagedBean*.

**Mostrando métodos de uma class que possuem annotation @MyAnno.**

{% highlight java %}
Method[] ms = clazz.getDeclaredMethods();
for(Method v : ms){
  if( v.ifAnnotationPresent(MyAnno.class) ){
    syso( v.getName() + "Possuí annotation @MyAnno" );
  }
  else {
    syso( v.getName() + "Não possuí annotation @MyAnno" );
  }
}
{% endhighlight %}
 
**Exemplos**

- #### GenericCreateTableDB - Simula Persistência com Reflection
[URL_proj_eclipse_Annotations/src/GenericCreateTableDB][URL_proj_eclipse_Annotations/src/GenericCreateTableDB] *@Table(nome=X), @Column(nome=X), @Varchar(qut=X)*

- #### ValidarNotNullEMaiorIdade
[URL_proj_eclipse_Annotations/src/ValidarNotNullEMaiorIdade][URL_proj_eclipse_Annotations/src/ValidarNotNullEMaiorIdade] *@NotNull(conteudo=X), @isMaior(idade=Y)*

- #### Autor
[URL_proj_eclipse_Annotations/src/autor][URL_proj_eclipse_Annotations/src/autor] *@autor(nome=X, tempo=Y)*

- #### Annotation: Ordem
[URL_proj_eclipse_Annotations/src/ordem][URL_proj_eclipse_Annotations/src/ordem] *@ordem(numero=X)*


### Padrão de Projeto: (DECORATOR)

> Utilizado quando precisa-se anexar responsabilidades dinamicamente sem precisar de uma grande hierarquia de subclasses.

O Decorator é mais utilizado quando quisermos adicionar responsabilidades a objetos dinamicamente, e quando a extensão por subclasses é impraticável, pois teríamos muitas alterações e dessa forma diversas subclasses.

**Consequências**

- A) Mais flexibilidade do que herança. (Adição ou remoção de responsabilidades em tempo de execução) && (Adição da mesma propriedade mais de uma vez)
- B) Evita o excesso de funcionalidades nas classes
- C) Decorator e seu componente não são idênticos
- D) Comparações tornam-se mais complexas
- E) Resulta em um design que tem vários pequenos objetos, todos parecidos

**Dica**
Possíveis palavras chaves para você identificar o padrão decorator: "Incorporar", "Compor", "Acoplamento", "Juntar", "Mesclar", "Incluir", "Adicionar".

**UML**

<img src="{{ site.url_content }}PP-Decorator.png" class="img-responsive">

#### Projeto: JanelaDecorator

Exemplo JanelaDecorator baseado no artigo [Padrão de Projeto Decorator em Java por devmedia](http://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238)

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Decorator/src/janeladecorada][URL_proj_eclipse_DesignPatterns-Decorator/src/janeladecorada]

**UML**

<img src="{{ site.url_content }}PP-Decorator-Janela.png" class="img-responsive">

#### Exercício: EmpresaPublica

Em uma empresa públca, um cargo possui um nome e um valor de salário. 
Os cargos de ingresso são auxiliar, especialista, e gerente.
Se alguém com um cargo entrar para um cargo político (Secretário, Prefeito ou Vereador) o salário deve ser incorporado.
Um cargo pode ter mais de uma incorporação, os sálarios base são calculados como se segue:

- **Auxiliar** = Inicial + 1000
- **Especialista** = Inicial + 2500
- **Gerente** = Inicial + 3000

e as incorporações:

- **Prefeito** = Base + 4000
- **Secretário** = Base + 2000
- **Vereador** = Base + 5000

Para o cargo: Se alguém entra como especialista e incorpora vereador e prefeito o cargo fica: especialista incorporado como prefeito incorporado como vereador.

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Decorator/src/empresapublicacargos][URL_proj_eclipse_DesignPatterns-Decorator/src/empresapublicacargos]

**UML**

<img src="{{ site.url_content }}PP-Decorator-Cargos.png" class="img-responsive">


#### Exercício: PacotesViagem (SIMULADO P1)

Em  uma agência de viagem, são vendidos destinos para Cruzeiro, Praia ou Campo. Toda viagem possui uma descrição e um preç base. 
A estes pacotes podem ser inclusos pacotes de Bebidas, Passeios extras, e serviços de Massagem contratados pela agência. 
Todo pacote possui uma descrição e um preço. 
Cada preço varia de acordo com o pacote. Faça um sistema que mostre a descrição da viagem contratada (destino + pacotes) e o preço total do contrato. 
Este sistema deve aderir ao princípio do aberto/fechado.

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Decorator/src/pacotesviagem][URL_proj_eclipse_DesignPatterns-Decorator/src/pacotesviagem]

**UML**

<img src="{{ site.url_content }}PP-Decorator-PacotesViagens.png" class="img-responsive">


### Padrão de Projeto (STRATEGY)

Define uma família de algoritmos, encapsula e os torna intercambiaveis (variáveis).

O Strategy é utilizado quando você tem um determinado algoritmo, rotina ou algo deste tipo, e que pode mudar em determinadas ocasiões. Suponhamos que você por exemplo tem uma classe de cálculo de juros e que em uma determinada data do ano, a taxa de juros diminui por conta de uma promoção. Então em cenários como este você, utilizaria o Strategy para auxiliar na solução desta demanda sem causar grande impacto para efetuar a mudança.

> ***Principio***: Encapsule o que varia.

**Consequências**

- **A)** Não fere a regra de aberto e fechado. 
- **B)** Facilidade ao debugar. 
- **C)** Não cresce esponencialmente

**UML**

<img src="{{ site.url_content }}PP-Strategy.png" class="img-responsive">

#### Exercício LojaVirtual:

Uma loja virtual prossue alguns produtos a venda. Os produtos são livros, DVDs e brinquedos. Cada produto possui nome e preço. A mesma loja oferece promoções diferentes a cada mês. Uma promoção reguçar desconta cada produto em 10% mais um desconto extra varia de 5% a 10% dependendo do mês. Uma liquidação desnconta 30% ao preço de cada produto. Há meses quenão há promoção descrita.
Esta situação: 

- A) Desenhe o diagrama de classes;
- B) Codifique com base em A).

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Strategy/src/lojaVirtualPromocaoGarcia][URL_proj_eclipse_DesignPatterns-Strategy/src/lojaVirtualPromocaoGarcia]

**UML**

<img src="{{ site.url_content }}PP-Strategy-Promocao.png" class="img-responsive">


### Agregação X Composição

Na **Agregação**, a existência do Objeto-Parte faz sentido, mesmo não existindo o Objeto-Todo. Vejamos o exemplo Time-Atleta:

![Imagem1]({{ site.url_content }}fig_02_agregacao.png)

Um time é formado por atletas, ou seja, os atletas são parte integrante de um time, mas os atletas existem independentemente de um time existir. Nesse caso, chamamos esse relacionamento de AGREGAÇÃO.

Já a **Composição** é uma agregação mais forte; nela, a existência do Objeto-Parte NÃO faz sentido se o Objeto-Todo não existir. Vejamos o exemplo Pedido-ItemPedido:

![Imagem2]({{ site.url_content }}fig_03_composicao.png)

[Fonte: imasters](http://imasters.com.br/artigo/18901/uml/uml-composicao-x-agregacao/)

### Principio do aberto e fechado

> *Todo código deve ser **aberto** para herança, e **fechado** para modificação.* - Garcia

O princípio Aberto/Fechado poderia ser entendido como uma implementação que permite adicionar novas funcionalidades sem mexer no código existente. Em outras palavras:

> Não precisamos alterar o conteúdo das classes, basta criar novas implementações de interfaces ou sobrescrever os métodos de classes existentes.

[Fonte: Stackoverflow](http://pt.stackoverflow.com/a/15651)


### Padrão de Projeto (CHAIN of Responsibility)

Evita **Acoplamento** (com if) entre o "Sender" de uma requisição Z, o recebedor dando a chance de mais de um objeto efetuar o tratamento. A cadeia de objetos trata a requisição conforme alguma requisição, caso não consiga o próximo elemento fica com a responsabilidade do tratamento.

> Decorator, Chain e Strategy tem polimofismo

**Estrutura**

Existem três partes do padrão Chain of Responsibility: sender, receiver e request. O sender faz o request. O receiver é uma cadeia de um ou mais objetos que escolhe se quer lidar com o request ou transmiti-lo. O request em si pode ser um objeto que encapsula todos os dados apropriados. [(Fonte: iMasters)](http://imasters.com.br/artigo/24337/javascript/padrao-de-projeto-de-software-javascript-chain-of-responsibility/)

**Consequências**

- **A)** Fornece um acoplamento mais fraco por evitar a associação explícita do remetente de uma solicitação ao seu receptor e dar a mais de um objeto a oportunidade de tratar a solicitação

**Dica:** Possíveis palavras chaves para você identificar o padrão CHAIN: "Passar ou Transferir Responsabilidade para o proximo", "Deixar o outro ou algo tentar, manusear, arcar, manobrar, controlar".

**UML**

<img src="{{ site.url_content }}PP-CHAIN.png" class="img-responsive">

#### Projeto: AprovacaoDeVerbas

Uma empresa trata aprovação de verbas. Uma verba pode ser Urgente ou normal. Toda verba possui um valor de investimento. O gerente aprova verbas normais ate 80000 unidades de valor e nao aprova verbas importantes. O superintendente aprova o valor. o VP aprova verbas verbas importantes de ate 200000 unidades. O CEO aprova qualquer verba. Eh importante mostrar na tela: Verba de xxxx R$ aprovada por yyyy, cargo zzzzz.
Sendo xxxx o valor a ser aprovado, yyyyy o nome do funcionario e zzzz seu cargo.

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/VerbaAprovacaoBanco][URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/VerbaAprovacaoBanco]

**UML**

<img src="{{ site.url_content }}PP-CHAIN-BancoAprovaVerba.png" class="img-responsive">

#### Projeto: BancoAprova

Uma aplicação de e-commerce precisa se comunicar com vários bancos diferentes para prover aos seus usuários mais possibilidades de pagamentos, atingindo assim um número maior de usuários e facilitando suas vidas. A classe Banco possui 3 subclasses BancoA, BancoB e BancoC. Os Bancos devem possuir um código de banco correspondente ao banco que vai efetuar o pagamento. Se um banco não puder efetuar um pagamento (Códigos não batem) o outro banco deve ser acionado para tentar finalizar esta operação (de pagamento) ordenadamente. Baseando-se nesta situação descrita.

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/BancoAprova][URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/BancoAprova]

**UML**

<img src="{{ site.url_content }}PP-CHAIN-AprovaBanco.png" class="img-responsive">


### Padrão de Projeto (ADAPTER)

Converte a interface de uma classe em uma ao qual é esperada pelo cliente. O Adapter permite que classe com interfaces incompatíveis trabalhem juntas. 
Este padrão é utilizado para 'adaptar' a interface de uma classe. O Adapter permite que classes com interfaces incompatíveis possam interagir.
Adapter permite que um objeto cliente utilize serviços de outros objetos com interfaces diferentes por meio de uma interface única. 
Ou seja, dado um conjunto de classes com mesma responsabilidade, mas interfaces diferentes, utilizamos o Adapter para unificar o acesso a qualquer uma delas.

> Imita o DuckType

**UML**

<img src="{{ site.url_content }}PP-Adapter.png" class="img-responsive">

#### Projeto: PatoAdaptadoPeru

Sabe se que todo Pato voa e grasna. Todo Pato pode ser Negro ou Verde. Um Peru, que não é Pato emite som e não consegue voar. Faça com que Peru e Pato trabalhem sob uma interface comum

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Adapter/src/PatoAdaptadoPeru][URL_proj_eclipse_DesignPatterns-Adapter/src/PatoAdaptadoPeru]

**UML**

<img src="{{ site.url_content }}PP-Adapter-Pato.png" class="img-responsive">


#### Projeto: PlayerVideo (SIMULADO P1)

Um player de video pode rodar o video e tambem gravar um video da webcam. Este player aceita os formatos AVI, MP4 ou RM.
Sabe-se que o WAV e MID que não são formatos de video podem rodar som e gravar som. Escolha um padrão e (1) Justifique (2) Faça o UML (3) Codifique.

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Adapter/src/PlayerVideo][URL_proj_eclipse_DesignPatterns-Adapter/src/PlayerVideo]

**UML**

<img src="{{ site.url_content }}PP-Adapter-PlayerVideo.png" class="img-responsive">


### Padrão de Projeto (Abstract Factory)

Vejamos a intenção do Padrão Abstract Factory: 

> “Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.”

Então, de acordo com a descrição da intenção do padrão, nós poderemos criar famílias de objetos, no nosso exemplo seriam a família de carros Sedan e a família de carros de Luxo.

- Anotações Aula Garcia 24/05 (PP): [gist.github.com/anonymous/2a98e1d6a59159ae4a67](https://gist.github.com/anonymous/2a98e1d6a59159ae4a67)

**UML**

<img src="{{ site.url_content }}PP-ABSTRACTFACTORY.png" class="img-responsive">

#### Projeto: LojaFabricaCarro

As fabricas "Citroen" e "Honda" podem fabricar Carros "Sedan" ou "Luxo". PS. O Carro pode receber um cor especial (objeto Cor)

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-AbstractFactory/src/lojafabricacarro][URL_proj_eclipse_DesignPatterns-AbstractFactory/src/lojafabricacarro]

**UML**

<img src="{{ site.url_content }}PP-ABSTRACTFACTORY-LojaFabricaCarro.png" class="img-responsive">


### Padrão de Projeto (Singleton)

A intenção do padrão é esta:

> “Garantir que uma classe tenha somente uma instância e fornece um ponto global de acesso para a mesma.”

A maior vantagem do Singleton é unificar o acesso das instâncias

**UML**

<img src="{{ site.url_content }}PP-SINGLETON.png" class="img-responsive">

#### Projeto: Singleton

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Singleton/src/singleton][URL_proj_eclipse_DesignPatterns-Singleton/src/singleton]

#### Projeto: Singleton (Quebrando o Patterns com multi-threads. "By Patrick")

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Singleton/src/multithreads][URL_proj_eclipse_DesignPatterns-Singleton/src/multithreads]


### ENUMs

São classes que carregam constants de enumeração (Tipos) estes são públicos, estáticos e finais.

**Algumas características:**

- ENUMS podem ter métodos;
- Os tipos das ENUMS carregam métodos;
- Os tipos são convertidos para números (.ordinall);
- ENUMS pode ter construtorees;
- ENUMS são Singletons!
- ENUMS podem ter interfaces

<pre>
[ CLIENTE ] 
  - cd_id
  - nm_nome
  - vl_anuidade
  - tp_cartao
       |n
       |
      / \
      \ /
       |
       |1
[ TipoCartao (ENUM) ]
  - nm_tipocartoa
  - ordem_anuidade
</pre>

#### Projeto: ENUMS Naips 

Inglês e Podem: PAUS("CLUBS",300), OUROS("DIAMONDS",100), ESPADAS("SPADES",250), COPAS("HEARTS",150);

- Solução JAVA: [URL_proj_eclipse_ENUMS/src/naipe][URL_proj_eclipse_ENUMS/src/naipe]

#### Projeto: ENUMS Animal (Sobrescrita)

- Solução JAVA: [URL_proj_eclipse_ENUMS/src/sobrescritaenums][URL_proj_eclipse_ENUMS/src/sobrescritaenums]

### Projeto: ENUMS TiposCarro

Faça a ENUM tipoCarro que possua os tipos "luxo", "sedan", "hatch". 
Crie uma constante inteira "importancia" que numere luxo com 10, sedan com 5 e hatch com 7 faca o teste

- Solução JAVA: [URL_proj_eclipse_ENUMS/src/tipocarros][URL_proj_eclipse_ENUMS/src/tipocarros]

#### Projeto: ENUMS TiposCarro

Crie a ENUM TipoCartao que possua as constantes GOLD, SILVER, PLATIUM e BLACK
cada constante pode determinar um desconto na anuidade que é de 10% GOLD, 20 SILVER, 30 PLAT, 50 BLACK

- Solução JAVA: [URL_proj_eclipse_ENUMS/src/tipocartao][URL_proj_eclipse_ENUMS/src/tipocartao]

#### Projeto: TipoCliente com ENUMS (com Persistencia)

No MySql ```create database ciro_garciatipocliente;```

- Solução JAVA: [URL_proj_netbeans_TpGarciaPersistenciaTipoCliente][URL_proj_netbeans_TpGarciaPersistenciaTipoCliente] - Made in netbeansprojects


### Padrão de Projeto (Visitor)

Vejamos a intenção do Padrão Visitor: 

> “Representar uma operação a ser executada nos elementos de uma estrutura de objetos. Visitor permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.”

Pela intenção já é possível ver como o padrão vai nos ajudar. A sua ideia é separar as operações que serão executadas em determinada estrutura de sua representação. Assim, incluir ou remover operações não terá nenhum efeito sobre a interface da estrutura, permitindo que o resto do sistema funcione sem depender de operações específicas.

**UML**

<img src="{{ site.url_content }}PP-VISITOR.png" class="img-responsive">

#### Projeto: Visitor Zoologico

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Visitor/src/zoologico][URL_proj_eclipse_DesignPatterns-Visitor/src/zoologico]

**UML**

<img src="{{ site.url_content }}PP-VISITOR-zoologico.png" class="img-responsive">


### Padrão de Projeto (Proxy)

Vejamos a intenção do Padrão Proxy: 

> “Fornecer um substituto ou marcador da localização de outro objeto para controlar o acesso a esse objeto.”

Protection Proxy: esse é o tipo de proxy que utilizamos no exemplo. Eles controlam o acesso aos objetos, por exemplo, verificando se quem chama possui a devida permissão.

**UML**

<img src="{{ site.url_content }}PP-PROXY.png" class="img-responsive">

#### Projeto: AutenticaUsuario Proxy

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Proxy/src][URL_proj_eclipse_DesignPatterns-Proxy/src]

**UML**

<img src="{{ site.url_content }}PP-PROXY-autenficausuario.png" class="img-responsive">


### Padrão de Projeto (Observer)

Vejamos a intenção do Padrão Observer: 

> “Definir uma dependência um para muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.” 

#### Projeto: RevistaFãs Observer

- Solução JAVA: [URL_proj_eclipse_DesignPatterns-Observer/src/revistafas][URL_proj_eclipse_DesignPatterns-Observer/src/revistafas]

[URL_livro_ebook_usecabecaJava]: https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=exC7yg4Fh4Izgsbi2%2f6JhrI7YDAAfYtrNcBdKX3O4bQ%3d&docid=0d449a6fe69ae4b85944265337b790078
[URL_livro_ebook_designpattern]: https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=93JZ95qrU%2fs1UEgPDbqrXwiHP4KExXEq0WrGnMt6JSM%3d&docid=178cbdec3adc944e19eedfbd76af46bda
[Dropbox/P1-2015-2SEM]:https://www.dropbox.com/sh/ecvvfpxcuynbfj7/AADoInmulPrz26O9amBCYeEca?dl=0
[Dropbox/P1-2015-2SEM]:https://www.dropbox.com/sh/omy1s76hjo0xldg/AAAqjz2P5RtgjJBp3Uud7ekma?dl=0
[L1.pdf]:https://www.dropbox.com/s/jvtsjesdor452cq/L1.pdf?dl=0
[6PPL2.pdf]:https://www.dropbox.com/s/ez7sbi3fafh2i41/6PPL2.pdf?dl=0
[Dropbox/OUTRAS-PROVAS-PP]:https://www.dropbox.com/sh/bs9oavesh4u1tgl/AAB81E1oxxAUVbUWtc0Yq8k1a?dl=0
[URL_proj_netbeans_TpGarciaPersistenciaTipoCliente]:{{ site.url_repository }}tree/gh-pages/content/workspace-netbeans/TpGarciaPersistenciaTipoCliente
[URL_proj_eclipse_DesignPatterns-Adapter/src/LinuxDOS]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Adapter/src/LinuxDOS
[URL_proj_eclipse_DesignPatterns-Decorator/src/linguagemToy]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Decorator/src/linguagemToy
[URL_proj_eclipse_Reflection/src/createSelectAnnotationFora]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Reflection/src/createSelectAnnotationFora
[URL_proj_eclipse_DesignPatterns-Strategy/src/ClienteDesconto]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Strategy/src/ClienteDesconto
[URL_proj_eclipse_Reflection-Lista1]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Reflection-Lista1/src
[URL_proj_eclipse_Reflection/ListaT]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Reflection/src/ListaT
[URL_proj_eclipse_Reflection/PortaJoias]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Reflection/src/PortaJoias
[URL_proj_eclipse_Reflection/src/Interceptor]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Reflection/src/Interceptor
[URL_proj_eclipse_Annotations/src/GenericCreateTableDB]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Annotations/src/GenericCreateTableDB
[URL_proj_eclipse_Annotations/src/ValidarNotNullEMaiorIdade]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Annotations/src/ValidarNotNullEMaiorIdade
[URL_proj_eclipse_Annotations/src/autor]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Annotations/src/autor
[URL_proj_eclipse_Annotations/src/ordem]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/Annotations/src/ordem
[URL_proj_eclipse_DesignPatterns-Decorator/src/janeladecorada]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Decorator/src/janeladecorada
[URL_proj_eclipse_DesignPatterns-Decorator/src/empresapublicacargos]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Decorator/src/empresapublicacargos
[URL_proj_eclipse_DesignPatterns-Decorator/src/pacotesviagem]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Decorator/src/pacotesviagem
[URL_proj_eclipse_DesignPatterns-Strategy/src/lojaVirtualPromocaoGarcia]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Strategy/src/lojaVirtualPromocaoGarcia
[URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/VerbaAprovacaoBanco]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-ChainOfResponsibility/src/VerbaAprovacaoBanco
[URL_proj_eclipse_DesignPatterns-ChainOfResponsibility/src/BancoAprova]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-ChainOfResponsibility/src/BancoAprova
[URL_proj_eclipse_DesignPatterns-Adapter/src/PatoAdaptadoPeru]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Adapter/src/PatoAdaptadoPeru
[URL_proj_eclipse_DesignPatterns-Adapter/src/PlayerVideo]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Adapter/src/PlayerVideo
[URL_proj_eclipse_DesignPatterns-AbstractFactory/src/lojafabricacarro]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-AbstractFactory/src/lojafabricacarro
[URL_proj_eclipse_DesignPatterns-Singleton/src/singleton]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Singleton/src/singleton
[URL_proj_eclipse_DesignPatterns-Singleton/src/multithreads]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Singleton/src/multithreads
[URL_proj_eclipse_ENUMS/src/naipe]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/ENUMS/src/naipe
[URL_proj_eclipse_ENUMS/src/tipocarros]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/ENUMS/src/tipocarros
[URL_proj_eclipse_ENUMS/src/tipocartao]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/ENUMS/src/tipocartaosistenciaTipoClienterc/zoologico
[URL_proj_eclipse_DesignPatterns-Observer/src/revistafas]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Observer/src/revistafas
[URL_proj_eclipse_ENUMS/src/sobrescritaenums]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/ENUMS/src/sobrescritaenums
[URL_proj_eclipse_DesignPatterns-Visitor/src/zoologico]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Visitor/src/zoologico
[URL_proj_eclipse_DesignPatterns-Proxy/src]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipse/DesignPatterns-Proxy/src
