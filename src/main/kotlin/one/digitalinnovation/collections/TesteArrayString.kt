package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes [0] = "maria"
    nomes [1] = "zamira"
    nomes [2] = "jose"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    val nome2 = arrayOf("maria", "zé","pedro")
    nome2.sort()
    nome2.forEach { println(it) }
}