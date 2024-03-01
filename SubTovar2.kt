class Subtrain2(name: String, price:Int, edizm:String, var amount1: Int): Tovar(_name=name,_price=price, _edizm=edizm) {

   override fun Input(){
        println("Введите кол-во")
        amount1= readLine()!!.toInt()
    }


    override fun Output(){
        println("кол-во товара: ${amount1}\n")


    }

}