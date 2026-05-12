# Tarea Interfaces en Java

## Autor
Erick Patiño

## Materia
Programación Orientada a Objetos

## Descripción
Este deber fue desarrollado en Java.  

El objetivo principal fue comprender cómo las interfaces permiten definir contratos de comportamiento entre diferentes clases y cómo pueden combinarse con herencia para construir sistemas organizados y reutilizables.

El proyecto contiene ejercicios prácticos de nivel medio y avanzado relacionados con sistemas académicos, bancarios y empresariales.

---

# Contenido del Deber

## Ejercicio 1 — Sistema Académico de Documentos

Se implementó una interfaz llamada `Imprimible` para representar documentos académicos que pueden imprimirse.

### Clases desarrolladas
- Certificado
- ActaNotas
- HorarioAcademico

### Características
- Uso de interfaces
- Implementación de métodos con `@Override`
- Encapsulamiento
- Mensajes personalizados por clase

---

## Ejercicio 2 — Sistema Bancario de Pagos

Se desarrolló una interfaz llamada `Pagable` para procesar distintos tipos de pagos.

### Clases desarrolladas
- PagoEfectivo
- PagoTarjeta
- Transferencia

### Características
- Validación de montos
- Diferentes comportamientos según el método de pago
- Uso de polimorfismo
- Validaciones y buenas prácticas

---

## Ejercicio 3 — Sistema de Roles Empresariales

Se desarrolló un sistema empresarial utilizando múltiples interfaces para diferenciar responsabilidades según el rol del empleado.

### Interfaces utilizadas
- Autenticable
- Reportable
- Gestionable

### Clases desarrolladas
- Cajero
- Administrador
- Supervisor

### Características
- Inicio de sesión con validación
- Generación de reportes
- Gestión de datos
- Uso de clase abstracta
- Herencia
- Polimorfismo
- Encapsulamiento

---


