fun main(args: Array<String>)
{
	var (y,b,r)= arrayOf(1,2,3)
	var yy=readLine()!!.toInt()
	var bb=readLine()!!.toInt()
	var rr=readLine()!!.toInt()
	while(y<yy && b<bb && r<rr)
		{
			y+=1
			b+=1
			r+=1
		}
	println(y+b+r)
	
}