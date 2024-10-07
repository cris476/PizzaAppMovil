package com.example.myapplication

import com.example.myapplication.Modelo.BebidaDTO
import com.example.myapplication.Modelo.ClienteDTO
import com.example.myapplication.Modelo.EstadoPedido
import com.example.myapplication.Modelo.IngredienteDTO
import com.example.myapplication.Modelo.LineapedidoDTO
import com.example.myapplication.Modelo.Orden
import com.example.myapplication.Modelo.PastaDTO
import com.example.myapplication.Modelo.PedidoDTO
import com.example.myapplication.Modelo.PizzaDTO
import com.example.myapplication.Modelo.Size

import java.util.Date


fun main() {

     var controlador =  Contralador();

     val  listaPedidos1:MutableList<PedidoDTO> = mutableListOf<PedidoDTO>();

     var cliente =  ClienteDTO(id = 0 , nombre = "paco" , password = "Hola" , dni = "121231213" , email = "solano@gmail.com" , direccion = "calle paris" , telefono = "1234566" ,  listaPedidos = listaPedidos1);

     var listaLineaPedido:MutableList<LineapedidoDTO> = mutableListOf();

     var pedido =  PedidoDTO(id = 0 , precioTotal = 12F , fecha = Date(), Estado = EstadoPedido.ENTREGADO , ListaPedido = listaLineaPedido);


    listaLineaPedido.add(LineapedidoDTO(0  , 12 , pizza = PizzaDTO(id = 0 , nombre = "Pizza" , precio = 12.2 , Size.Grande)))
    listaLineaPedido.add(LineapedidoDTO(1  , 14 , bebida = BebidaDTO(id = 1 , nombre = "Pasta" , precio = 12.5 , Size.Pequeno)))
    listaLineaPedido.add(LineapedidoDTO(2  , 15 , pasta = PastaDTO(id = 3 , nombre = "Pizza" , precio = 12.2  )))

    listaLineaPedido.forEach{  p -> println(p)}

    val pizzas:MutableList<PizzaDTO> = mutableListOf(
        PizzaDTO(
            id = 1,
            nombre = "Pizza Margarita",
            precio = 8.50,
            size = Size.Grande,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 4, nombre = "queso", alergenos = mutableListOf("lactosa")),
                IngredienteDTO(id = 5, nombre = "tomate", alergenos = mutableListOf("acidez"))
            )
        ),
        PizzaDTO(
            id = 2,
            nombre = "Pizza Pepperoni",
            precio = 9.00,
            size = Size.Pequeno,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 6, nombre = "pepperoni", alergenos = mutableListOf("gluten", "nitratos")),
                IngredienteDTO(id = 4, nombre = "queso", alergenos = mutableListOf("lactosa"))
            )
        ),
        PizzaDTO(
            id = 3,
            nombre = "Pizza Hawaiana",
            precio = 10.00,
            size = Size.Pequeno,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 7, nombre = "piña", alergenos = mutableListOf("fructosa")),
                IngredienteDTO(id = 8, nombre = "jamón", alergenos = mutableListOf("sulfitos"))
            )
        ),
        PizzaDTO(
            id = 4,
            nombre = "Pizza Cuatro Quesos",
            precio = 10.00,
            size = Size.Pequeno,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 4, nombre = "queso azul", alergenos = mutableListOf("lactosa", "penicilina")),
                IngredienteDTO(id = 9, nombre = "mozzarella", alergenos = mutableListOf("lactosa"))
            )
        ),
        PizzaDTO(
            id = 5,
            nombre = "Pizza Vegetariana",
            precio = 7.50,
            size = Size.Grande,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 10, nombre = "espinacas", alergenos = mutableListOf("ácido oxálico")),
                IngredienteDTO(id = 11, nombre = "pimiento", alergenos = mutableListOf("capsaicina")) ,
                IngredienteDTO(id = 12, nombre = "salsa barbacoa", alergenos = mutableListOf("gluten"))
            )
        ),
        PizzaDTO(
            id = 6,
            nombre = "Pizza Barbacoa",
            precio = 9.50,
            size = Size.Grande,
            listaIngredientes = mutableListOf(
                IngredienteDTO(id = 12, nombre = "salsa barbacoa", alergenos = mutableListOf("gluten")),
                IngredienteDTO(id = 13, nombre = "pollo", alergenos = mutableListOf("proteínas animales"))
            )
        )
    )

    println("----------------------------------------------------------------------------------------------------")


     println(controlador.filtrarPizza(listaPizzas = pizzas , max = 10f , min = 9f));


    val ingredientes = mutableListOf(
        IngredienteDTO(id = 1, nombre = "Cebolla", alergenos = mutableListOf("Sulfitos")),
        IngredienteDTO(id = 2, nombre = "Atún", alergenos = mutableListOf("Histamina")),
        IngredienteDTO(id = 3, nombre = "Queso", alergenos = mutableListOf("Lactosa", "Caseína")),
        IngredienteDTO(id = 4, nombre = "Tomate", alergenos = mutableListOf("Acidez")),
        IngredienteDTO(id = 5, nombre = "Jamón", alergenos = mutableListOf("Sulfitos", "Proteínas animales")),
        IngredienteDTO(id = 6, nombre = "Champiñones", alergenos = mutableListOf("Esporas")),
        IngredienteDTO(id = 7, nombre = "Pimiento", alergenos = mutableListOf("Capsaicina")),
        IngredienteDTO(id = 8, nombre = "Pollo", alergenos = mutableListOf("Proteína de ave")),
        IngredienteDTO(id = 9, nombre = "Anchoa", alergenos = mutableListOf("Pescado", "Histamina")),
        IngredienteDTO(id = 10, nombre = "Espinacas", alergenos = mutableListOf("Ácido oxálico"))
    )


      var listaAlogenos = mutableListOf("Esporas" , "Acidez" , "Proteina");
    println("----------------------------------------------------------------------------------------------------")


      println(controlador.filtradoIngredientes(listaAlergenos = listaAlogenos , listaIngrediente =  ingredientes ));


       println("----------------------------------------------------------------------------------------------------")
       println( controlador.ordenarPizzaPorPrecio(listaPizzas = pizzas , Orden.ASC));

    println("----------------------------------------------------------------------------------------------------")

    var ingredienteSeleccionado =  IngredienteDTO(id = 4, nombre = "salsa barbacoa", alergenos = mutableListOf("lactosa", "penicilina"))


    println( controlador.contarPizza(  listaPizza = pizzas  , ingrediente =  ingredienteSeleccionado))
    println("----------------------------------------------------------------------------------------------------")



}


