---
layout: page
title: Ciclo 5 - Garcia - Padrões de Projetos
header: Pages
group: navigation
---
{% include JB/setup %}

<span class="label label-warning text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Fixo</span>

## **Lista 1 Exercicios Reflection** 
- Enunciados: [L1.pdf]({{ site.production_url }}/media/L1.pdf)
- Soluções: [/DesignPatterns-Lista1](https://github.com/adammacias/fatec-si/tree/eclipseprojects/DesignPatterns-Lista1/src)

## **Lista 2 Exercicios Reflection** 
- Enunciados: [6PPL2.pdf]({{ site.production_url }}/media/6PPL2.pdf) 

## **Provas de PP Semestres anteriores** 
- [Fotos DropBox](https://www.dropbox.com/sh/ov3oiz051aw26ob/AAC2iiLYDetFZQo9Ie0ezs-ia?dl=0) 

## **Cardeno de PP Mayara** 
- [Fotos DropBox](https://www.dropbox.com/sh/58os50tjxmrhjpz/AAB21tpAbRYvJ6iwk8Yc3w1ta?dl=0)

## Utilidades
- Artigo com problemas e soluções Padrões de Projeto por Brizemp [brizeno.wordpress.com/padroes/](https://brizeno.wordpress.com/padroes/)
- Repositório com exemplos de utilização de padrões de projeto implementados em Java. [MarcosX/Padr-es-de-Projeto](https://github.com/MarcosX/Padr-es-de-Projeto)
- E-Book Use a Cabeça  [Padrões de Projetos.pdf](https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=93JZ95qrU%2fs1UEgPDbqrXwiHP4KExXEq0WrGnMt6JSM%3d&docid=178cbdec3adc944e19eedfbd76af46bda)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 13/02</span>

## Ementa Tópicos especiais em Sistemas para Internet

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


## Referências bibliográficas

1. java reflection in action. Ira Foreman e Nate Foreman - 2004.
2. Design Patterns: Elements of Rensable (?) object-oriented software. Eric Gamma, Rich Helm, Ralph Jhonson e John vissides (?). (Gang of Four ou GOF).
3. Use a cabeça: Design patterns. Eric Freeman e Elisabeth Freeman.


## Polimorfismo de Subtipos

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

 
## Princípio de POO (Programação Orientada a Objetos)
Programe para uma abstração, nunca para uma implementação.

Dica de leitura: [~viviane.silva/Princípio-de-POO](http://www2.ic.uff.br/~viviane.silva/2010.1/es1/util/aula11_a.pdf)

## Polimorfismo para Método (GENERICS)
Criar um tipo novo que englobe o outro. O foco é na estrutura do novo tipo e não no tipo englobado.

**Ex.:** Movimentar a mochila na cadeira, você pode fazer isso independente do que houver na mochila.

O ARRAY LIST É UM EXEMPLO. Ele lista qualquer coisa que for definido.

{% highlight java %}
ArrayList <String>
ArrayList <Ninja>
{% endhighlight %}

### Projeto ListaT
- Branch eclipseProjects: [Reflection/ListaT](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Reflection/src/ListaT)
- Arquivos: [aula-2015-02-13.rar]({{ site.production_url }}/media/aula-2015-02-13.rar) 

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 20/02</span>

<div class="alert alert-info">Este inicio é uma atualizada sobre o que o ciro deu semestre passado. Isso ficou faltando (apenas pra ficar por dentro)</div>

## Bound
Usado para fazer restrição. 

#### Upper boud
Ele não passa 'Joia', caso haja uma classe acima ele não pega.

Se for usado uma string dará erro. Só serão aceitos os "filhos" (subclasse  Joia).

{% highlight java %}
public class Caixa < T extends Joia > {
  ...
}
{% endhighlight %}

#### Lower bound

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

#### Regra PECS

- `super` Só add();
- `extends` só faz get();
 
<div class="alert alert-info">Matéria do semestre</div>

## Reflection
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
 
### Vantagens
Criação de aplicativos mais dinâmicos, Redução na quantidade de repetição de código (Boilerplate), Minimização de erros e Facilidade de manutenção.

### Desvantagens
Domínio mais avançado de lógica de programação, Exigência de um maior nível de atenção ao codificar e Geração de código complexo.

### Iniciando Reflection...
{% highlight java %}
myClass (Object o){
  Class< ? > clazz = o.getClass();
}
{% endhighlight %}

### Exemplo de Boilerplate
Evitamos repetição trecho de código em várias partes do arquivo mudando apenas pequenas coisas, como por exemplo um toString():

{% highlight java %}
public String toString(){
  return "ClasseNome";
}
{% endhighlight %}

**Resolvemos assim:**

{% highlight java %}
public String toString(){
  Class < ? > c = this.Class(); // Pega infos. da Classe.
  return c.getSimpleName(); // Mostra nome da Classe.
}
{% endhighlight %}

### Slides: Introdução à Metaprogramação com Java Reflection API
<iframe src="//www.slideshare.net/slideshow/embed_code/14082634" width="510" height="420" frameborder="0" marginwidth="0" marginheight="0" scrolling="no" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen> </iframe> <div style="margin-bottom:5px"> <strong> <a href="//pt.slideshare.net/guilherme_farto/introduo-metaprogramao-com-java-reflection-api" title="Introdução à Metaprogramação com Java Reflection API" target="_blank">Introdução à Metaprogramação com Java Reflection API</a> </strong> from <strong><a href="//www.slideshare.net/guilherme_farto" target="_blank">Guilherme de Cleva Farto</a></strong> </div>

### Projeto PortaJoias
- Branch eclipseProjects: [Reflection/PortaJoias](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Reflection/src/PortaJoias)
- Arquivos: [aula-2015-02-20.rar]({{ site.production_url }}/media/aula-2015-02-20.rar)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 06/03</span>

## Annotations
O conceito mais básico é: anotações são metadados.

São dados adicionais que você relaciona com classes, métodos, atributos, parâmetros e variáveis.

Os dados podem ser usados em tempo de compilação e de execução, conforme definição da anotação.

> *É um marcador que pode ser salvo no bytecode* - Garcia

Alguns Annotations: *@Override, @SupressWarnings e @ManagedBean*.

### Mostrando métodos de uma class que possuem annotation @MyAnno.
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
 
### Exemplos

- #### GenericCreateTableDB - Simula Persistência com Reflection
[/GenericCreateTableDB](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Annotations/src/GenericCreateTableDB) *@Table(nome=X), @Column(nome=X), @Varchar(qut=X)*
- #### ValidarNotNullEMaiorIdade
[/ValidarNotNullEMaiorIdade](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Annotations/src/ValidarNotNullEMaiorIdade) *@NotNull(conteudo=X), @isMaior(idade=Y)*
- #### Autor
[/autor](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Annotations/src/autor) *@autor(nome=X, tempo=Y)*
- #### Annotation: Ordem
[/ordem](https://github.com/adammacias/fatec-si/tree/eclipseprojects/Annotations/src/ordem) *@ordem(numero=X)*

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 13/03</span>


## Padrão de Projeto: (DECORATOR)

### Exercício EmpresaPublica

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

### Solução

<div class="alert alert-danger">Adicionar UML yED do professor </div>

- Branch eclipseProjects: [/DesignPatterns-Decorator](https://github.com/adammacias/fatec-si/tree/eclipseprojects/DesignPatterns-Decorator/src/empresapublicacargos)
- Arquivos: [garcia-13-03-PadraoDecorator.rar]({{ site.production_url }}/media/garcia-13-03-PadraoDecorator.rar) 


***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 20/03</span>

<div class="alert alert-danger">Pegar foto da exemplificação da esplicação com o Felipe (uml do padrão)</div>

## Padrão de Projeto (STRATEGY)
Define uma família de algoritmos, encapsula e os torna intercambiaveis (variáveis).

> ***Principio***: Encapsule o que varia.

### Porque devemos usar?

A forma errada fere a regra de aberto e fechado:

- Dificil de debugar
- Cresce esponencialmente

### Exercício LojaVirtual:

Uma loja virtual prossue alguns produtos a venda. Os produtos são livros, DVDs e brinquedos. Cada produto possui nome e preço. A mesma loja oferece promoções diferentes a cada mês. Uma promoção reguçar desconta cada produto em 10% mais um desconto extra varia de 5% a 10% dependendo do mês. Uma liquidação desnconta 30% ao preço de cada produto. Há meses quenão há promoção descrita.
Esta situação: 

- A) Desenhe o diagrama de classes;
- B) Codifique com base em A).

### Solução 

- Branch eclipseProjects: [/DesignPatterns-Strategy](https://github.com/adammacias/fatec-si/tree/eclipseprojects/DesignPatterns-Strategy/src/lojaVirtualPromocaoGarcia)
- Arquivos: [aula-2015-03-20-garcia.zip]({{ site.production_url }}/media/aula-2015-03-20-garcia.zip) 

<div class="alert alert-danger">Flavia, vc colocou duas vezes a solução do Garcia, faltou a nossa.</div>

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 27/03</span>

## Agregação X Composição

Na **Agregação**, a existência do Objeto-Parte faz sentido, mesmo não existindo o Objeto-Todo. Vejamos o exemplo Time-Atleta:

![Imagem1](http://conteudo.imasters.com.br/18901/fig_02_agregacao.png)

Um time é formado por atletas, ou seja, os atletas são parte integrante de um time, mas os atletas existem independentemente de um time existir. Nesse caso, chamamos esse relacionamento de AGREGAÇÃO.

Já a **Composição** é uma agregação mais forte; nela, a existência do Objeto-Parte NÃO faz sentido se o Objeto-Todo não existir. Vejamos o exemplo Pedido-ItemPedido:

![Imagem2](http://conteudo.imasters.com.br/18901/fig_03_composicao.png)

[Fonte: imasters](http://imasters.com.br/artigo/18901/uml/uml-composicao-x-agregacao/)

## Principio do aberto e fechado
> *Todo código deve ser **aberto** para herança, e **fechado** para modificação.* - Garcia

O princípio Aberto/Fechado poderia ser entendido como uma implementação que permite adicionar novas funcionalidades sem mexer no código existente. Em outras palavras:

> Não precisamos alterar o conteúdo das classes, basta criar novas implementações de interfaces ou sobrescrever os métodos de classes existentes.

[Fonte: Stackoverflow](http://pt.stackoverflow.com/a/15651)

## Padrão de Projeto (CHAIN of Responsibility)

Evita **Acoplamento** (com if) entre o "Sender" de uma requisição Z, o recebedor dando a chance de mais de um objeto efetuar o tratamento. A cadeia de objetos trata a requisição conforme alguma requisição, caso não consiga o próximo elemento fica com a responsabilidade do tratamento.

> Decorator, Chain e Strategy tem polimofismo

### Exercicio AprovacaoDeVerbas

Uma empresa trata aprovação de verbas. Uma verba pode ser Urgente ou normal. Toda verba possui um valor de investimento. O gerente aprova verbas normais ate 80000 unidades de valor e nao aprova verbas importantes. O superintendente aprova o valor. o VP aprova verbas verbas importantes de ate 200000 unidades. O CEO aprova qualquer verba. Eh importante mostrar na tela: Verba de xxxx R$ aprovada por yyyy, cargo zzzzz.
Sendo xxxx o valor a ser aprovado, yyyyy o nome do funcionario e zzzz seu cargo

### Solução

<div class="alert alert-danger">Pendente UML</div>

- Branch eclipseProjects: [/DesignPatterns-ChainOfResponsibility](https://github.com/adammacias/fatec-si/tree/eclipseprojects/DesignPatterns-ChainOfResponsibility/src/VerbaAprovacaoBanco)
- Arquivos: [aula-2015-03-27-garcia.rar]({{ site.production_url }}/media/aula-2015-03-27-garcia.rar) 

## Padrão de Projeto (ADAPTER)

Converte a interface de uma classe em uma ao qual é esperada pelo cliente. O Adapter permite que classe com interfaces incompatíveis trabalhem juntas. 

> Imita o DuckType

### Exercicio PatoAdaptadoPeru

Sabe se que todo Pato voa e grasna. Todo Pato pode ser Negro ou Verde. Um Peru, que não é Pato emite som e não consegue voar. Faça com que Peru e Pato trabalhem sob uma interface comum

### Solução

<div class="alert alert-danger">Pendente UML</div>

- Branch eclipseProjects: [/DesignPatterns-Adapter](https://github.com/adammacias/fatec-si/tree/eclipseprojects/DesignPatterns-Adapter/src/PatoAdaptadoPeru)
- Arquivos: [aula-2015-03-27-garcia.rar]({{ site.production_url }}/media/aula-2015-03-27-garcia.rar) 
