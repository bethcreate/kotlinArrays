import java.util.*

fun main () {
companies()

    numbers()
    fruits()
}

fun companies() {
var namesArray= arrayOf("Amazon", "Google", "Samsung", "Twitter", "Facebook")
    var sortedCompanies= namesArray.sortedArray()
    println(Arrays.toString(sortedCompanies))


}
fun numbers() {
    var numArray= arrayOf(273,10,56,4,3,157)
    var sortedNumbers= numArray.sortedArray()
    println(Arrays.toString(sortedNumbers))

}
fun fruits() {
    var fruitsArrays= arrayOf("Mango", "pawpaw", "Grapes", "Avoccado")
    println(fruitsArrays[0])
    println(fruitsArrays[1])
    println(fruitsArrays[2])
    println(fruitsArrays[3])
}