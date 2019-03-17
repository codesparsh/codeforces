fun main(args: Array<String>)
{
	for(x in 1..readLine()!!.toInt())
	{   var d=0
		var(l1,r1,l2,r2)= readLine()!!.split(' ').map{it.toInt()}
		for(a in l1..r1)
			{
			    d=a
				print("$a")
				break
			}
		for(b in l2..r2)
			{
				if(b==d)
					{
						continue
					}
				print(" $b")
				break
			}
		println("")
	}
}