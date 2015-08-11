---
layout: disciplina
title:  "Tópicos especiais em sistemas para Internet III (Tema: Programação funcional)"
sigla: ITE-005
teacher: Garcia
date:   2015-01-01
grade: 2013
ciclo: 6
fatec: fatec-rl
categories: grade-2013 ciclo-6
---

***

## Material, Apostilas e Ferramentas

- [tutorialspoint](http://www.tutorialspoint.com/)
- [Compilador de Haskell Online](http://www.tutorialspoint.com/compile_haskell_online.php)
- http://www.tutorialspoint.com/
- [haskell-plataform](https://www.haskell.org/platform/) (INSTALADOR WINDOWS)
- https://github.com/Webschool-io/workshop-js-funcional-free

***

## TPs e Provas
- ...

***

## Aulas e Atividades

### Contéudo da Disciplina
...

### Função impuras

São funções que depende do "mundo exterior", ou seja, BD, HTML e etc.

> Monads - PENDENTE - Códigos impuros

**Exemplo**

{% highlight java %}
class Foo{
  private int a;
  public int bar(){
    a++;
    return 0;
  }
  public int baz(int x){
    return x+a;
  }
}

class Teste{
  p.s.v.m(...){
    Foo t = new Foo();
    syso(t.baz(3)); // 3
    syso(t.baz()); // 0
    syso(t.baz(3)); // 4
  }
}
{% endhighlight %}

Função `bar` e `baz` sao impuras, na visão do Haskell só é legal quando não tem atributos.

***

{% highlight haskell %}
ghci

... terminal 

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

## em http://www.tutorialspoint.com/compile_haskell_online.php

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

