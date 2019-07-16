package ru.skillbranch.devintensive.models

import java.util.*


/**
 * Created by Victor 12.07.2019
 */
class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0 ,
    var lastVisit : Date? = null,
    var isOnline : Boolean = false
){

    constructor(id : String, firstName : String?, lastName : String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(
        id = id,
        firstName = "John",
        lastName = "Doe"
    )

    init {
        println("It`s Alive!!! \n" +
                "${if(lastName==="Doe") "His name is $firstName $lastName" else "And his name is $firstName $lastName!!!" }\n")
    }


    companion object Factory {
        private var lastId : Int = -1
        fun makeUser (fullName:String?) : User{
            lastId++

            val parts : List<String>? = fullName?.split(" ")

            val firstName =parts?.getOrNull(0)
            val lastName =parts?.getOrNull(1)

            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}