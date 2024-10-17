package Week2

open class employe (val name : String){
    fun sayHelo(name: String){
        println("hello $name myname is ${this.name}")
    }
}

class manager (name: String) : employe(name)

class member (name: String) : employe(name)


