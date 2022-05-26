const val BORDER = '+'
const val V_LINE = "---"
const val H_LINE = '|'
const val WHITE = " W "
const val BLACK = " B "
const val EIGHTH = 8
const val SPACE = ' '
const val DBL_SPACE = "  "

fun main() {
    val space4 = DBL_SPACE.repeat(2)
    val space3 = DBL_SPACE+SPACE
    println("Pawns-Only Chess")
    for (i in 8 downTo 1){
        print(DBL_SPACE)
        println((BORDER+V_LINE).repeat(EIGHTH)+BORDER)
        print(i)
        print(SPACE)
        when (i) {
            7 -> println((H_LINE+BLACK).repeat(EIGHTH)+H_LINE)
            2 -> println((H_LINE+WHITE).repeat(EIGHTH)+H_LINE)
            else -> {
                println((H_LINE+space3).repeat(EIGHTH)+H_LINE)
            }
        }
    }
    print(DBL_SPACE)
    println((BORDER+V_LINE).repeat(EIGHTH)+BORDER)
    print(space4)
    for (vowel in 'a'..'h')
        print(vowel+space3)
}