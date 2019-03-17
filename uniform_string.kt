fun main(args: Array<String>)
{   
	var t= readLine()!!.toInt()
	
	
			repeat(t)
				{var chars= ('a'..'z').iterator()
					val (n, k) = readLine()!!.split(" ").map{i-> i.toInt()}
					var hp=""
					repeat(k)
	                {
						hp +=  chars.next().toString().repeat(n/k)
					}
					repeat(n%k)
					{var hars= ('a'..'z').iterator()
						hp+=hars.next()
					}
					println(hp)
					
				}
		
}