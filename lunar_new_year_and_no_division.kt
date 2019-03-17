fun main(args: Array<String>)
{
	var n= readLine()!!.toInt()
	val arr = readLine()!!.split(" ").map{it.toInt()}.sorted()
	var sum=0
	for (i in 0 until (n/2))
		{   val x=arr[i]
			val y=arr[n-1-i]
			sum+=(x+y)*(x+y)
		}
	print(sum)
}