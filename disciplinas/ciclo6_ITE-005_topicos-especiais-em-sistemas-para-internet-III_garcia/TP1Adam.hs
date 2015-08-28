-- Nome: Adam Requena Macias - RA: 1310081-8 
-- Curso: SI

{-# LANGUAGE FlexibleContexts #-}

module TP1Adam where

----------------------------------------------------
-- Exercício 1.11 Faça uma função que recebe três strings x, y e z como parâmetro. A função retorna uma tupla com três coordenadas contendo a ordem reversa em cada. A primeira coordenada deve conter string reversa do primeiro parâmetro e assim por diante.
----------------------------------------------------

foo :: String -> String -> String -> (String, String, String)
foo x y z = (reverse x, reverse y, reverse z)  

----------------------------------------------------
-- Exercício 1.12 Gere as listas abaixo usando list compreenshions
----------------------------------------------------

-- [1,10,19,28,37,46,55,64]
-- [x | x <- [1..64], mod x 9 == 1]

-- [2,4,8,10,12,16,18,22,24,28,30]
-- [x | x <- [2..30], mod x 2 == 0, notElem x [6,14,20,26]]

-- ["@","A","C","D","E","G","J","L"]
-- [[x] | x <- ['@'..'L'], notElem x ['B','F','H', 'I','K']]
 
----------------------------------------------------
-- Exercício 1.13 Faça uma função, chamada revNum, que receba uma String s e um Int n. Esta deverá retornar as n primeiras letras em ordem reversa e o restante em sua ordem normal. Exemplo: revNum 4 "FATEC" = "ETAFC"
----------------------------------------------------

revNum :: Int -> String -> String
revNum n s = reverse(take n s) ++ drop n s
 
----------------------------------------------------
-- Exercício 1.14 Crie o tipo de dado Binario que pode ser Zero ou Um. Crie também o tipo de dado Funcao que pode ser Soma2, Maior, Menor e Mult2. Faça a função aplicar que recebe uma Funcao e dois Binarios seu retorno consiste em executar a operação desejada.  Exemplo: aplicar Soma2 Um Um = Zero
----------------------------------------------------

data Binario = Zero | Um deriving (Eq, Show)
data Funcao = Soma2 | Maior | Menor | Mult2 deriving Show

aplicar :: Funcao -> Binario -> Binario -> Binario
aplicar Soma2 Um Zero = Um
aplicar Soma2 Zero Um = Um
aplicar Maior Um Um = Um
aplicar Maior Um Zero = Um
aplicar Maior Zero Um = Um
aplicar Menor Um Um = Um
aplicar _ _ _ = Zero

----------------------------------------------------
-- Exercício 1.15 Faça uma função, chamada binList, usando list compreeshion que recebe uma lista de Binarios (ver exercício acima) e retorna outra lista com elemento somado Um e convertido para Int. binList [Um, Zero, Zero, Um, Zero] = [0, 1, 1, 0, 1] 
----------------------------------------------------
 
binList :: Eq Binario => [Binario] -> [Int]
binList xs = [ if (aplicar Soma2 x Um == Um) then 1 else 0 | x<-xs ]
