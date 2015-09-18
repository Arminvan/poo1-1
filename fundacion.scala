println("programa para fundar una empresa")
println("ingrese cantidad de persona 1")
val cp1 = readInt()
println("ingrese cantidad de persona 2")
val cp2 = readInt()
println("ingrese cantidad de persona 3")
val cp3 = readInt()

var ti = (cp1+cp2+cp3)
var pp1 = (cp1*100)/ti
var pp2 = (cp2*100)/ti
var pp3 = (cp3*100)/ti 
println("porcentaje de la primera persona es:")
println(pp1)
println("porcentaje de la segunda persona es:")
println(pp2)
println("porcentaje de la tercera persona es:")
println(pp3)