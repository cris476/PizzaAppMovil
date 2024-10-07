package com.example.myapplication.Modelo


data class  ClienteDTO(val id:Int , val dni:String , val nombre:String , val direccion:String , val telefono:String  , val  email:String , val password:String ,  val  pedido: PedidoDTO? = null ,  val listaPedidos:List<PedidoDTO>) {


}