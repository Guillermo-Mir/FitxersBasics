import java.io.File
import kotlin.concurrent.fixedRateTimer


fun main(){
    val carpeta = File("./txtEx2")
    val fitxer = File(carpeta, "arxiuEx2.txt")

    if(!carpeta.exists()) carpeta.mkdirs() /*crear carpeta*/

    if(!fitxer.exists()) fitxer.createNewFile() /*crear fitxer*/

    var acabar: Boolean = false
    do {
        println("Introdueix una frase:")
        val frase: String = readln()
        if (frase == "") {
            acabar = true
        }else if(frase == "@ESBORRA"){
            fitxer.writeText("") /*Borrar text del fitxer*/
            println("Contingut del fitxer esborrat")
        }else{
            fitxer.appendText(frase + "\n")
        }
    }while (!acabar)
}