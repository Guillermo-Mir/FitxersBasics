import java.io.File
import java.util.Scanner
import kotlin.io.path.*

fun main() {

   val ruta = Path("IdeaProjects/FitxersBasics/src/textos.txt")

   do {
      println("Escriu per teclat per guardar les paraules al fitxer ")
      var frase = readln()
      if (frase != " "){
         ruta.writeText("${frase}\n")
      }
   }while (frase != "")
}