byte=((byte="0000 0001") => {
    byte=byte.replace("1","0");
    return byte.match("0000 0000")?
    null:byte
})(); //null
