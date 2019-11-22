    fun main() {
        /*println("Hola")
        println(producto("5", "2"))*/
        // creamos un objeto
        val mouseA = Mouse()
        // asignamos un valor
        mouseA.tipo = "usb"
        // mostramos los datos utilizando toString (solo los del constructor)
        println(mouseA.toString())
        // mostramos una variable del objeto
        println(mouseA.tipo)
        // creamos otro objeto
        val mouseB = Mouse("bluetooth")
        // mostramos utilizando toString
        println(mouseB.toString())
        // creamos un objeto de tipo Computador
        var miComputador = Computer("i5", Mouse())
        // mostramos componentes
        println("${miComputador.cpu} y ${miComputador.raton.tipo}")
        // mostramos utilizando toString
        println(miComputador.toString())
    }
/* Esto es un kotlin */
/*
fun producto(arg1: String, arg2: String): String {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        var resultado = x * y
        return resultado.toString()
    }
    else {
        return "'$arg1' or '$arg2' is not a number"
    }
}*/
