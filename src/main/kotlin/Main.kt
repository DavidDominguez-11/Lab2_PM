package org.example

fun calculateProduct(numbers: List<Int>): Int {
    return numbers.reduce { acc, num -> acc * num}
}

fun calcularPromedio(numeros: List<Int>): Int {
    return numeros.reduce { acc, num -> acc + num } / numeros.size
}

fun filter(numeros: List<Int>): List<Int> {
    return numeros.filter { it % 2 != 0 }
}

fun isPalindrome(str: String): Boolean = str.toLowerCase() == str.toLowerCase().reversed()

fun agregarSaludos(nombres: List<String>): List<String> {
    return nombres.map { "¡Hola, $it!" }
}

fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapPersonToStudent(persons: List<Person>): List<Student> {
    return persons.map { person -> Student(person.name, person.age, person.gender, "S${person.name.take(3)}${person.age}") }
}

fun printStudents(students: List<Student>) {
    students.forEach { student ->
        println("El Estudiante ${student.name} tiene ${student.age}")
    }
}

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    val prom = calcularPromedio(nums)
    println("El promedio es: $prom")
    println("------------------------------")


    val enteros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val impares = filter(enteros)
    println("Números impares: $impares")
    println("------------------------------")

    val palabra = "oso"
    val isPal = isPalindrome(palabra)
    println(isPal)
    println("------------------------------")

    val nombres = listOf("Bran", "Luis", "Dom")
    val saludos = agregarSaludos(nombres)
    println(saludos)
    println("------------------------------")

    val suma = performOperation(5, 3) { x, y -> x + y }
    val resta = performOperation(10, 4) { x, y -> x - y }
    println("Suma: $suma, Resta: $resta")
    println("------------------------------")

    val persons = listOf(
        Person("Bran", 92, "Masculino"),
        Person("luis", 5, "Masculino"),
        Person("Dom", 32, "Masculino"),
        Person("Anggie", 7, "Femenino")
    )
    val students = mapPersonToStudent(persons)
    printStudents(students)
}
