class  Fraccion (n: Int, d: Int) {
  val  numerador = n
  val  denominador = d
  def  sumar (b: Fraccion): Fraccion = {
    new  Fraccion (
      numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador
    )
  }

  def  restar (b: Fraccion): Fraccion = {
    new Fraccion (
      numerador * b.denominador - denominador * b.numerador,
      denominador * b.denominador
    )
  }

  def  division (b: Fraccion): Fraccion = {
    new Fraccion (
      numerador * b.denominador,
      denominador * b.numerador
    )
  }

  def  Multiplicacion (b:Fraccion): Fraccion = {
    new Fraccion (
      numerador * b.numerador,
      denominador * b.denominador
    )
  }
}
var opcion = '5'
do {
println("****Que opcion deseas ejecutar?****")
  println ("1) Suma")
  println ("2) Resta")
  println ("3) Division")
  println ("4) Multiplicacion")
  println ("5) Salir")
  opcion = readChar ()
    println ("ingresa el numerador de la primera fraccion:")
    var  n1 = readInt ()
    println ("ingresa el denominador de la primera fraccion:")
    var  d1 = readInt ()

    val fraccion1 = new Fraccion(n1, d1)
    println ("ingresa el numerador de la Segunda fraccion:")
    var  n2 = readInt ()
    println ("ingresa el denominador de la Segunda fraccion:")
    var  d2 = readInt ()
    val fraccion2 = new Fraccion(n2, d2)


  opcion match {
    case  1  => {
      val sumar = fraccion1.sumar(fraccion2)
      println ("La suma es:"  + sumar.numerador +  "/"  + sumar.denominador)
    }
    case  2  => {
      val  restar = fraccion1.restar (fraccion2)
      println ("La Resta es:"  + restar.numerador +  "/"  + restar.denominador)
    }
    case  3  => {
      val  division = fraccion1.division (fraccion2)
      println ("La division es:"  + division.numerador +  "/"  + division.denominador)
    }
    case  4  => {
      val  Multiplicacion = fraccion1.Multiplicacion (fraccion2)
      println ("La Multiplicación es:"  + Multiplicacion.numerador +  "/"  + Multiplicacion.denominador)
    }
    case default => println ("Adios ...")
  }
} while (opcion !=5)
println("Adios..........")
