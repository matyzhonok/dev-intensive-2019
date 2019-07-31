package ru.skillbranch.devintensive.utils

/**
 * Create by Victor Matyzhonok 18.07.2019
 */
object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{

        val parts : List<String>? = fullName?.split(" ")?.filter { !it.isBlank()}

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }
}