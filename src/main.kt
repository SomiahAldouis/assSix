fun main(){

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
                    :Employee(webDevName,webDevAge,webDevSalary){
    fun android(){}
}

class IosDeveloper(webDevName: String, webDevSalary: Double, webDevAge: Int)
                    :Employee(webDevName,webDevAge,webDevSalary){
    fun iosApp(){}
}