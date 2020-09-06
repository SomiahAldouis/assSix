fun main(){

}
interface UserInteractions{
    fun click()
    fun drag()

}

interface ClickType: UserInteractions{
    fun longClick()
    fun rightClick()
    fun doubleClick()
}

open class Employee(name:String,age:Int,salary:Double){
    var name=""
    var age=0

}

class WebDeveloper(webDevName: String, webDevSalary: Double, webDevAge: Int)
                    :Employee(webDevName,webDevAge,webDevSalary){
    fun website(){}
}

class AndroidDeveloper(webDevName: String, webDevSalary: Double, webDevAge: Int)
                    :Employee(webDevName,webDevAge,webDevSalary),ClickType{
    fun android(){}
    override fun longClick() {

    }

    override fun rightClick() {

    }

    override fun doubleClick() {

    }

    override fun click() {

    }

    override fun drag() {

    }
}

class IosDeveloper(webDevName: String, webDevSalary: Double, webDevAge: Int)
                    :Employee(webDevName,webDevAge,webDevSalary){
    fun iosApp(){}
}