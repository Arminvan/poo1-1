println("Programa para clasificar personas jubiladas")
println("Ingresa tu edad")
val edad= readint()
println("ingresa los años laborados")
val empleo= readint()
if(edad >= 60 && empleo <25){
println("la jubilacion a la que pertenece es POR EDAD")

if(edad <= 60 && empleo >=24 )
	println("jubilacion por Antiguedad Jooven")

if(edad >= 60 && empleo >=25)

	println("jubilacion por Antiguedad Adulta")
}
	
	else {
		println("Error")
	}

