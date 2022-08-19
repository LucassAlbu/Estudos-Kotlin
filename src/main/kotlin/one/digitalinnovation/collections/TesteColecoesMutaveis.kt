package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joão", 2000.0, "clt")
    val pedro = Funcionario("pedro", 1500.0,"pj")
    val maria = Funcionario("maria", 4000.0, "clt")

    println("----list------")
    val funcionarios =  mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("----------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------set----")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("----------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

}