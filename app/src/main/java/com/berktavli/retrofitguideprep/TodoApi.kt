package com.berktavli.retrofitguideprep

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


//Api'mize erişmek için ihtiyacımız olan tüm fonksiyonları burada yazacağız.
//fun getTodos(@Query(value "key") key : String) : Response<List<Todo>>
interface TodoApi {
    @GET("/todos")
    suspend fun getTodos() : Response<List<Todo>>

    /*
    @POST("/createTodo")
    fun createTodo(@Body todo: Todo) : Response <CreateTodoResponse>
     */
}