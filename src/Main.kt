import java.io.File
import java.util.Scanner
import kotlin.io.path.*
import java.nio.file.*
import kotlin.io.path.*

   fun main() {
      /*1*/
      val carpeta = File("./txt") /*La carpeta tiene que estar creada ya*/
      val fitxer = File(carpeta, "arxiu.txt")
      var acabar: Boolean = false
      do{
         println("Introdueix una frase:")
         val frase: String = readln()
         if(frase != ""){
            fitxer.writeText(frase +"\n")
         }else{
            acabar =  true
         }
      }while (!acabar)
      /**/

      /*
      print("Introdueix un text pero guardar-lo en un fitxer: ")
      val rutaFitxer: String = "./txt/arxiu.txt"
      println(guardarText(rutaFitxer, "${readln()}\n"))
      println("El text que hi ha guardat al fitxer es:")
      mostrarTextFitxer(rutaFitxer)

       */
   }

   fun guardarText(ruta: String, texto: String){
      var rutaFichero: File = File(ruta)
      rutaFichero.appendText(texto)
      if (texto == "@ESBORRA"){
         rutaFichero.delete()
      }
   }

   fun mostrarTextFitxer(ruta: String){
      var rutaFichero: File = File(ruta)
      rutaFichero.forEachLine { println(it) }
   }
