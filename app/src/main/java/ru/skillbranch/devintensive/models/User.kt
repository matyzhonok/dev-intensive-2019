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
        lastName = "Doe $id"
    )

    init {
        println("I'm are live")
    }
}