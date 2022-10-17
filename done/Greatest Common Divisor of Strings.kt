fun main() {
    println(gcdOfStrings("ABABAB", "ABAB"))
    println(gcdOfStrings("ABCABC", "ABC"))
}

fun gcdOfStrings(str1: String, str2: String): String {
//    str1 - bigger
//    str2 - shorter
    return if (str1.length < str2.length) {
        gcdOfStrings(str2, str1)
    } else if (!str1.startsWith(str2)) {
        ""
    } else if (str2.isBlank()) {
        str1
    } else {
        gcdOfStrings(str1.substring(str2.length), str2)
    }
}