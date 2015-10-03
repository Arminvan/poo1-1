var cont = 0
for(a<-1 to 15)
{
println("Cuantos kilos de naranja desea comprar?")
val kilos=readInt()
if(kilos>10)
{
val pagar = kilos*10
val total = pagar-pagar*0.15
println("Total a pagar "+ total)
}
else
{
val total = kilos*10
println("Total a pagar " + total)
cont = cont+total
}
val ganancia = cont
println("Ganancias " + ganancia)
}
