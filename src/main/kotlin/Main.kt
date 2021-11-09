/**
 *  programa tendrá la siguiente estructura. Los datos de inicialización estarían hardcodeados.

Existirán las siguientes clases:
Módulo, que tendrá
un array de los alumnos matriculados, ordenados por el identificador del alumno.
un array bidimensional, 3 evaluaciones + uno final, que almacena un array de notas de alumnos ordenadas según el orden de los alumnos. (Guarda la información de la nota el mismo valor del índice en el que se encuentra el alumno. Es decir, si por ejemplo el estudiante Pedro está en la posición 2 del array de estudiantes del módulo, su nota estaría en la posición 2 del array de notas.)
Alumnos
identificador numérico en el instituto.
nombre y apellidos.
Crea las clases y métodos que creas conveniente para realizar las operaciones que se listan a continuación.
 *Crea un programa con 1 módulo de 15 alumnos, matricular 10 alumnos. Rellena las notas de la 1, 2 y 3 Evaluación.
 *Calcula la nota final de los módulos como la media de las 3 Evaluaciones.
 *
 * array.sum
 *
 *Obtener lista de alumnos, nota con las notas por evaluación, por defecto final.
 *Para un módulo, calcular cuantos alumnos han aprobado por evaluación, por defecto final.
 *
 * array / final / {  it.evaluaciones / final >5  }
 * evaluaciones
 *
Para un módulo, calcular la nota más baja por evaluación, por defecto final.

array.min() it.evaluacion 1,2,3

Para un módulo, calcular la nota más alta por evaluación, por defecto final.

array.max()

Para un módulo, calcular la nota media entre todos los alumnos por evaluación, por defecto final.

array.average()


Para un módulo, calcular si alguno tiene un 10 por evaluación, por defecto final.




Para un módulo, calcular si hay alumnos aprobados por evaluación, por defecto final.
Para un módulo, calcular la primera nota que no ha superado el 5 por evaluación, por defecto final.
Obtener una lista con los alumnos ordenados ascendiente según su nota por evaluación, por defecto final.


 *Poder matricular alumnos siempre que no se llegue al máximo de alumnos.
 *Dar de baja alumnos.
Opcional: Puedes hacer un menu para cada opción.

IMPORTANTE: Comenta el código e identifica claramente que parte del ejercicio estas resolviendo, haciendo referencia a los puntos del ejercicio.
 */
class Modulo(){
    var matriculados = intArrayOf(10) // numero de alumnos matriculados


    var evaluaciones = arrayOf(
                     arrayOf(4),  //numero de evaluaciones 3 + final
                    arrayOf()
                         )
}

class Alumno(val identificador:Int=15, val nombre:String =" " ){

}





fun main(args: Array<String>) {


}