class Subtrain2(number: Int, PunktOtpravl:String, PunktPrib:String, var tip:String): Train(number,PunktOtpravl,PunktPrib) {

    fun Input(){
        println("Введите тип поезда")
        tip= readLine()!!.toString()
    }


}