fun main(args: Array<String>)
{
	var n=readLine()!!.toInt()
	repeat(n)
	{
		var(l,r,d)=readLine()!!.split(' ').map{it.toInt()}
		var i=d
		while(d in l..r)
			{
				d+=i
		}
		println(d)
	}
}