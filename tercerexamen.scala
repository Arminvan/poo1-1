class ProductoAPagar (
	private val nombre: String,
	private val precio: Float,
	private val cantidad: Int
	){

	def subtotal (): Double ={
		return precio * cantidad
	}
}

class Productos  extends Iterable [ProductoAPagar] {
private val productosAPagar  = new Array[ProductoAPagar](50)
private var cantidadProductos  = 0

def iterator (): Iterator[ProductoAPagar] ={
  return productosAPagar.slice(0,cantidadProductos).iterator
}

  def anexar (productoAPagar:ProductoAPagar){
productosAPagar (cantidadProductos)=productoAPagar
cantidadProductos += 1
}
  }

class Nota {
private val productosAPagar = new Productos ()

def agregar( productoAPagar:ProductoAPagar){
productosAPagar.anexar (productoAPagar)
}

def total():Double = {
var total = 0.0
for(productoAPagar <- productosAPagar ){
total += productoAPagar.subtotal
}
return total
  }
     }


var otro = 'n'

do  {

	println ("Bienvenido usuario")


	println ("Nombre del producto:  ")
	val nombre = readLine ()

	println ("Precio del Producto: ")
	val precio = readFloat ()

	println ("Cantidad de Productos:  ")
	val cantidad = readInt ()


	println("Desea agregar otro producto : (s/n) ")
    otro = readChar()
}
	while (otro!='n')

    val nota = new Nota

	println ("Total a pagar:  " + nota.total())
