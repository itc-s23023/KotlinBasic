package org.example


fun main(args: Array<String>) {
    val getAge = Person6 :: age
    val p1 = Person6("Takeshi",5)
    val p2 = Person6("Kenta",5)
    val p3 = Person6("Mary",23)
    val list = listOf(p1,p2,p3)
    val p_max = list.maxBy(getAge)
    p_max?.greet()
}