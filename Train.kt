open class Train (var _number:Int, var _PunktOtpravl:String, var _PunktPrib:String){

    var number=0
    var PunktOtpravl="Неизв"
    var PunktPrib="неизв"

init {
    number=_number
    PunktOtpravl=_PunktOtpravl
    PunktPrib=_PunktPrib
}


open fun punktOP(){
    println("Пункт отправления: ${PunktOtpravl}\nПункт прибытия ${PunktPrib}")
}

   open fun Output(){
        println("Номер поезда ${number}")
    }

}