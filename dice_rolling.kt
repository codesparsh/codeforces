fun main(args: Array<String>)
{  
	var s= arrayOf(2,3,4,5,6,7)
	var t=readLine()!!.toInt()
	repeat(t)
	{   var c: Int=0
		var p: Int=readLine()!!.toInt()
		while (p>0)
			{
		       if(p>7)
				   {   p=p-s.random()
					   c++
							}
				else
				   {   c++
					   p=0
							}
	        }
		println(c)
	}
}