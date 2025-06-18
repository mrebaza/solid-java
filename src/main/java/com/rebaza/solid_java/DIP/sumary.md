# D: Principio de Inversión de Dependencias (Dependency Inversion Principle - DIP)
Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

## Ejemplo 1: Notificador de Eventos
❌ Antipatrón (Alto Acoplamiento)

EventNotifier (módulo de alto nivel) depende directamente de EmailSender (módulo de bajo nivel concreto).


✅ Correcto (Inversión de Dependencias)

Introducimos una interfaz MessageSender. EventNotifier depende de esta interfaz, y EmailSender la implementa.


## Ejemplo 2: Procesador de Pagos
❌ Antipatrón (Alto Acoplamiento)

PaymentProcessor (módulo de alto nivel) crea y depende directamente de una pasarela de pago específica (StripeGateway).


✅ Correcto (Inversión de Dependencias)

Introducimos una interfaz PaymentGateway. PaymentProcessor depende de esta abstracción.


