import java.util.*

fun palindrome(text: String): String {
    var isPalindrome = true
    var i = 0
    while (i < text.length / 2) {
        if (text[i] != text[text.length - 1 - i])
            isPalindrome = false
        i++
    }

    if (isPalindrome)
        return "$text is palindrome"

    return "$text is not palindrome"
}

fun parentheses(text: String): Boolean {
    val stack: Stack<Char> = Stack<Char>()
    for (char in text) {
        when (char) {
            '(' -> stack.push(char)
            ')' -> {
                if (stack.size != 0)
                    stack.pop()
                else
                    return false
            }
            else -> break
        }
    }
    return stack.size == 0
}

fun myName(name: String?, age: Int?): String {
    if (name.isNullOrEmpty() || age == null || age == 0)
        return "Name or age was not defined"

    return "$name now $age years old"
}

fun main() {
    println(palindrome("kasur rusak"))
    println("its " + parentheses("(())()"))
    println(myName(null, null))
    println(myName("Your name", 22))
}