// Homework 21/09/2022

var evenCounter = 0
var oddCounter = 0
var primeCounter = 0
var flag = true


for (i in 2..100) {
    flag = true
    for (j in 2..i)
        if (i % j == 0) {
            var flag = false
            break
        }

var first = 2
var last = 100
    
while (first < last){ 

    when {
        i % 2 == 0 -> evenCounter++
        i % 2 != 0 -> oddCounter++
        flag ->  primeCounter++
    }

}

println(evenCounter)
println(oddCounter)
println(primeCounter)
