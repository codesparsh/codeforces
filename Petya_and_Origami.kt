fun main(args: Array<String>)
{
	var n= readLine()!!.toInt()
	var k= readLine()!!.toInt()
	var c= ((2*n)/k)+((5*n)/k)+((8*n)/k)
	if((2*n)%k!=0)
		{c++}
	if((5*n)%k!=0)
		{c++}
	if((8*n)%k!=0)
		{c++}
	println(c)
}