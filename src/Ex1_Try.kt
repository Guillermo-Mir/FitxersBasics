import java.io.File
import java.io.FileNotFoundException


fun main(){
    val carpeta = File("./txt") /*La carpeta tiene que estar creada ya*/
    val fitxer = File(carpeta, "arxiu.txt")
    var acabar: Boolean = false
    do {
        println("Introdueix una frase:")
        val frase: String = readln()
        if (frase != ""){
            try{ /*El try sirve por si no existe el fichero no peta*/
                fitxer.appendText(frase + "\n")
            }catch (e: FileNotFoundException){
                println(e.message)
                acabar = true
            }
        }else{
            acabar = true
        }
    }while (!acabar)
}