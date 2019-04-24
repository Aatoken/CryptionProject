/**
 * Auther Aatoken
 * Date 2019/4/24
 * Des 凯撒加密算法
 */

/**
 * Auther Aatoken
 * Date 2019/4/23
 * Des 2.凯撒加密算法
 */
fun main(args: Array<String>) {

    val encrypt = Caesar().encrypt("Love", 2)
    println(encrypt)
    val decrypt = Caesar().decrypt(encrypt.toString(), 2)
    println(decrypt)
}


class Caesar {


    /**
     * 加密算法
     */
    fun encrypt(input: String, key: Int): Any {

        val arrays = input.toCharArray()

        return with(StringBuffer())
        {
            arrays.forEach {
                var ascll = it.toInt()
                ascll += key
                val result = ascll.toChar()

                append(result)
            }
            toString()
        }

    }


    /**
     * 解密
     */
    fun decrypt(input: String, key: Int): Any {

        val arrays = input.toCharArray()

        return with(StringBuffer())
        {
            arrays.forEach {
                var ascll = it.toInt()
                ascll -= key
                val result = ascll.toChar()

                append(result)
            }
            toString()
        }

    }

}