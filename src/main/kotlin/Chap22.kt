package org.example

fun main(args: Array<String>) {
    try {
        val number:Int = args[0].toInt()
        println("number = ${number}")
    } catch (e: NumberFormatException) {
        throw e
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("write number")
    } catch (e: Exception) {
        println("想定外のエラーです")
    } finally {
        println("Thank you")
    }
}