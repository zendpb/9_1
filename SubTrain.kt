class SubTrain (number: Int, PunktOtpravl:String, PunktPrib:String, var _color:String): Train(number,PunktOtpravl,PunktPrib){

    var color ="красный"
    var Data="21.01.15"
    var Time ="15:00"
    var TimeInPut=20
    init {
        color=_color
    }

    fun Input(){

        println("Введите дату отправления")
        Data= readLine()!!.toString()
        println("Введите время отправления")
        Time= readLine()!!.toString()
        println("Введите время в пути(в минутах)")
        TimeInPut= readLine()!!.toInt()
    }

override fun Output(){
    println("Номер поезда: ${number}\nПункт отправления: ${PunktOtpravl}\nПункт прибытия ${PunktPrib}")
    println("Дата отправления${Data}\nВремя отправления${Time}\nВремя в пути${TimeInPut}")

}

}

