package proyecto1

import java.io.File
import java.io.BufferedReader

fun reader (nombreArchivo: String): Grafo<String>{
    // Crear grafo
    val grafo = ListasAdyacenciaGrafo<String>()
    val file: File = File(nombreArchivo)
    val bufferedReader: BufferedReader = file.bufferedReader()
    var linea = bufferedReader.readLine()
    
    while (linea != null) {
        val partes = linea.split(" ").filter { it.isNotBlank() } // elimina espacios extras
        if (partes.size >= 2) {
            grafo.agregarVertice(partes[0])
            grafo.agregarVertice(partes[1])
            grafo.conectar(partes[0], partes[1])
        }
        linea = bufferedReader.readLine()
    }
    return grafo
}
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Se requieren dos nombres como argumentos")
        return
    }
    var grafo = reader("input.txt")
    
    if (!grafo.contiene(args[0])|| !grafo.contiene(args[1])){
        println(-1)
    }else{
    val hasta = grafo.idDeVertice(args[1])!!
    val bfs = grafo.BFS(args[0])
    val distancia = bfs.distancias
        println(distancia[hasta])
    }
}