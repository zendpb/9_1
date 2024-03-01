class SubTovar (name: String, price:Int, edizm:String, var _vidTovar: String): Tovar(_name=name,_price=price , _edizm=edizm){

    var vidTovar="хлеб"


    init {
        vidTovar=_vidTovar
    }

   override fun Input(){

        println("Введите вид товара")
        vidTovar= readLine()!!.toString()

    }

    override fun Output(){
        println("Название товара: ${name}\nВид товара ${vidTovar}")
        println("Единицы измерения: ${edizm} Цена: ${price}")

    }

}

