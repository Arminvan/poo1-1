def Salario() {
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
}

def Empresa(){
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

def Tienda(){
println("programa descuentos para una tienda ")
println("1.BOLA BLANCA")
println("2. BOLA VERDE")
println("3. BOLA AMARILLA")
println("4. BOLA AZUL")
println("5. BOLA ROJA")
val op = readInt()
val tc = op match {
	case 1 =>println("ingrese total de compra")
	val tc = readInt()
	println("total a pagar")
	println(tc)

	case 2 => println("ingrese total de compra")
	val tc = readInt()
	println("total a pagar")
	println(tc-((tc*10)/100))
	case 3 => println("ingrese total de compra")
	val tc = readInt()
	println("total a pagar")
	println(tc-((tc*25)/100))
	case 4 => println("ingrese total de compra")
	val tc = readInt()
	println("total a pagar")
	println(tc-((tc*50)/100))
	case 5 => println("ingrese total de compra")
	val tc = readInt()
	println("total a pagar")
	println(tc-((tc*100)/100))
}
}

def Jubilados(){
println("Programa para clasificar personas jubilados")
println("Ingresa tu edad")
val edad = readInt()
println("ingresa los años laborados")
val empleo = readInt()

if(edad >= 60 && empleo <25){
println("la jubilacion a la que pertenece es POR EDAD")
}

if(edad <= 60 && empleo >= 24 ){
	println("jubilacion por Antiguedad Jooven")
}
if(edad >= 60 && empleo >= 25){

	println("jubilacion por Antiguedad Adulta")
}

	else {
		println("Error")
	}

}

println ("Que opcion deseas ejecutar  ??")
println ("1.- Salario")
println ("2.- Empresa")
println ("3.- Tienda")
println ("4.- Jubilados")
var  opcion = readInt ()
println (opcion)


opcion match {

case  1 =>  Salario ()
case  2  =>  Empresa ()
case  3  =>  Tienda ()
case  4  => Jubilados()
case default => println ("Opcion invalida")
}
