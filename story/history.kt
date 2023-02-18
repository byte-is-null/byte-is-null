fun main(): Unit {
    val origin = "0000 0001"
    val byte = (fun(byte: String): String? {
        var byte = byte.replace("1","0")
        val regex = Regex("0000 0000")
        return when(byte.matches(regex)) {
            true -> null
            false -> byte
        } ?: null
    })(origin)
    println(byte) //null
}
