package com.example.msgshareapp.models

data class Hobby (var title: String)

object Supplier{
    //  previously val hobbies = listOf<Hobby>()   but changed to remove explicit type arguments.

    val  hobbies = listOf(
        Hobby("Coding"),
        Hobby("Reading"),
        Hobby("Exploring"),
        Hobby("Building"),
        Hobby("Thinking"),
        Hobby("Sleeping"),
        Hobby("Researching"),
        Hobby("Gaming"),
        Hobby("Playing Football"),
        Hobby("Watching Series")
    )
}
