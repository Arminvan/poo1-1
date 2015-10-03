println ("****Programa de un Zoologico*******")
println ("1.- Elefante")
println ("2.- Jirafa")
println ("3.- Chimpance")
println ("Elija uno")
var opcion=readInt()
var nino = 0
var joven =0
var adulto =0

opcion match {

  case 1 => {
    println ("Elefante")
    for (i <- 1 to 20){
    println ("Edad del Elejante #"+i)
    var edad = readFloat()
    if (edad == 0 && edad ==1)
    {
        nino+1

    }   else if (edad >1 && edad <3){
        joven +1

    }   else if (edad >= 3){
        adulto +1

    }
  }
    var rs1 = (nino/20)*100
    var rs2 = (joven/20)*100
    var rs3 = (adulto/20)*100

    println ("Porcentajes de animales 0-1"+rs1)
    println ("Porcentajes de animales 1-3"+rs2)
    println ("Porcentajes de animales 3 a +"+rs3)

  }
  case 2 =>{
  println ("Jirafa")
  for (i<- 1 to 15){
    println ("Edad de la jirafa #"+i)
    var edadJ = readFloat()
    if (edadJ == 0 && edadJ ==1){
    nino+1
    }else if (edadJ >1 && edadJ <3){
    joven+1
    }else if (edadJ >= 3){
    adulto+1
    }
  }
  var rs1 = (nino/20)*100
  var rs2 = (joven/20)*100
  var rs3 = (adulto/20)*100

  println ("Porcentajes de animales 0-1"+rs1)
  println ("Porcentajes de animales 1-3"+rs2)
  println ("Porcentajes de animales 3 a +"+rs3)
  }

  case 3 => {
  println ("Chimpance")
  for (i<- 1 to 40){
    println ("edad del chimpance #"+i)
    var edadC = readFloat()
    if (edadC == 0 && edadC ==1){
    nino+1
    }else if (edadC >1 && edadC <3){
   joven+1
   }else if (edadC >= 3){
    adulto+1
  }
  }
  var rs1 = (nino/20)*100
  var rs2 = (joven/20)*100
  var rs3 = (adulto/20)*100

 println ("Porcentajes de animales 0-1"+rs1)
  println ("Porcentajes de animales 1-3"+rs2)
  println ("Porcentajes de animales 3 a +"+rs3)
}
}
