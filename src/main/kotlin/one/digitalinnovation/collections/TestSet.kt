package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joão", 2000.0, "clt")
    val pedro = Funcionario("pedro", 1500.0, "pj")
    val maria = Funcionario("maria", 4000.0, "clt")

    val funcionario1 = setOf(joao,pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("------------")
    val funcionario3 = setOf(joao,pedro,maria)
    val resultSibtract = funcionario3.subtract(funcionario2)
    resultSibtract.forEach { println(it) }

    println("------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }

}