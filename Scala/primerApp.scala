import Array._
object primerApp{

	def main(args: Array[String]){
		
		//var sumaT = suma(4,5)

		/* Crear un Array */
		var array1 = new Array[Int](2)

		array1(0) = 34
		array1(1) = 45

		for (i <- 0 to (array1.length-1)){
			println("Arreglo")
			println(array1(i))
		}
		
		//println(array1(0))


		/* Crear una Matriz */
		var matriz = ofDim[Int](2,2)
		for (i <- 0 to 1){
			for (j <- 0 to 1){
				println(matriz(i)(j))
			}
		}
		var array2 = ("Hola", "Mundo")
		var array3 = (1.2,1.4)

			//println("suma: " + sumaT)	  
		}
		
		def suma(x:Int, y:Int) = x + y	

			
}

println("La suma es: " + primerApp.suma(20,31))

/* 
Para compilar scalac primerApp.scala 
Para ejecutar scala dojo (con el nombre del object, no del archivo)
*/