# Análisis de Calidad de Software

## Objetivo
Evaluar y mejorar la calidad de un fragmento de código Java mediante el análisis de buenas prácticas de desarrollo, identificando problemas, proponiendo soluciones y aplicando las correcciones correspondientes.

---

## Fragmento Original Evaluado

El código original se encuentra en el archivo [`UserManagerOriginal.java`](./UserManagerOriginal.java).

---

## Problemas de Calidad Identificados

A continuación, se documentan al menos cinco problemas relevantes presentes en el código original:

### 1. **Nombres crípticos y poco descriptivos**
- **Descripción**: El método `a()` y `p()` junto a la variable `u` no describen claramente su propósito.
- **Impacto en la calidad**: Reduce la legibilidad, dificulta el mantenimiento y la colaboración entre desarrolladores.
- **Solución propuesta**: Renombrar `a` por `addUser`, `p` por `listUsers`, y `u` por `username`.

---

### 2. **Campos estáticos y públicos**
- **Descripción**: `users` y `userCount` son públicos y estáticos, exponiendo el estado interno de la clase.
- **Impacto en la calidad**: Se pierde encapsulamiento, lo que puede generar inconsistencias y errores si otras clases modifican estos campos directamente.
- **Solución propuesta**: Hacerlos privados y no estáticos. Utilizar una estructura más flexible como `List<String>`.

---

### 3. **Números mágicos**
- **Descripción**: El valor `10` aparece codificado directamente en múltiples partes del código.
- **Impacto en la calidad**: Dificulta la modificación del límite de usuarios y disminuye la claridad.
- **Solución propuesta**: Declarar una constante `MAX_USERS` con valor 10.

---

### 4. **Lógica de negocio mezclada con impresión en consola**
- **Descripción**: El método `a()` imprime mensajes con `System.out.println`.
- **Impacto en la calidad**: Acopla la lógica de negocio a una salida específica, impide reutilización y pruebas unitarias efectivas.
- **Solución propuesta**: Separar la lógica de presentación utilizando un sistema de logging (`Logger`) o retornando información útil.

---

### 5. **Falta de validaciones completas**
- **Descripción**: El código no previene usuarios duplicados y los errores no se gestionan adecuadamente.
- **Impacto en la calidad**: Riesgo de datos inconsistentes, errores silenciosos y difícil depuración.
- **Solución propuesta**: Validar duplicados y lanzar excepciones específicas como `IllegalArgumentException` y `IllegalStateException`.

---

## Código Reescrito con Mejoras

La versión corregida del código se encuentra en el archivo [`UserManagerCorrected.java`](./UserManagerCorrected.java). Esta versión:
- Implementa buenas prácticas de encapsulamiento y nombres claros.
- Utiliza listas dinámicas y manejo de excepciones.
- Emplea documentación Javadoc y separación de responsabilidades.

---

## Conclusión

Este ejercicio permite identificar la importancia de:
- Escribir código claro y mantenible.
- Encapsular el estado y separar responsabilidades.
- Validar correctamente los datos de entrada.
- Aplicar estándares de codificación y diseño orientado a objetos.

Una buena calidad del software mejora su comprensión, reutilización y sostenibilidad en el tiempo.

---

## Autores

**Nombre:** Samuel Andres Torres Romero
**Curso:** Análisis y Desarrollo de Software  

