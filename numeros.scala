println("Leer 20 numeros positivos y negativos")
val i = Int
for(i <-1 to 20 )
{
println("ingrese un numero")
val num = readInt()
var n = num
 if(n > 0){
 println("numeros positivos")
 }
 if(n < 0){
 println("numeros negativos")
 }
 if(n == 0){
 println("numeros neutros")
 }
}
