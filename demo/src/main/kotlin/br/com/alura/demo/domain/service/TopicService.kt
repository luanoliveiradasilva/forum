package br.com.alura.demo.domain.service

import br.com.alura.demo.domain.model.Course
import br.com.alura.demo.domain.model.Topic
import br.com.alura.demo.domain.model.Users
import org.springframework.stereotype.Service

@Service
class TopicService(private var topics: List<Topic>) {
    init {
        val topic = Topic(
            id = 1,
            title = "title",
            message = "message",
            course = Course(
                id = 1,
                name = "Kotlin",
                categoryCourse = "back-end"
            ),
            author = Users(
                id = 1,
                name = "name",
                email = "email@email"
            )
        )
        val topic2 = Topic(
            id = 2,
            title = "title",
            message = "message",
            course = Course(
                id = 2,
                name = "Kotlin",
                categoryCourse = "back-end"
            ),
            author = Users(
                id = 2,
                name = "name",
                email = "email@email"
            )
        )
        topics = listOf(topic, topic2)
    }

    fun list(): List<Topic> {
        return topics
    }

    fun findById(id: Long): Topic {
        return topics.stream().filter({ t ->
            t.id == id
        }).findFirst().get()
    }
}