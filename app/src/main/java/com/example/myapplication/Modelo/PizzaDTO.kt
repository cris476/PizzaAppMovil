package com.example.myapplication.Modelo


data class  PizzaDTO(val id:Int, val nombre:String, val precio:Double, val size: Size, val listaIngredientes:List<IngredienteDTO> = mutableListOf(
    IngredienteDTO(id = 1 , nombre = "cebolla" , alergenos =  mutableListOf( "la rabia" , "algodon") ),
     IngredienteDTO(id = 2 , nombre = "atun" , alergenos =  mutableListOf( "salmonosis" , "escamas") ),
     IngredienteDTO(id = 3 , nombre = "tortilla" , alergenos =  mutableListOf( "patata" , "masa") )
)){


    override fun toString(): String {
        return "Pizza(id=$id, nombre='$nombre', precio=$precio, size=$size)"
    }
}
