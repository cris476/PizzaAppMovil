package com.example.myapplication.Modelo


data class  LineapedidoDTO(val id:Int, val cantidad:Int, val pizza: PizzaDTO? = null, val  pasta: PastaDTO? = null, val bebida: BebidaDTO? = null ){


    override fun toString(): String {
        return "Lineapedido(id=$id, cantidad=$cantidad, " +
                "${if (pizza != null) "pizza=$pizza" else ""} " +
                "${if (pasta != null) "pasta=$pasta" else ""} " +
                "${if (bebida != null) "bebida=$bebida" else ""} "
    }

}