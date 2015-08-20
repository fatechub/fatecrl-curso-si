---
layout: disciplina
title:  "Tópicos especiais em sistemas para Internet III (Tema: Programação funcional - Haskell)"
sigla: ITE-005
teacher: Garcia
date:   2015-02-01
grade: 2013
ciclo: 6
fatec: fatec-rl
categories: grade-2013 ciclo-6
---

***

## Material, Apostilas e Ferramentas

- [Informações IDEs Haskell](https://wiki.haskell.org/IDEs)
- Compilador GHC (The Gorious Glasgow Haskell Compiler) 7.10.2 - obrigatório
- IDE Eclipse FP (Eclipse for funcional programming) - opcional
- Plugin para *highlightinhg* (Colorer plugin for Eclipse IDE) - opcional
- [tutorialspoint](http://www.tutorialspoint.com/)
- [Compilador de Haskell Online](http://www.tutorialspoint.com/compile_haskell_online.php)
- [http://www.tutorialspoint.com/](http://www.tutorialspoint.com/)
- [haskell-plataform](https://www.haskell.org/platform/) (INSTALADOR WINDOWS)
- [https://github.com/Webschool-io/workshop-js-funcional-free](https://github.com/Webschool-io/workshop-js-funcional-free)

***

## TPs e Provas

### Datas:
- Prova final: 30/11/15 
- Trabalho: 07/12/15  
- Prova substituta: 14/12/15    

### Peso:
- Prova final: 50%
- Trabalho: página web, 30%
- Lista de exercícios e atividades: 20%
- Cálculo da média final: **Mf**=(*A1*+*A2*)/*2*, onde **A1**=(*P1*+*P2*)/*2* e **A2**=(*3T*+*2L*)/*5*

***

## Ementa
Intodução a linguagem Haskell. Operações com listas. List comprehension. Tipos e TypeClasses. Map, Reduce, Fold, e Filter. Pattern Matching e Guards. Recursão e funções de alta ordem. Criando Typeclasses. Estrutura de dados recursivas. I/O. Funtores e Monoids. **Monoids**. Framework para desenvolvimento Web. Conexão com o banco de dados. Deploy de uma aplicação na Web. Testes.

*A partir de Monoids começa a entrada de código impuro na programação Haskell*

***

## Referências
- LIPOVACA, Miran. Learn you a Haskell for a Great good, 2015. (Versão pt: Aprendar Haskell por um bem maior (super didático));
- SINOYMAN, Michael. Developing Web Aplications with Haskell and Yesod;
- Safety-Driven Web Development. Oreilly, 2012;
- O'SULLIVAN, Bryan. Real World Haskell. Oreilly, 2008.

***

## Comandos

### Terminal
- **let**: defini o valor de uma "variável"
- **: (chamado *cons*)**: adiciona o número/caracter na frente do vetor
- **++ (como identação)**: adiciona número/caracter em qualquer lugar do vetor. ```let a=[1,2] | let b=[3,4] | a ++ b  // [1,2,3,4]```
- **' (aspas simples)**: representa string
- **" (aspas duplas)**: representa vetor
- **!!**: deterninar a posição do vertor: ```a!!4 == a[4]```
- **take**: pegar (pega parte do código)
- **drop**: solta (ignora uma parte do código)
- **cycle**: loop infinito (porém, pode ser definido até onde vai com o take: ```take 10 (cycle[1,2,3]) //[1,2,3,1,2,3,1,2,3,1])```
- **reverse**: irá apresentar os resultados ao contrários. Ex.: ```reverse fatec //cetaf```
- **( )**: funciona como o operador matemático. Indica "por onde começar/dar preferencia". ```let y= fatec santos | take 3 (drop 4 y) | take 3 (c santos) | take 3 c santos | //c s``` 
- **$**: dá preferencia para a próxima função. Substitui o uso do *()*


***

## Aulas e Atividades

### Contéudo da Disciplina

#### Definições

Haskell é uma linguagem de **tipagem superforte**.

Haskell é uma linguagem preguiçosa, evita erros de compilação. Exemplo: Se houver pedir mais quantidade do que um vetor tiver ele apresentará até onde houver. Exemplo2: Só irá dazer o loop até onde estiver definido.

**Haskell possui linguagem pura**, totalmente funcional: o que significa que não tem acesso ao "mundo exterior" (banco de dados, arquivo html... nem um simples txt).
No Haskell, até o print é impuro. Então, ele se enquadrará em Monads.

**Código impuro** é todo código que consegue ter acesso a códigos externos ou funções que podem alterar o resultado/comportamento de outra função.

> **MONADS**
Monads are frequently encountered in Haskell: the IO system is constructed using a monad, a special syntax for monads has been provided (do expressions), and the standard libraries contain an entire module dedicated to monads. 

>The Prelude contains a number of classes defining monads are they are used in Haskell. These classes are based on the monad construct in category theory; whilst the category theoretic terminology provides the names for the monadic classes and operations, it is not necessary to delve into abstract mathematics to get an intuitive understanding of how to use the monadic classes. 

>A monad is constructed on top of a polymorphic type such as IO. The monad itself is defined by instance declarations associating the type with the some or all of the monadic classes, Functor, Monad, and MonadPlus. None of the monadic classes are derivable. In addition to IO, two other types in the Prelude are members of the monadic classes: lists ([]) and Maybe.


**Exemplo: código impuro**

{% highlight java %}
class Foo{
  private int a;               
  public int bar(){            
    a++;                        // Função impura: alterou o resultado de uma
    return 0;                   // outra função. Isso não existe em haskell!
  }
  public int baz(int x){        // Nunca irá retornar o mesmo resultado pois
    return x+a;                 // a outra função altera seu resultado
  }
}

class Teste{
  p.s.v.m(...){
    Foo t = new Foo();
    syso(t.baz(3));     // 3
    syso(t.baz());      // 0
    syso(t.baz(3));     // 4
  }
}
{% endhighlight %}

Função `bar` e `baz` sao impuras, na visão do Haskell só é legal quando não tem atributos.

***

**No terminal:**

{% highlight haskell %}
ghci

Prelude> let u = [1,9,9,3,8,2,-7]
Prelude> u 
// [1,9,9,3,8,2,-7]
Prelude> u !!4 
// 8
Prelude> 123:u // (:) => CONS (Tbm funciona com letras)
// [123, 1,9,9,3,8,2,-7]

Prelude> let h = "FATEC"
Prelude> h
// "FATEC"
Prelude> '1':h
// "1FATEC"
Prelude> '2':h
// "2FATEC"

Prelude> let a = "CPS"
Prelude> let b = '1':a
Prelude> b
// "1CPS"
Prelude> '2':b
// "21CPS"

// pra limpar
:q
clear

Prelude> let h = "FATEC"
Prelude> "OI " ++ h
// "OI FATEC"
Prelude> h ++ "OI "
"FATECOI "
Prelude> "OLA PESSOAL DA " ++ b ++ " TUDO BLZ?"
// "OLA PESSOAL DA FATE TUDO BLZ?"

Prelude> let w1 = [1,2,3]
Prelude> let w2 = [4,5,6]
Prelude> w1 ++ w2
// [1,2,3,4,5,6]
Prelude> w2 ++ w1
// [4,5,6,1,2,3]

Prelude> let y = "FATEC SANTOS"
Prelude> y
// "FATEC SANTOS"
Prelude> take 4 y
// "FATE" pega os 4
Prelude> drop 4 y
// "C SANTOS" solta os 4

Prelude> let y = "FATEC SANTOS"
Prelude> drop 4 y
// "C SANTOS"
Prelude> take 3 y
// "FAT"
Prelude> take 3 (drop 4 y) - ou - Prelude> take 3 $ drop 4 y
// "C S"

Prelude> cycle [1,2,3] // loop infinito
// [1,2,3,1,2,3,1,2,3,1,2,3,...]
Prelude> take 145 ( cycle [1,2,3,4] )
// [1,2,3,4....3]

Prelude> [1..5] // FUNCIONA COM 'string' tbm
// [1,2,3,4,5]

Prelude> reverse [1..5] 
// [5,4,3,2,1] 

Prelude> [2*x | x <- [0..50]] // pega pares de 0 a 50  ... "|" é TAL QUE
// [2,4,6...50] 

Prelude> [2*x | x <- [0..50], x > 12] // pega pares de 0 a 50 e que seja maior que 12
// [14,16,18...50] 

Prelude> [2*x | x <- [0..50], x > 12, mod x 5 == 0] // pega pares de 0 a 50 e que seja maior que 12
// [...] 
{% endhighlight %}

{% highlight haskell %}
EXERCICIO O RESULTADO TEM QUE SER [9, 11, 13,15,17,19,21,23,25,27,29,31]
SOLUCAO 1: [2*x+1 | x <- [4..15]] 
SOLUCAO 2: [2*x+1 | x <- [0..50],x > 3, x < 16]
SOLUCAO 3: [x | x <- [9..31], mod x 2 == 1]
{% endhighlight %}

### em http://www.tutorialspoint.com/compile_haskell_online.php
 
{% highlight haskell %}
// PASSO 1
// create file `Aula1.hs` e deleta `main.hs`
Aula1.hs

// PASSO 2
// file Aula.hs e compila
module Aula1 where

dobro x = 2*x

somaquadrado a b = a*a + b*b

meio n1 n2 y = take n1 ( drop n2 y )

// PASSO 2
// no terminal `ghci` e `:l Aula1.hj`

// TESTE DE MESA DA FUNCAO somaQuadrado
somaQuadrado (dobro 1) (dobro 2) = 
somaQuadrado 2 4 = 
somaQuadrado 2 * 2 + 4 * 4 = 
somaQuadrado 4 = 16 = 20

// TESTE DE MESA DA FUNCAO meio
meio n1 n2 y = take n1 ( drop n2 y ) 
meio 3 4 "FATEC SANTOS" = take n1 ( drop n2 y )
take 3 ( drop 4 "FATEC SANTOS" )
take 3 ( "C SANTOS" )
"C S"
{% endhighlight %}

