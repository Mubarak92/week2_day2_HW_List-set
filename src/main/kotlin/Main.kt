import java.io.File

fun main() {

    val City = mutableListOf("Riyadh", "Dammam", "Abha")
    // list has been created
    City.add("Makkah")
    City.add("Jeddah")
    // here we added 2 city
    // we also can use City.addAll()
    println(City)
    City[City.size - 1] = "Wadi ad-Dawasir"
    // here we changed last element in a list

//City.removeAt(City.size-1)
    println(City)
    City.forEachIndexed { index, name ->
        println("$index- $name")
    }


//=================================================================

    val num = mutableListOf(2, 7, 6, 8, 3)
    num[2] = 12 //Index 2
    println(num)
    num.remove(12) //removed element 12
    println(num)

    //=================================================================
    val names = File("ReadFile/File_to_read.txt")
        .readText()
        .split("\n")
    names.forEachIndexed { index, data ->
        println("$index : $data")
    }


//=================================================================

    val numbers = listOf(37,77,29,7,23,64,24,77,92,17)
    val max = numbers.maxOrNull() ?: 0
    println(max)

}