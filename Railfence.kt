import javax.swing.JOptionPane

fun cifrar(mensaje:String):String{
    var pasos:Int = 2
    var aux:String = ""

    for(i in 0 until 3){
        if(i % 2 == 0){
            pasos = 4
        }
        else{
            pasos = 2
        }
        for(j in i until mensaje.length step pasos ){
            aux += mensaje[j]
        }

    }

    print(aux)
    return aux
}

fun main(){
    var mensaje:String = ""
    var cifrado:String = ""

    cifrado = cifrar(JOptionPane.showInputDialog( "Introduce el mensaje a cifrar").toString())
    JOptionPane.showMessageDialog(null, "Mensaje cifrado: $cifrado")
}