package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joão", 2000.0, "clt")
    val pedro = Funcionario("pedro", 1500.0, "pj")
    val maria = Funcionario("maria", 4000.0, "clt")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("---------------------")
    repositorio.findAll().forEach{ funcionario -> println(funcionario) }

    println("---------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ funcionario -> println(funcionario) }
}