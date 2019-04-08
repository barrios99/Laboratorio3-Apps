package Modelos

class Nombre(internal var nombre: String){
    fun setNombre(nuevoN: String){
        nombre = nuevoN
    }
    fun getNombre(): String{
        return nombre
    }
}