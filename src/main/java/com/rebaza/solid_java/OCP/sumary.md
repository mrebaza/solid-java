# O: Principio de Abierto/Cerrado (Open/Closed Principle - OCP)
Las entidades de software deben estar abiertas para la extensión, pero cerradas para la modificación.

## Ejemplo 1: Sistema de Notificaciones
❌ Antipatrón (No Abierto/Cerrado)

NotificationService tiene que ser modificado cada vez que se añade un nuevo tipo de notificación (SMS, Push, etc.).

✅ Correcto (Abierto para Extensión, Cerrado para Modificación)

Definimos una interfaz Notification y clases concretas para cada tipo. NotificationSender trabaja con la interfaz.

## Ejemplo 2: Calculadora de Descuentos
❌ Antipatrón (No Abierto/Cerrado)

DiscountCalculator tiene que ser modificado para cada nuevo tipo de descuento.

✅ Correcto (Abierto para Extensión, Cerrado para Modificación)

Usamos el patrón Strategy para aplicar el OCP. Cada tipo de descuento es una estrategia.

