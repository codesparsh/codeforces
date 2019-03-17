fun main(args: Array<String>)
{   
	  var n= readLine()!!.toInt()
      val result = Array(n) { arrayOfNulls<Int>(n) }
	  for(i in 0 until n-1)
		  {
		    for(j in 0 until n-1)
		    {
			  result[i][j]= readLine()!!.toInt()
		    }
		  }
	var c=0
	  for(i in 1 until n-2)
		  {
		    for(j in 1 until n-2)
		    {
			  var x=result[i][j]
				if(x==result[i-1][j-1] && x==result[i-1][j+1] && x==result[i+1][j-1] && x==result[i+1][j+1] && x==6)
					{  println("x")
						c++
					}
					  
		    }
		  }
	println(c)
}