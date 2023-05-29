fun main() {
    var ankara = Ankara("Kitenge")
    ankara.designChanges(60,"sad")


}

class Ankara(var  fabric:String){


    fun designChanges(temp:Int,mood:String){
        if(temp <= 50 && mood =="sad"){
            println("Pattern is floral")
        } else{
            println("Pattern is circular")
        }
    }
}

