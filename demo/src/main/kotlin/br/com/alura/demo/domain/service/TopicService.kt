package br.com.alura.demo.domain.service

import br.com.alura.demo.domain.model.Course
import br.com.alura.demo.domain.model.Topic
import br.com.alura.demo.domain.model.Users
import org.springframework.stereotype.Service

@Service
class TopicService {

    fun list(): List<Topic> {
        return listOf(
            Topic(
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
                    email= "email@email"
                )
            )
        )
    }
}