# S: Principio de Responsabilidad Única (Single Responsibility Principle - SRP)
Una clase debe tener una y solo una razón para cambiar.

## Ejemplo 1: Gestión de Pedidos
❌ Antipatrón (Clase con Múltiples Responsabilidades)

Order maneja la información del pedido y también la lógica para guardarlo en la base de datos y generar reportes.

✅ Correcto (Clases con Responsabilidad Única)

Separamos las responsabilidades en clases dedicadas: Order para los datos, OrderRepository para la persistencia y InvoiceGenerator para los reportes.


## Ejemplo 2: Perfil de Usuario
❌ Antipatrón (Clase con Múltiples Responsabilidades)

UserProfile maneja los datos del usuario, la validación de sus datos y también el envío de correos electrónicos.

✅ Correcto (Clases con Responsabilidad Única)

Separamos las preocupaciones: UserProfile para los datos, UserValidator para la validación y EmailService para el envío de correos.