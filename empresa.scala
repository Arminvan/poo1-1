
println("programa de una empresa")
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
