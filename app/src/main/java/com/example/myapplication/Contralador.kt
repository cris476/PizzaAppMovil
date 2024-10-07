package com.example.myapplication

import com.example.myapplication.Modelo.IngredienteDTO
import com.example.myapplication.Modelo.PizzaDTO
import com.example.myapplication.Modelo.Orden
import com.example.myapplication.Modelo.PedidoDTO

class Contralador {


        fun filtrarPizza(listaPizzas:List<PizzaDTO>, min:Float, max:Float):List<PizzaDTO>{
              return  listaPizzas.filter { it.precio  in  min .. max};
        }


        fun filtradoIngredientes(listaAlergenos: List<String>, listaIngrediente: List<IngredienteDTO>): List<IngredienteDTO> {
            return listaIngrediente.filter { ingre ->
                ingre.alergenos.none { it in listaAlergenos }
            }
        }


     fun ordenarPizzaPorPrecio(listaPizzas:List<PizzaDTO>, orden: Orden):List<PizzaDTO>{
          return when(orden){
               Orden.ASC -> listaPizzas.sortedBy {  it.nombre };
               Orden.DESC -> listaPizzas.sortedByDescending { it.precio }
               else -> listaPizzas;
          }
     }

       fun contarPizza(listaPizza: List<PizzaDTO>, ingrediente: IngredienteDTO):Int{
               return  listaPizza.filter { pizza ->  pizza.listaIngredientes.any{
                   ingredient -> ingredient.nombre == ingrediente.nombre
               }
               }.count();
      }

//      fun contadorPizzas(listaPizzas: List<PizzaDTO>, ingrediente: IngredienteDTO):Int{
//                return  listaPizzas.filter {
//                                  pizza -> pizza.listaIngredientes.any{ it.nombre  ==  ingrediente.nombre} ;
//                }.count();
//      }

//
//     fun  filtrarPorPrecio(precio:Double , listaPizaas:List<PizzaDTO> ):List<PizzaDTO>{
//
//            return listaPizaas.filterNot {  it.precio  in 3.0..9.0 }
//
//     }
//
//
//    fun  obtenerNombresPizzas(listaPizzas: List<PizzaDTO>):List<String>{
//         return  listaPizzas.map { it.nombre}
//    }
//
//    fun findPizzaFirst(listaPizzas:List<PizzaDTO>): PizzaDTO?{
//         return listaPizzas.find { it.precio == 10.0  }
//    }
//
//    fun findPizzaFirstNull(listaPizzas:List<PizzaDTO>): PizzaDTO?{
//        return listaPizzas.first{ it.precio == 10.0  }
//    }
//
//    fun  tomarPorPosiciones(listaPizzas:List<PizzaDTO>, cantidad:Int ):List<PizzaDTO>{
//        return  listaPizzas.take(cantidad);
//    }
//
//
//    fun tomarWhileCondicion(listaPizzas:List<PizzaDTO>):List<PizzaDTO>{
//         return  listaPizzas.takeWhile { it.precio < 10.0 }
//    }
//
//    fun eliminarPizzas( numero:Int , listaPizzas:List<PizzaDTO>):List<PizzaDTO>{
//        return listaPizzas.drop(numero);
//    }
//
//    fun cumplirCondicion(listaPizzas:List<PizzaDTO>, numero:Int):Boolean{
//         return  listaPizzas.all { it.precio >numero };
//    }
//
//    fun obtenerAlergenosUnicosDePizzas(listaPizzas: List<PizzaDTO>): List<IngredienteDTO> {
//        return listaPizzas.flatMap {  it.listaIngredientes };
//    }
//
//
//    fun separacion(listaPizzas:List<PizzaDTO>):Map< Boolean,List<PizzaDTO>>{
//         return  listaPizzas.groupBy { it.precio >= 10  };
//    }
//
//
//     fun dividirListaCondicion( listaPizzas:List<PizzaDTO>):Pair<List<PizzaDTO>, List<PizzaDTO>>{
//         return  listaPizzas.partition { it.precio > 8 };
//     }
//
//
//     fun asocciacion(listaPizzas: List<PizzaDTO>):Map<Int, String>{
//          return listaPizzas.associate { it.id to it.nombre };
//     }

//       fun filtrarPizza1(listaPizzas:List<PizzaDTO> , max:Float , min:Float):List<PizzaDTO>{
//             return  listaPizzas.filter {  it.precio in max .. min };
//       }
//
//     fun filtrarAlergenos1( listAlergenos: List<String> ,  listaIngredientes:List<IngredienteDTO> ):List<IngredienteDTO>{
//          return  listaIngredientes.filter {  it.alergenos.none{ it in listAlergenos} }  /*  ["gluten ,  mariposa"]*/
//     }
//
//    fun ordenarPorPrecio( listaPizzas:List<PizzaDTO> ,  orden :Orden):List<PizzaDTO>{
//            return when(orden){
//                  Orden.ASC -> listaPizzas.sortedBy { it.precio }
//                  Orden.DESC -> listaPizzas.sortedByDescending { it.precio }
//                  else -> listaPizzas;
//            }
//    }
//
//    fun contadorPizzas(listaPizzas: List<PizzaDTO> , ingrediente: IngredienteDTO):Int{
//           return  listaPizzas.count{ it.listaIngredientes.any{ it == ingrediente}}
//    }

//      fun  PedidoAlergeno(pedido:PedidoDTO):String{
//            return  pedido.ListaPedido.flatMap {
//
//                if(it.bebida != null) emptyList()
//                if(it.pizza != null ) it.pizza.listaIngredientes
//                if(it.pasta != null) it.pasta.listaIngredientes
//
//                emptyList();
//            }
//      }
//fun PedidoAlergeno(pedido: PedidoDTO): String? {
//    return pedido.ListaPedido.flatMap {
//        when {
//            it.bebida != null -> emptyList() // Si es una bebida, no tiene ingredientes alérgenos.
//            it.pizza != null -> it.pizza.listaIngredientes // Si es pizza, devuelve los ingredientes.
//            it.pasta != null -> it.pasta.listaIngredientes // Si es pasta, devuelve los ingredientes.
//            else -> emptyList() // Si no coincide con ninguno, retorna una lista vacía.
//        }
//    }.flatMap { it.alergenos } // Aplana la lista de alérgenos
//        .firstOrNull { it.startsWith("M", ignoreCase = true) } // Busca el primer alérgeno que empiece por 'M'
//}



}