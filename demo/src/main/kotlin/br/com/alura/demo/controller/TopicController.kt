package br.com.alura.demo.controller

import br.com.alura.demo.domain.model.Topic
import br.com.alura.demo.domain.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/topics")
class TopicController(private val topicService: TopicService) {

    @GetMapping
    fun list(): List<Topic>{
        return topicService.list()
    }

    @GetMapping("/{id}")
    fun list(@PathVariable id: Long): Topic{
        return topicService.findById(id)
    }
}