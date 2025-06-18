# L: Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP)
Las subclases deben ser sustituibles por sus clases padre sin romper el programa.

## Ejemplo 1: Procesamiento de Archivos
❌ Antipatrón (Violación del LSP)

ReadOnlyFile hereda de File pero no puede realizar la operación write(), rompiendo la expectativa del cliente.

✅ Correcto (Adherencia al LSP)

Separamos las interfaces de lectura y escritura. Cada clase implementa solo las interfaces que le corresponden.


## Ejemplo 2: Aves (del clásico ejemplo de "Pájaro que vuela")
❌ Antipatrón (Violación del LSP)

La clase Penguin hereda de Bird pero anula el método fly() de una manera que rompe la expectativa de que "un pájaro puede volar".

✅ Correcto (Adherencia al LSP)

Separamos la capacidad de volar en una interfaz. Las aves que pueden volar la implementan.

