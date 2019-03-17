fun main(args: Array<String>)
{    var t= readLine()!!.toInt()
	repeat(t)
	{   var sum= 0
		var l= readLine()!!.toInt()
		var r= readLine()!!.toInt()
		for(i in l..r)
			{
				if(i%2==0)
					{
						sum+= i
					}
				else
					{
						sum-= i
					}
			}
			println(sum)
	}
}