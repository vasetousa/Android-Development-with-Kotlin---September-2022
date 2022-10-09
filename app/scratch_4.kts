fun myFirstFunction(
    firstParam: Int,
    secondParam: String,
    thirdParam: Boolean
) {

}

myFirstFunction(1, "aaaa", true)

fun myFirstFunctionWithDefaultParams(
    firstParam: Int = 1,
) {

}

myFirstFunctionWithDefaultParams()
myFirstFunctionWithDefaultParams(firstParam = 5)


fun funcOptionalParams(
    optionalParam: Int? = null, // if no value was provided
    optParam: String? = "ABCD"
) {

    optionalParam?.toString()   // if not null make it string


    if (optionalParam == null) {
        return
        // ... or other logic
    }
}
funcOptionalParams()

fun higherOrderFunction(
//    functionName: () -> Unit  diff example
//    functionName: () -> String  diff example
    functionName: (a: Int, b: Int) -> Int
): Int {
    // ....
    // val result = functionName(1, 2)
    // return result
    //otherFunction()
    return functionName(1, 2/*,otherFunction()*/)
}

val myFunVal = fun(a: Int, b: Int): Int {
    return a + b
}

higherOrderFunction { a, b -> a + b }/* return direct result lambda */


higherOrderFunction(
    myFunVal
) /* or return some predefined function */


fun higherOrderTrailingFunction(
    a: Int,
    functionName: (a: Int, b: Int) -> Int
): Int {
    return functionName(3, 4)
}

higherOrderTrailingFunction(1, { a, b -> a + b })
higherOrderTrailingFunction(1, myFunVal )

higherOrderTrailingFunction(1) {
        a, b ->
    println("First param is $a")
    println("Second param is $b")
    a + b
}


