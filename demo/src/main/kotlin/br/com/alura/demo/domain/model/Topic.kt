package br.com.alura.demo.domain.model

import java.time.LocalDateTime

data class Topic(
    val id: Long? = null,
    val title: String,
    val message: String,
    val creationDates: LocalDateTime = LocalDateTime.now(),
    val course: Course,
    val author: Users,
    val statusTopic: StatusTopicEnum = StatusTopicEnum.NOT_ANSWERED,
    val answer: List<Answer> = ArrayList()
)
