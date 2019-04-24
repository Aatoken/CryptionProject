import java.lang.StringBuilder

/**
 * Auther Aatoken
 * Date 2019/4/23
 * Des 1.Ascll学习
 */


fun main(args: Array<String>) {

    val c = 'a'

    val value = c.toInt()

    println(value)


    val str = "I Love You"
    val array = str.toCharArray()

    //val stringBuilder = StringBuilder()

    //1.
//    for(cha in array)
//    {
//        stringBuilder.append(cha.toInt().toString()+" ")
//    }
//
//    println(stringBuilder.toString())

    //2.
    val result = with(StringBuilder())
    {
        for (cha in array) {
            append(cha.toInt().toString() + " ")
        }

        toString()
    }

    println(result)

}


