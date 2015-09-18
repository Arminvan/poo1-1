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

