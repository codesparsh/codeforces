fun main(args: Array<String>)
{ var c: Int=0
	var x= readLine()!!.toInt()
	for(i in 1..x)
		{
			for(j in 1..(i*x))
				{
					if((j*i)>x && (j%i)==0)
						{
							println("$j   $i")
							c++
							break
						}
				}
			if(c==1)break
				
		}
	if(c==0)println("-1")
	
}