# I: Principio de Segregación de Interfaz (Interface Segregation Principle - ISP)
Los clientes no deben ser forzados a depender de interfaces que no utilizan.

## Ejemplo 1: Trabajadores Multifuncionales
❌ Antipatrón (Interfaz "Gorda")

Employee tiene una interfaz ComplexWorker con métodos que no todos los tipos de empleados necesitan.

✅ Correcto (Interfaces Segregadas)

Dividimos ComplexWorker en interfaces más pequeñas y específicas.


## Ejemplo 2: Máquina Multifunción (Impresora, Escáner, Fax)
❌ Antipatrón (Interfaz "Gorda")

Una interfaz Machine que tiene todos los métodos, forzando a implementaciones más simples a tener métodos vacíos.


✅ Correcto (Interfaces Segregadas)

Dividimos la interfaz Machine en interfaces más pequeñas y específicas para cada función.