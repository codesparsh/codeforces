fun main (args: Array<String>)
{  
	var t: Int=readLine()!!.toInt()
	repeat(t)
	{
		var s=readLine()!!.toCharArray()
		s.sort()
		if(s.last()==s.first())
			{
				println(-1)
			}
		else
			{
				println(String(s))
			}
	}
}
