fun main(args: Array<String>) {
    val box1 = Box<String>()
    val box2 = Box<Int>()
    box1.setValue("Strings","aiueo")
    box2.setValue("kakikukehoo",1000)
    box1.printValue()
    box2.printValue()
}

class Box<T> {
    var label: String = ""
    var content: T? = null
    fun setValue(label: String, content: T) {
        this.label = label
        this.content = content
    }
    fun printValue() {
        println("${label}: ${content}")
    }
}