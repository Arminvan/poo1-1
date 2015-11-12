class Profesor(n: String){
  val nombre=n
  var categorizar: String = ""
  var horasClase: Double = 0.0

  def categorizar(c: String) {
    categorizar = c
    categorizar match {
      case "HC" => horasClase = 75
      case "MT" => horasClase = 120
      case "TC" => horasClase = 180
    }
  }
}

	class Nomina(){
  val profesores= new Array[ProfesoresAPagar](50)
  var profesoresAPagar = 0
  def nominar(profesor: Profesor, horas: Int,asesorias:Int){
   profesores(profesoresAPagar)= new ProfesoresAPagar(profesor, horas,asesorias)
   profesoresAPagar += 1
  }
  def totalAPagar(): Double = {
    var total=0.0
    for(i <-0 to profesoresAPagar - 1){
      total += profesores(i).precio()
    }
    return total
  }
}

class ProfesoresAPagar(p: Profesor, h:Int,a:Int){
  val horasPagadas=h
  val profesor = p
  val asesorias = a
  def precio(): Double = {
  var asesoria =0.0
    profesor.categorizar match {
      case "HC" =>asesoria= 75*3
      case "MT" =>asesoria = 120*2
      case"TC" => asesoria = 180*2

    }
      var pago = profesor.horasClase * horasPagadas
      return pago + (asesoria*asesorias)
    }
}

var respuesta='n'
val nomina= new Nomina()
do{
println("****************************************************")
	println ("Bienvenido a la Universidad BUAP")
println("****************************************************")
  val profesores=new Profesor("")
  println("Ingresa el nombre del Profesor : ")
  var nombre=readLine()
  println("Ingrese la categoria del profesor a pagar:HC, MT y TC ")
  var categorizar = readLine()
  println("Cuantos horas vas a pagar?: ")
  var horas = readInt()
  println("Ingrese las horas de Asesorias")
 var asesorias = readInt()
  println(nombre + "|"+  categorizar + "|" + horas + "|" + asesorias)
  profesores.categorizar(categorizar)
  nomina.nominar(profesores, horas,asesorias)


  println("Quieres otra nomina de profesor? (s/n) ")
  respuesta=readChar()

}
	while (respuesta!='n')
	println("Total a pagar: " + nomina.totalAPagar())
