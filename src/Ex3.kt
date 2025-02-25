import java.io.File

val carpeta = File("./txtEx3")
val fitxer = File(carpeta, "arxiuEx3.txt")

fun main(){
    gestioFitxer()

    gestioMenu()
}

fun gestioMenu(){
    var sortir: Boolean = false
    mostrarMenu()
    do{
        mostrarMenu()
        println("Tria una opcio")
        val opcio: Int = readln().toInt()
        when(opcio){
            1 -> mostrarFitxer()
            2 -> mostrarLiniaFitxer()
            3 -> escriureFitxer()
            4 -> escriureLiniaPrincipiFitxer()
            0 -> sortir = true
        }
    }while (!sortir)
}

fun mostrarMenu (){
    println("1.Mostrar contingut del fitxer")
    println("2.Mostrar una linia concreta del fitxer")
    println("3.Escriure en el fitxer")
    println("4.Escriure una linia al principi del fitxer")
    println("0.Sortir")
}

fun gestioFitxer() {
    if (!carpeta.exists()) carpeta.mkdirs()
    if (!fitxer.exists()) fitxer.createNewFile()
}

fun mostrarFitxer(){
    fitxer.forEachLine { println(it) }
}

fun mostrarLiniaFitxer() {
    println("Introdueix el numero de la linia a mostrar")
    var numLinia: Int = readln().toInt()
    var linia: Int = 1
    /*fitxer.forEachLine { manera poc optima per resoldre
        if(numLinia == linia) println(it)
        linia++
    }
    */
    val linies: List<String> = fitxer.readLines()
    if (linies.size < numLinia) println("El contingut del fitxer es menor a la linia que demanes")
    else println(linies[numLinia - 1])
}


fun escriureFitxer(){
    var acabar: Boolean = false
    do{
        println("Introdueix una frase")
        val frase: String = readln()
        if(frase=="") {
            acabar = true
        }else if( frase == "@ESBORRA"){

        }else{
            fitxer.appendText(frase +"\n")
        }

    }while (!acabar)
}
fun escriureLiniaPrincipiFitxer(){
    val contingut: String = fitxer.readText()

    println("Introdueix una frase")
    val frase: String = readln()
    fitxer.writeText(frase + "\n"+ contingut)
}