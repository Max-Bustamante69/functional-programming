import System.IO

-- Funciones de Primer Orden: Definición de una función de primer orden que toma una función como argumento.
aplicarFuncion :: (a -> b) -> [a] -> [b]
aplicarFuncion f [] = []  -- Caso base: una lista vacía devuelve una lista vacía.
aplicarFuncion f (x:xs) = f x : aplicarFuncion f xs  -- Aplicar la función a cada elemento y construir una nueva lista.

-- Transparencia Referencial: Ejemplo de función pura que garantiza la transparencia referencial.
duplicar :: Int -> Int
duplicar x = x * 2

-- Polimorfismo Parametrico: función 'printTwice'' que hace print dos veces del valor sin Importar el tipo.
printTwice :: Show a => a -> IO ()
printTwice x = do
    putStr (show x)
    putStr " "
    print x



main :: IO ()
main = do
    -- Funciones de Primer Orden: Aplicar la función 'duplicar' usando 'aplicarFuncion'.
    let numeros = [1, 2, 3, 4]
        duplicados = aplicarFuncion duplicar numeros
    print duplicados
    print numeros

    -- Transparencia Referencial: Llamar a la función 'duplicar' es siempre predecible y produce el mismo resultado.
    let numero1 = 42
    let numero2 = duplicar numero1
    let numero3 = duplicar numero1
    let numero4 = duplicar numero1
    print numero1
    print numero2
    print numero3
    print numero4
    print numero1
    

    -- Polimorfismo Paramétrico: La función 'printTwice'' funciona con diferentes tipos de datos.
    let entero = 42
    let cadena = "Hola, Mundo"
    let booleano = True
    printTwice entero
    printTwice cadena
    printTwice booleano
    print entero
    print cadena
    print booleano
