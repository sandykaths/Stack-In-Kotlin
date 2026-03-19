# Stack-In-Kotlin
Este es un proyecto hecho en lenguaje Kotlin donde se implementan la estructura de datos Pila (Stack) y sus principales métodos: push, peak, pop y isEmpty
## Descripción
- **Clase Node<T>:** nodo que contiene el valor T y sera usado en la pila
- **Clase Stack:** clase pila la cual tiene como atributo una sola variable de tipo Node y los metodos:
~ **push(value: T):** Agrega un elemento a la pila.
~ **pop(): T?:** Elimina y retorna el elemento superior de la pila, en caso de estar vacia devuelve null.
~ **peek(): T?:** Retorna el elemento superior sin eliminarlo, en caso de estar vacia devuelve null.
~ **isEmpty():** Boolean: Verifica si la pila está vacía.
- **Clase Main:** donde se prueba cada metodo de la pila y posibles resultado de los mismos.
## Requisitos para la ejecución
- Kotlin (instalado en el sistema, con la ruta del bin en el Path de variables de entorno)
- Java JDK (para ejecutar Kotlin)
- VS Code con las extensión Kotlin language (by mathiasfeohlich), kotlin formater (by esafirm) y Code Runner (by Jun Han)
## Instalación de Kotlin
**Instalación en macOS**
1. Verificar Homebrew brew --version
   Si no está instalado: /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
2. Instalar Kotlin brew install kotlin
3. Verificar instalación kotlin -version kotlinc -version

**Instalación en Windows**
1. Instalar Kotlin:
   - Descargar el compilador desde https://github.com/jetbrains/kotlin/releases, en la sección **Assets** descargar el archivo **kotlin-compiler-2.3.20.zip**
   - Crear una nueva carpeta con ruta **C:\Kotlin** y extraer los archivos que están dentro de kotlinc de la carpeta .zip descargada anteriormente.
   -  Ir a las variables de entorno del sistema y agregar C:\Kotlin\bin al PATH del sistema.
2. Verificar la correcta instalación:
   Abrir PowerShell o CMD y ejecutar: kotlinc -version
##Generar archivo JAR y ejecutar el proyecto
  1. **En VS CODE:** Verificar que estén instaladas las extensiones **Kotlin language (by mathiasfeohlich)**, **kotlin formater (by esafirm)** y **Code Runner (by Jun Han)**
  2.  **Compilar:** Desde la carpeta raíz del proyecto ejecutar en la terminal: **kotlinc src -include-runtime -d Proyect.jar**. Esto creará un archivo JAR:
     **src** → carpeta con los archivos .kt
     **-include-runtime** → incluye la librería estándar de Kotlin
     **-d Proyect.jar** → creará un archivo llamado **Proyect.jar** que contendrá todo el proyecto compilado
  4. **Ejecutar:** **java -jar Proyect.jar**
