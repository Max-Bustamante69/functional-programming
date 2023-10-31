# Programa de Análisis de Datos de Estudiantes

**Descripción:**
Este repositorio contiene un programa Java diseñado para analizar datos de estudiantes a partir de un archivo CSV llamado "student-scores.csv". El objetivo es demostrar conceptos básicos de programación funcional y manejo de archivos en Java.

## Índice
1. [Estructura del Código](#estructura-del-código)
    - [Clase Main](#clase-main)
    - [Clase Estudiante](#clase-estudiante)
2. [Uso del Programa](#uso-del-programa)
3. [Requisitos](#requisitos)
4. [Contribuciones](#contribuciones)

## Estructura del Código

### Clase Main
- La clase `Main` es la clase principal del programa.
- Comienza cargando los datos de los estudiantes desde el archivo CSV y almacenándolos en una lista.
- Luego, realiza una serie de operaciones de procesamiento de datos utilizando programación funcional.

**Métodos de la Clase Main:**
- `cargarArchivo()`: Lee el archivo CSV, procesa los datos y crea objetos `Estudiante` para cada estudiante. Maneja excepciones en caso de errores durante la lectura.
- `totalMujeres()`: Calcula y muestra el número total de estudiantes femeninas.
- `totalHombres()`: Calcula y muestra el número total de estudiantes masculinos.
- `estudiantePromedioMasPorDept()`: Encuentra y muestra los estudiantes con el promedio más alto en cada departamento.
- `estudianteMayorPromedio()`: Encuentra y muestra al estudiante con el promedio más alto en general.
- `promCarrera()`: Calcula y muestra el promedio de puntajes por departamento.

### Clase Estudiante
- La clase `Estudiante` representa un estudiante con atributos como nombre, género, puntajes, etc.
- Proporciona constructores y métodos getter y setter para acceder a los atributos de un estudiante.
- El método `toString()` se sobrescribe para proporcionar una representación de cadena legible de un estudiante.

## Uso del Programa
El programa se ejecuta desde la clase `Main`. Al ejecutarlo, realizará el análisis de los datos del archivo CSV y mostrará resultados en la consola.

## Requisitos
- Este programa está escrito en Java. Debes tener Java instalado en tu sistema.
- Asegúrate de que el archivo CSV "student-scores.csv" esté en el mismo directorio que el programa.

## Contribuciones
Este repositorio está abierto a contribuciones. Si deseas agregar mejoras, corregir errores o expandir las funcionalidades, eres bienvenido a colaborar.

¡Disfruta explorando y aprendiendo sobre programación funcional y análisis de datos de estudiantes con este programa de ejemplo!