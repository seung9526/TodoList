package com.todolist.todolist.controller

import com.todolist.todolist.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class Todocontroller(
        private val todoService: TodoService

) {

    @GetMapping
    fun getTodos() = todoService.getTodos()

    @PostMapping
    fun insertTodos(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.todoName)

    @PutMapping(path = ["/{todoId}"])
    fun updateTodo(@PathVariable ("todoId") todoId: Long) = todoService.updateTodo(todoId)

    @DeleteMapping(path = ["/{todoId}"])
    fun deleteTodo(@PathVariable("todoId") todoId: Long) = todoService.deleteTodo(todoId)


}