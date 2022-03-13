fun main() {
    val theWord = "repaper"
    val answer1 = checkPalindrome(theWord)
    println(answer1)
    val newWord = "metro"
    val answer2 = checkPalindrome(newWord)
    println(answer2)
}

fun checkPalindrome(originalString: String): Boolean{

    var str = ""

    val len = originalString.length
    for (i in (len - 1) downTo 0) {
        str = str + originalString[i]
    }
    return originalString.equals(str, ignoreCase = true)
}
