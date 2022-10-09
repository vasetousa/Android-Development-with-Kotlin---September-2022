fun funOne(param: Int) {
    val numbers = arrayOf(2,3,4,5,6,12,13,14,15)
    val matchArray = numbers.filter { it==param }

    if (matchArray.isNotEmpty()) {
        val matchNumber = matchArray.first() // match.get(0)
        println("$matchNumber -> YES")
    } else {
        println("$param -> NO")
    }
}

fun funTwo(param: Int) {
    val numbers = arrayOf(0,2,4,6,10,11,12,13)
    val divisors = ArrayList<Int>()
    numbers.forEach {
        if (param % it == 0) {
            divisors.add(it)
        }
    }
    if (divisors.isNotEmpty()) {
        println("$param -> $divisors")
    } else {
        println("$param -> No divisors found")
}
}

val funOneParam = fun(param: Int) {
    val numbers = arrayOf(2,3,4,5,6,12,13,14,15)
    val matchArray = numbers.filter { it==param }

    if (matchArray.isNotEmpty()) {
        val matchNumber = matchArray.first() // match.get(0)
        println("$matchNumber -> YES")
    } else {
        println("$param -> Not in array(NO)")
    }
}

fun higherOrderFunction(
    param: Int,
    firstFun: (Int) -> Unit,
    secondFun: (Int) -> Unit
) {
    if (param % 3 == 0)
        firstFun(param)
    else {
        secondFun(param)
    }
}

fun main() {
    for (el in 0..20) {
        higherOrderFunction(el, funOneParam) {
            val numbers = arrayOf(0, 2, 4, 6, 10, 11, 12, 13)
            val divisors = ArrayList<Int>()
            numbers.filter { n -> n != 0 }.forEach { num ->
                if (it % num == 0) {
                    divisors.add(it)
                }
            }
            if (divisors.isNotEmpty()) {
                println("$it -> $divisors")
            } else {
                println("$it -> No divisors found")
            }
        }
    }
}

main()

