package ru.skillbranch.devintensive.utils

/**
 * Create by Victor Matyzhonok 18.07.2019
 */
object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        var fullNameModifier = fullName?.trim()
        if ((fullNameModifier == null) or (fullNameModifier == "")) {
            return null to null
        }
        while (fullNameModifier!!.contains("  ")){
            fullNameModifier = fullNameModifier!!.replace("  "," ")
        }
        val parts : List<String>? = fullNameModifier?.split(" ")

        var firstName =parts?.getOrNull(0)
        var lastName =parts?.getOrNull(1)

        return firstName to lastName
    }
}