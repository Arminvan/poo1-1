println("promedio de un alumno")
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
	println("tu calificaion final es")
	println(cf)
	

