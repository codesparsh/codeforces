fun main(args: Array<String>)
{
	var n= readLine()!!.toInt()
	var t= readLine()!!
	var c=1
	var new: String=""
	while(c<11)
		{
			new+= t[0]
			t=t.drop(c)
			if(t.length==0)
				{
					break
				}
			c++
		}
	println(n)
	println(new)
}