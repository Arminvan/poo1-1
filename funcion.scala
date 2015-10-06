def  Calificaciones () {
println ("******* Programa de calificaciones ******")

println("Ingrese la calificacion del alumno")
val c1 = readFloat()
println("Ingresa tu segunda calificacion")
val c2 = readFloat()
println("Ingresa tu tercera calificacion")
val c3 = readFloat()
println("Ingresa tu calificacion final del examen")
val ef = readFloat()
println("Ingresa tu calificacion del trabajo final")
val tf = readFloat()
var prom = (c1+c2+c3)/3
var ppar= prom*.55
var pef = ef*.30
var ptf=tf*.15
var cf = ppar+pef+ptf
println("tu calificaion final es ")
println(cf)

}
def  hospital () {
println ("**** Programa de un hospital ****")

println ("Ingrese el presupuesto Mensual")
var  pre = readFloat ()
println("presupuesto para GINECOLOGIA")
println(pre*0.40)

println("presupuesto para TRAUMATOLOGIA")
println(pre*0.30)

println("presupuesto para PEDIATRIA")
println(pre*0.30)

}

def  Empresa () {
println ("**** Programa de una empresa ****")

println("costo de la pieza a comprar")
val costop= readInt()
println("numero de piezas a comprar")
val nump= readInt()
val totalcomp=costop*nump
println("Total de la compra  "+totalcomp)

if(totalcomp>500000)
{
var invprop =totalcomp*0.55
val pmobanco=totalcomp*0.30
println("prestamo "+ pmobanco)
val interesfab =((totalcomp*.15)*0.20)
val ctofab=totalcomp*.15+interesfab
println("Credito  "+ ctofab)
	}

	else{
	val invprop =(totalcomp*.70)
	println("inversion  "+ invprop)
	val interesfab=((totalcomp*0.30)*0.20)
	val ctofab=totalcomp*0.30+interesfab
		println("credito  "+ interesfab)
	}

}


println ("Que opcion deseas ejecutar  ??")
println ("1.- Calificaciones")
println ("2.- hospital")
println ("3.- Empresa")
var  opcion = readInt ()
println (opcion)


opcion match {

case  1 =>  Calificaciones ()
case  2  =>  hospital ()
case  3  =>  Empresa ()
case default => println ("Opcion invalida")
}
