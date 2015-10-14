class Dividirfraccion(n: Int, d: Int){
val numerador = n
val denominador = d

def dividir (b: Dividirfraccion ):  Dividirfraccion = {
new Dividirfraccion(numerador*b.denominador,denominador*b.numerador)

}
}

println("Ingresa el numerador de la primera fraccion: ")
val n1 = readInt()
println("Ingresa el denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Dividirfraccion(n1, d1)

println("Ingrese el numerador de la primera fraccion: ")
val n2 = readInt()
println("Ingrese el denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Dividirfraccion(n2, d2)

val dividir = fraccion1.dividir(fraccion2)

println(dividir.numerador + "/" + dividir.denominador)
