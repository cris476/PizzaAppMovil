package com.example.myapplication.Modelo


data class PastaDTO(val id:Int, val nombre:String, val precio:Double, val listaIngredientes:List<IngredienteDTO> = mutableListOf(
    IngredienteDTO(id = 4, nombre = "queso",  mutableListOf("lactosa", "caseína")),
    IngredienteDTO(id = 5, nombre = "champiñón",  mutableListOf("esporas", "micotoxinas")),
    IngredienteDTO(id = 6, nombre = "jamón", mutableListOf("sulfitos", "proteínas animales")),
    IngredienteDTO(id = 7, nombre = "pimiento", mutableListOf("capsaicina")),
    IngredienteDTO(id = 8, nombre = "anchoa", mutableListOf("histamina", "pescado")),
    IngredienteDTO(id = 9, nombre = "pollo", mutableListOf("proteína de ave")),
    IngredienteDTO(id = 10, nombre = "espinaca",  mutableListOf("ácido oxálico"))
)){
    override fun toString(): String {
        return "Pasta(id=$id, nombre='$nombre', precio=$precio)"
    }
}