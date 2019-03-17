fun main()
{   var c=0
	var s= readLine()!!
	var n= readLine()!!.split(' ')
	for(i in n)
	{
		
		if(s[0]==i[0]||s[1]==i[1])
			{
				c=1
				
			}
	}
	
	if(c==1)
	{println("YES")}
		 else
		 {println("NO")
		 }
}
