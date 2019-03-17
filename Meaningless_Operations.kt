import kotlin.math.log
fun main(args: Array<String>) {

    var t = readLine()!!.toInt()
    repeat(t)
    {
        var a = readLine()!!.toInt()
        var a1 = Integer.toBinaryString(a).toString()
        var arr = arrayOf(0,1,1,1,5,1,21,1,85,73,341,89,1365, 1, 5461, 4681, 21845, 1, 87381, 1, 349525, 299593, 1398101, 178481, 5592405, 1082401)

        if(check(a+1)==true )
        {
            var y= log(a+1.toDouble(),2.0)
            println(y)
        }
        else
        { var l=a1.length
            println(Math.pow(2.0,l.toDouble()-1))
        }
    }
}
