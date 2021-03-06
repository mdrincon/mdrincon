package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Lección1
        //variablesyconstantes ()

        //Lección2
        //tiposDeDatos ()

        //lección3
        //sentenciaIf ()

        //Leccion 4
        //sentenciaWhen()

        //Leccion5
        //arrays()

        //leccion6
        //mapas()

        //Lección7
        //loops()

        //Leccion8
        nullSafety()




    }


    /*
    Aqui vamos a hablar de variables y constantes
     */
    private fun variablesyconstantes () {

        //variables

        var myFirstVariable = "Hello Hackermen"
        var myFirstNumber = 1

    println(myFirstVariable)

    myFirstVariable = "Wellcome to my World"

    println (myFirstVariable)

    // No podemos asignar un entero a un int
    // myFirstVariable = 1

    var mySecondVariable = "Suscribete"

    println (mySecondVariable)

    mySecondVariable = myFirstVariable

    println (mySecondVariable)

    myFirstVariable = "Ya te has suscrito?"

    println(myFirstVariable)

    //constantes

    val myFirstConstant = "Te ha gustado el tutorial?"

    println (myFirstConstant)

    val mySecondConstant = myFirstVariable

    println (mySecondConstant)
    }
    /*
    Que son los tipos de datos
     */
    private fun tiposDeDatos() {
        /*  String: cadena de texto
            Enteros: numeros enteros
            Decimales: tienen decimales
            Bool: verdadero o falso
         */
        //String
        val myString: String = "Hola Hackermen!"
        val myString2 = "Bienvenidos a mi mundo!"
        val myString3 = myString + " "+myString2
        println(myString3)

        //Entero (Byte, Short, Int, Long)

        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (FLoat: hasta 32 bytes, Double: mayor longitud)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.5
        val myDouble3 = 1
        val myDouble4 = myDouble+myDouble2+myDouble3
        println(myDouble4)

        //Boolean

        val myBool = true
        val myBool2 = false
        // val myBool3 = mybool + mybool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    private fun sentenciaIf() {
        val myNumber= 71
        //Operador condicionales
        // mayor que >
        // menor que <
        // mayor o igual que >=
        // menor o igual que
        // == igualdad
        // != desigualdad

        if (myNumber <= 10 && myNumber > 5 || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o igual a 53")

        } else if (myNumber == 60){
            println("$myNumber es igual a 60")

        } else if (myNumber != 70){
            println("$myNumber no es igual a 70")

        } else {
            //sentencia ELSE
            println("$myNumber es mayor que 10 o menor o igual a 5 y no es igual a 53")
        }
        //Operadores lógicos
        /*
        y &&
        o ||
        no !, escribiendo ! delante de la sentencia if
        if (!myNumber <= 10 && myNumber > 5 || myNumber == 53)
         */
    }


    /*
    Aqui vamos a hablar de la sentencia When
     */
    fun sentenciaWhen(){

        //When con String
        val country = "EEUU"

        when(country){
            "Espana","Colombia","Peru","Argentina" -> {
                println("El idioma es espanol")
            /* }"Colombia" -> {
            println("El idioma es espanol")
            }"Peru" ->{
                println("El idioma es espanol")
             */
            }"EEUU" ->{
                println("El idioma es ingles")
            }"Francia" ->{
                println("El idioma es frances")
            }else -> {
                println ("No conocemos el idioma")
            }
        }
        //When con int
        val age = 100

        when(age){
            0, 1 , 2 ->{
                println("El usuario es un bebe")
            } in 3 ..10 ->{
                println("El usuario es un nino")
            } in 11..17 ->{
                println("El usuario es un adolescente")
            }in 18..65 ->{
                println ("El usuario es un adulto")
            }in 66..99 ->{
                println("El usuario es un adulto mayor")
            }else -> {
                println("El usuario es un angel")
            }
        }
    }

/*
Aqui se explica el uso de los ARRAY
 */
fun arrays(){
    val name = "Gustavo"
    val surname = "Rincon"
    val company = "MrG-Enterpise"
    val age = "45"

    // creacion de un array

    val myArray: ArrayList<String> = arrayListOf<String>()

    //Anadir datos de uno en uno

    myArray.add(name)
    myArray.add(surname)
    myArray.add(company)
    myArray.add(age)

    println(myArray)

    //Anadir datos en conjunto

    myArray.addAll(listOf("Hola","Bienvenidos a mi mundo"))

    println(myArray)

    //acceso a datos de un array

    val mycompany = myArray[2]

    println(mycompany)

    //modificiacion de datos

    myArray[5] ="Bienvenidos a mi universo"

    println(myArray)

    //eliminar datos
    myArray.removeAt(4)
    println(myArray)

    //Recorrido de arrays

    myArray.forEach{
        println(it)
    }

    //operaciones adicionales

    println(myArray.count())
    myArray.clear()
    println(myArray.count())

}

    //MAPAS O DICCIONARIOS

    fun mapas(){
        /*
        Aqui vamos a hablar de mapas o diccionarios
         */
        // var myMap: Map<String,Int> = mapOf() (no mutable)
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elementos
        myMap = mutableMapOf("ACM" to 1,"ACA" to 2, "ACP" to 3, "AB" to 4, "ACI" to 5 )
        println(myMap)

        //Añadir un solo valor

        myMap["ACC"] = 7
        myMap.put("ACE",8)
        println(myMap)

        //Actualizar un dato
        myMap.put("ACI",9)
        println(myMap)

        //acceso a un dato
        println(myMap["ACI"])

        //Borrado de datos
        myMap.remove("ACC")
        println(myMap)



    }
    private fun loops(){
        val myArray = listOf<String>("Hola","Bienvenidos a mi universo","Go ahead")
        val myMap = mutableMapOf<String,Int>("Juan" to 1,"Pedro" to 2,"Lucas" to 3, "Santiago" to 4)

        //for

        for (myString in myArray){
            println(myString)
        }
        for (myElements in myMap){
            println("${myElements.key}-${myElements.value}")
        }
// incluye todos los datos en el rango
        for(x in 0..10){
            println(x)
        }
//no incluye el ultimo dato del rango
        for(x in 0 until 10){
            println(x)
        }
        for(x in 9 until 30){
            println(x)
        }
        for(x in 0..20 step 2){
            println(x)
        }
        //cuenta regresiva
        for(x in 20 downTo 1 step 3){
            println(x)
        }
// crear un array con un loop for (step indica el incremento o decremento)
        val myNumericArray = (0..20 step 4)
        for (myNum in myNumericArray){
            println(myNum)
        }
        //While
        var x = 0
            while (x < 10){
                println(x)
                x += 2
            }



    }
fun nullSafety(){
    //aqui vamos a hablar de seguridad para evitar null exceptions
    var myString = "MrG"
    //myString = null esto daria un error de compilacion
    println(myString)

    var mySafetyString: String? ="MrG null safety"
    mySafetyString= null
    println(mySafetyString)


    mySafetyString= "GoAhead people"
    println(mySafetyString)

    //Safe Calls


    println(mySafetyString?.length)



   }



}


