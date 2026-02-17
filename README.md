# Proyecto 1: Grados de Separación

## Estudiante
Cristina Puyosa – Carnet: 23-10395

## Descripción
Este proyecto implementa un programa en Kotlin que calcula los **grados de separación** entre dos personas a partir de un archivo de relaciones de amistad (`input.txt`). El grafo representa personas como vértices y amistades como aristas. La implementación asegura que se encuentre **el grado de separación mínimo** utilizando un algoritmo de búsqueda en anchura (BFS).

---

## Modificaciones al Proyecto 1
1. Se adaptó la función `conectar` para que el grafo sea **no dirigido**, reflejando la simetría de la amistad:  
   - Si `A` es amigo de `B`, entonces `B` también es amigo de `A`.
2. Se agregó y modificó BFS para:
   - Devolver tanto el **arreglo de predecesores** como la **distancia mínima** desde un vértice origen a todos los demás.
3. Se creó la función `idDeVertice` para exponer el mapeo interno de vértices y simplificar el acceso a sus índices.
4. Se implementó la función `reader` para leer el archivo `input.txt` y construir el grafo automáticamente.

---

## Complejidad de ejecución
- **`agregarVertice(v)`**:  
  Inserta un vértice en el mapa y lista interna.  
  **Complejidad:** O(1) promedio.

- **`conectar(desde, hasta)`**:  
  Agrega la arista en ambos sentidos para grafo no dirigido.  
  **Complejidad:** O(1) promedio.

- **`BFS(v)`**:  
  Recorre todos los vértices alcanzables desde `v` usando cola.  
  **Complejidad:** O(V + E), donde V es el número de vértices y E el número de aristas.

- **`reader(nombreArchivo)`**:  
  Lee todas las líneas del archivo y agrega vértices y aristas al grafo.  
  **Complejidad:** O(L), siendo L el número de líneas (amistades) en el archivo.

- **`main(args)`**:  
  Llama a `reader`, `BFS`, y obtiene la distancia mínima.  
  **Complejidad total:** O(L + V + E).

---

## Uso

### Compilación
```bash
kotlinc *.kt -include-runtime -d DegreesOfSeparation.jar
```

## Ejecución

```bash
java -jar DegreesOfSeparation.jar <Nombre1> <Nombre2>
```
