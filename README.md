# Java Date CLI Formatter 📅

Un pequeño programa en Java que permite formatear y mostrar fechas en español a través de la línea de comandos. El programa detecta automáticamente cuántos argumentos recibe para determinar si debe mostrar la fecha actual o una fecha específica.

## 🚀 Funcionalidades

El programa es flexible y ajusta su lógica según la entrada del usuario:

- **Sin argumentos:** Muestra la fecha actual del sistema.
- **1 argumento (`día`):** Muestra el día indicado para el mes y año actuales.
- **2 argumentos (`día` `mes`):** Muestra la fecha indicada para el año actual.
- **3 argumentos (`día` `mes` `año`):** Muestra la fecha completa especificada.

## 🛠️ Cómo compilar y ejecutar

Asegúrate de tener instalado el JDK (Java Development Kit) en tu equipo.

**1. Compilar el código:**

```bash
javac Main.java
```

**2. Ejecutar el programa:**

| Caso de uso       | Comando                | Ejemplo de salida                     |
| ----------------- | ---------------------- | ------------------------------------- |
| Fecha actual      | `java Main`            | Hoy es Lunes 24 de Marzo de 2026      |
| Un día específico | `java Main 15`         | Hoy es Domingo 15 de Marzo de 2026    |
| Día y mes         | `java Main 24 12`      | Hoy es Jueves 24 de Diciembre de 2026 |
| Fecha completa    | `java Main 12 10 1492` | Hoy es Viernes 12 de Octubre de 1492  |

## 📋 Ejemplo Detallado

Si ejecutamos el comando pasando el día, el mes y el año:

```bash
java Main 20 7 1969
```

La terminal imprimirá:

```
Hoy es Domingo 20 de Julio de 1969
```

## ⚠️ Consideraciones Técnicas

### Métodos Obsoletos (Deprecated)

Este programa utiliza la clase `java.util.Date` y sus métodos `getYear()`, `getMonth()`, etc. Es importante notar que:

- **Años:** La clase `Date` cuenta los años desde 1900. Por eso, el código resta `1900` al recibir un año y suma `1900` al mostrarlo.
- **Meses:** Los meses en Java `Date` empiezan en 0 (Enero es 0, Diciembre es 11). El código ajusta las entradas del usuario restando `1`.

### Mejoras Futuras

Para proyectos modernos de Java (versión 8 en adelante), se recomienda migrar este código a la API `java.time` (clase `LocalDate`), que evita el uso de métodos obsoletos y ofrece un manejo de fechas mucho más intuitivo.

---

_Desarrollado como ejercicio de manipulación de fechas y argumentos en Java._
