package com.example.myapplication.Modelo

import java.util.Date

 data class  PedidoDTO(val id:Int, val fecha:Date, val precioTotal:Float, val Estado: EstadoPedido, val ListaPedido:List<LineapedidoDTO>){




}