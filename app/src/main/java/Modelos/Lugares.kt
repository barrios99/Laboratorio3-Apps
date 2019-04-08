package Modelos

class Lugares{
    private lateinit var lugar:String
    fun Lugares(lu:String){
        lugar = lu
    }

    fun getlugar():String?{
        if (lugar == "Antigua"){
            return "Antigua"
        }
        if(lugar == "Esquipulas"){
            return "Esquipulas"
        }
        if(lugar == "Semuc"){
            return "Semuc"
        }
        return null
    }

    fun getInfo():String?{

        if (lugar == "Antigua") {
            return "Antigua Guatemala " +
                    "\n Es una ciudad en las montañas centrales de Guatemala, junto a los volcanes Agua y Fuego que la rodean." +
                    "\n Aún conserva edificaciones del siglo XVI y puede ser recorrida a pie a través de sus ancestrales calles empedradas; tercera fundación de la Ciudad de Guatemala, fue fundada el 10 de marzo de 1543 con el nombre original de Santiago de los Caballeros de Guatemala." +
                    "\n Hoy en día Antigua es un patrimonio cultural de la humanidad." +
                    "\n Algunas de sus principales ruinas y atractivos turísticos son: Iglesia y Convento de Capuchinas, Ruinas de San José el Viejo, Museo de Armas Antiguas, Ermita de la Santa Cruz, Arco de Santa Catalina, entre otros."
        }
        if (lugar == "Esquipulas"){
            return "Esquipulas" +
                "\n Esquipulas es uno de los 340 municipios de la República de Guatemala y es parte del departamento de Chiquimula." +
                "\n Como parte de la doctrina que traían los conquistadores españoles, a partir de 1526 se impuso la religión católica a todo poblador de esta localidad y se construyó una ermita y un convento en un cerro cercano a la villa. " +
                "\n En 1594, los pobladores de la villa pidieron al escultor de origen portugués Quirio Cataño, que esculpiera un cristo crucificado de color de tez morena. El escultor portugués, quien residía en Santiago de los Caballeros de Guatemala, entregó el Cristo Negro el 4 de octubre de 1594, según se había establecido en el contrato inicial. " +
                "\n La imagen fue recogida por los habitantes de Esquipulas y llevada hasta su pequeño pueblo llegando el 9 de marzo de 1595. Los pobladores de esa época llamaban «milagrosa» a la escultura, lo cual llamó la atención de las poblaciones católicas aledañas. Para 1650 la villa era uno de los sitios católicos más importantes de la capitanía general ya que era visitada por personas provenientes de las provincias de El Salvador y Comayagua. " +
                "\n En 1680, inició la construcción de la Parroquia Santiago, la cual fue finalizada en 1682, año en que se trasladó la escultura del Cristo Negro desde la ermita."
        }
        if (lugar == "Semuc") {
            return "Semuc Champey" +
            "\n El Parque Nacional Semuc Champey es un paraíso natural que se encuentra localizado en Cobán, Alta Verapaz, muy próximo geográficamente al Parque Nacional Grutas de Lanquín. " +
                    "\n Forma parte  del Sistema Guatemalteco de Áreas Protegidas —SIGAP—  y se constituye como un importante destino dentro de los sitios turísticos que Guatemala ofrece al mundo. " +
                    "\n En idioma q’eqchi’ significa “donde el río se esconde“, debido a que en uno de los extremos se puede observar cómo el caudaloso río Cahabón se interna en un caverna de piedra caliza, en donde pasa por debajo de las pozas. " +
                    "\n Ocupa, como una especie de puente natural, alrededor de 300 metros de largo en los que hay lagunas con profundidades de uno hasta cuatro metros. Por debajo del mismo corre el Río Cahabón y al final de su trayecto, el agua de las lagunas cae formando una catarata de 40 metros de altura."
        }
        return null
    }
}