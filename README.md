## :partly_sunny: Hello, I'm recently _a bit off_
 
```javascript
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
```

Tags: `Run-In-Browser` `Source-Code` `Kotlin`
<!--Tags: [`Run-In-Browser`](https://github.com/topics/run-in-browser) [`Source-Code`](https://github.com/topics/source-code) [`JavaScript`](https://github.com/topics/javascript)-->

## :stuck_out_tongue_winking_eye: Now I'm referred to as Nullified
> But my true purpose shall remain NoneType

## :skull: Contact (Emergency only)
WARNING: Please do not try and [contact me](https://github.com/byte-is-null/contact-info)
