import javax.print.DocFlavor.STRING

fun sum(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun sum2(num1:Int, num2:Int):Int = num1 + num2
fun sum3(num1:Int, num2:Int) = num1 + num2

fun some():Unit {
    print("");
}

fun main(args:Array<String>){
    var result = sum(100,200)
    println("Hello World")
    println(result) //이것은 println(sum(100,200))과 동일하다.
    println(sum2(100,200))
    println(sum3(100,200))

    func2()
//    if func5("") == null()
//    func5("")
    func7()
}

// var 변수 : getter와 setter를 모두 갖고있어서 값 변경 가능한 변수, variable
// val 변수 : setter가 없어서 수정이 불가능한 변수, value
// 상수 : const
// 주석 : //, /**/ /* /* */ */

fun func1(){
    var aa : Int = 1
    var bb = 1000_0000_0000
    var cc = 0b1001_0010_1000_1010
}

fun func2(){
    var aa = 1
    var str = "value is $aa"

    var str2 = "value is " + aa

    var str3 = "${str2.replace("value","variable")}" // str2에서 value를 variable로 바꿔줌.

    var str4 = "Hello, world!\n"

    var str5 = """
        안녕하세요
        만나서 반갑습니다.
        메롱메롱    메롱메롱    메롱메롱
   """

    println(str)
    println(str2)
    println(str3)
    println(str4)
    println(str5)
}

//func3과 func4는 똑같은 메소드이다.
fun func3(v1:Int, v2:Int) :Int{
    if(v1 > v2) {
        return v1
    } else {
        return v2
    }
}

//자바의 삼항연산과 비슷함 => var aaaa:Int = (10>5) ? 10:5 -> 하지만, Kotlin에는 삼항연산이 없음.
fun func4(v1:Int, v2:Int) = if(v1>v2) v1 else v2

//nullable
fun func5(str:String?):Int?{ //Integer에 정수 또는 null 값이 올 수 있다는 것을 알려줌.
    var aa:Int? = func4(1,1)

    if(aa==null) return null
    println(aa+1)

    if(str==null) return null
    str.toInt()

    return null
}

fun func6(obj:Any):Int?{
    if(obj is String) return obj.toInt()

    return null
}

fun func7()
{
    val items = listOf("aaa", "bbb", "ccc")
    var idx = 0
    while(idx<items.size) {
        println("items $idx is ${items[idx]}")
        idx ++
    }
}

fun func8(obj:Any):String {
    when(obj){  //Kotlin에서 when은 break 기능이 필요 없이 해당되는 부분만 찾아서 실행함.
        1 -> return "일"
        "Hello" -> return "안녕"
        is Int -> "숫자"
        !is String -> "문자가 아님"
        else -> return "Unknown"
    }
    return ""
}

fun func9(obj:Any):String =     //함수식으로 사용할 경우, return이 모두 없어짐. 이런 식으로 사용 가능함.
    when(obj){  //Kotlin에서 when은 break 기능이 필요 없이 해당되는 부분만 찾아서 실행함.
        1 -> "일"
        "Hello" -> "안녕"
        is Int -> "숫자"
        !is String -> "문자가 아님"
        else -> "Unknown"
    }