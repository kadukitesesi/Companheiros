package com.kadukitesesi.companheiros.companheiro

class Companheiro(
    val nome: String, val idade: Int, val descricao: String
) {

    override fun toString(): String {
        return "nome: $nome \n idade: $idade \n descrição: $descricao"
    }
}