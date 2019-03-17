fun main(args: Array<String>)
{
	val (n,x,y)= readLine()!!.split(" ").map{it.toInt()}
	val a= readLine()!!.split(" ").map{it.toInt()}.sorted()
	if(x>y)
		{
			print(n)
		}
	else if(x<=y)
		{
			val b=a.filter{it -> it<=x}
			if(b.size%2!=0)
				{
					print(b.size/2+1)
				}
			else
				{
					print(b.size/2)
				}
		}
}