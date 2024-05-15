package org.example


fun main(args: Array<String>) {
    val p1 = Person7("Takashi",1234)
    val p2 = Person7("Takashi", 1234)
    if(p1.equals(p2)){
        println("same person")
    } else {
        println("different person")
    }

}

class Person7(val name: String, val my_number: Int) {
    override fun equals(other: Any?): Boolean {
        if(other != null &&
            other is Person7 &&
            this.name == other.name &&
            this.my_number == other.my_number){
            return true
        }else {
            return false
        }
    }
}