fun main(args: Array<String>)
{
	var str= readLine()!!
	var c=0
	var new: String=""
	if(str.length%2==0)
	{
	for(i in 1..str.length)
		{
			if(c%2==0)
			{
				new=str[str.length-1]+new
				str= str.substring(0,str.length-1)
				c++
			}
	        else
			{
				new=str[0]+new
				str= str.substring(1,str.length)
				c++  
			}
		}
	}
	else
		{
			for(i in 1..str.length)
		{
			if(c%2==0)
			{new=str[0]+new
				str= str.substring(1,str.length)
				c++  
			}
	        else
			{new=str[str.length-1]+new
				str= str.substring(0,str.length-1)
				c++
			}
		}
			
		}
	println(new)
       
}