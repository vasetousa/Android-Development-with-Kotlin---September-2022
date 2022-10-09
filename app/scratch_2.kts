//
//
////var intList = ArrayList<int>(size: 100) {2 -> 100}
//
////for (i in 2..100)
////    println(i)
//
//val intArray: Array<Int> = Array(5) {i -> i + 1}
//intArray // [ 1, 2, 3, 4, 5 ]
//intArray[0]
//intArray[2] = 7
//
//val stringArray = Array(3) { i -> "$i"}
//
//// multidimensional Array
//
//val multiDArray = Array(5) {i -> Array<Int>(5) {i -> i} }
//
//val intMap = HashMap<Int, String>()
//intMap[123] = "145"
//intMap[13] = "11111"
//intMap[55] = "0"
//
//
//intMap
//intMap.keys
//intMap.values
//
//intMap.entries
//intMap[123]
//intMap.get(123)
//
//intMap
//
//// Map with Any values
//// adding Key/Value to the Map
//val anyMap = HashMap<String, Any>() // initialising the map
//anyMap.set("1", "First")
//anyMap["2"] = 5
//
//// do/while and break
//var count = 1
//
//do {
//    println(count)
//    count++
//    if (count == 5 ) {
//        break
//    }
//} while (count < 11)

//// "For" cycle
//
//val countList = List(10) {i -> i + 1}
//countList

//for (element in countList) {
//
//    if (element == 5) {
//
//        continue
//    }
//    println(element)
//}
//
//// Labels
//outer@ for (i in 0..100) {
//   inner@ for (j in 0..10) {
//       if (j == 5) {
//           println(j)
//           break
//       }
//   }
//
//}

// When
val intVar = 5
when (intVar) {
    1 -> println("$intVar")
    2 -> println("This var is not 1")
    else -> println("No condition was met")
}