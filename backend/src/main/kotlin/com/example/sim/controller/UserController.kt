package com.example.sim.controller

import com.example.sim.entity.User
import com.example.sim.repository.UserRepository
import jdk.javadoc.doclet.Reporter
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
    private val repo: UserRepository
) {

    /** 一覧取得 GET /users */
    @GetMapping
    fun list(): List<User> = repo.findAll()

    /** 1件取得 GET /users/{id} */
    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): User =
        repo.findById(id).orElseThrow { RuntimeException("not found") }

    /** 新規作成 POST /users + JSON { "name": "Alice" } */
    @PostMapping
    fun create(@RequestBody u: User): User = repo.save(u)

    /** 更新 PUT /users/{id} + JSON { "name": "Bob" } */
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody body: User): User =
        repo.save(body.copy(id = id))

    /** 削除 DELETE /users/{id} */
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = repo.deleteById(id)
}