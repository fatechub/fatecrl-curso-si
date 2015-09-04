-- Nome: Adam Requena Macias - RA: 1310081-8
-- Nome: Ramon Duran         - RA: 1310113-6
-- Curso: SI

module TP2Adam where

----------------------------------------------------
-- Exercício 2.7 Tendo como base o exercício de conversão de medidas dado em aula, crie uma função que faça conversão de câmbio. Você deve criar o tipo Cambio contendo os value constructors Euro, Real e Dollar. Crie também o tipo Moeda que possui os campos (val :: Double) e (cur :: Cambio). Use record syntax e as taxas de conversão do dia ao qual você fez o exercício (especifique o dia por comentário).
--
-- Dia 29/08 às 21:20 ( R$ 3,585 Dolar  &&  R$ 4,007 Euro )
----------------------------------------------------
data Cambio = Euro | Real | Dolar deriving Show
data Moeda = Moeda { val :: Double, cur :: Cambio } deriving Show

converterMoeda :: Moeda -> Cambio -> Moeda
converterMoeda (Moeda x Real) Real = Moeda (x*1.00) Real
converterMoeda (Moeda x Real) Dolar = Moeda (x*0.28) Dolar
converterMoeda (Moeda x Real) Euro = Moeda (x*0.25) Euro

converterMoeda (Moeda x Dolar) Dolar = Moeda (x*1.00) Dolar
converterMoeda (Moeda x Dolar) Real = Moeda (x*3.58) Real
converterMoeda (Moeda x Dolar) Euro = Moeda (x*0.89) Euro

converterMoeda (Moeda x Euro) Euro = Moeda (x*1.00) Euro
converterMoeda (Moeda x Euro) Dolar = Moeda (x*1.12) Dolar
converterMoeda (Moeda x Euro) Real = Moeda (x*4.01) Real

-- converterMoeda (Moeda 1 Real) Dolar

----------------------------------------------------
-- Exercício 2.8 Crie a função converterTodosReal que recebe uma lista de Moedas e retorna outra lista de Moedas com todos os seus elementos convertidos para Real. Use list compreenshion.
----------------------------------------------------
converterTodosReal :: [Moeda] -> [Moeda]
converterTodosReal xs = [ converterMoeda (x) Real | x<-xs ]

-- converterTodosReal [Moeda 1.0 Dolar, Moeda 1.0 Euro, Moeda 1.0 Real]

----------------------------------------------------
-- Exercício 2.9 Crie a função maxMoeda que recebe uma lista de Moedas e retorna o valor máximo absoluto(sem conversão alguma) dentre os campos val desta lista. Exemplo, maxMoeda [Moeda 3 Real , Moeda 7 Dollar , Moeda 2 Euro] = 7.  OBS: Use a função maximum.
----------------------------------------------------
maxMoeda :: [Moeda] -> Double
maxMoeda xs = maximum[ val x | x<-xs]

-- maxMoeda [Moeda 3 Real, Moeda 7 Dolar, Moeda 2 Euro]
