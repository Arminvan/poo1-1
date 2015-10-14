class Multiplicarfraccion(n: Int, d: Int){
val numerador = n
val denominador = d

def multiplicar (b: Multiplicarfraccion ):Multiplicarfraccion = {
new Multiplicarfraccion(numerador*b.numerador,denominador*b.denominador)

}
}

println("Ingresa el numerador de la primera fraccion: ")
val n1 = readInt()
println("Ingresa el denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Multiplicarfraccion(n1, d1)

println("Ingrese el numerador de la primera fraccion: ")
val n2 = readInt()
println("Ingrese el denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Multiplicarfraccion(n2, d2)

val multiplicacion = fraccion1.multiplicar(fraccion2)

println(multiplicacion.numerador + "/" + multiplicacion.denominador)
