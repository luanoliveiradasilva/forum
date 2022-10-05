package br.com.alura.demo.domain.model

import java.time.LocalDateTime

data class Answer(
    val id: Long? = null,
    val message: String,
    val creationDate: LocalDateTime = LocalDateTime.now(),
    val author: Users,
    val topic: Topic,
    val solution: Boolean
)
