/* Variables de primera clase */

object funcional{
	def main(args: Array[String])
	{
		var lista = List(1,2,3)
		lista.map((x:Int)=>println(x+4))

		println(suma2(2,2))  
	}

	def suma(x: Int, y:Int) = x + y
	// Funcional
	val suma2 = (x:Int,y:Int) => x + y
	
	
}