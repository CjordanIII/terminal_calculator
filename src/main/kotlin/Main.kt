fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    fun add(a:Short,b:Short) {
        println(a+b)
    }

    fun divide(a:Short, b:Short) {
        println(a/b)
    }
    fun subtract(a:Short,b:Short) {
        println(a-b)
    }
    fun multiply(a:Short,b:Short) {
        println(a*b)
    }



    print("enter a number: ")

    val userInputNumOne =  readlnOrNull()
    println("Enter a sign / + - or *")
    val sign = readlnOrNull()
    println("enter a number: ")
    val userInputNumTwo = readlnOrNull()

    if (userInputNumOne != null && userInputNumTwo != null && sign != null ) {
       val num1 = userInputNumOne.toShort()
        val num2 = userInputNumTwo.toShort()
        when(sign){
            "+"->add(num1,num2)
            "-"->subtract(num1,num2)
            "/"->divide(num1,num2)
            "*"->multiply(num1,num2)
            else-> println("do stuff correctly please")
        }

    }else{
        println("enter something that is not null please")
    }



}