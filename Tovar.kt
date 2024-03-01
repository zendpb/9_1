open class Tovar (var _name:String,var _price:Int, var _edizm:String){

    var name="пятерочка"
    var price=0
    var edizm="штук/кг"


    init {
        edizm=_edizm
        price=_price
        name=_name
    }

  open fun Input(){

        println("Введите название магазина")
        name= readLine()!!.toString()
        println("Введите цену товара")
        price= readLine()!!.toInt()
        println("Введите единицы измерения")
        edizm= readLine()!!.toString()
    }
    open fun punktOP(){
        println("Название магазина: ${name}\nЦена: ${price}")
    }

    open fun Output(){
        println("единицы измерения: ${edizm}")
    }

}