println("Ingrese las horas trabajadas")
val hora= readInt()
if(hora>40)
{
val he = hora-40
val ss = he*200+40*160
println("salario semanal es"+ ss)
}
else{
val ss = hora*160
}
