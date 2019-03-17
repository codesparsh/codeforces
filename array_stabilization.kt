fun main(args: Array<String>)
{
	var n=readLine()!!.toInt()
	var arr= IntArray(n)
	for(i in 0..n-1)
		{
			arr[i]=readLine()!!.toInt()
		}
	var varr= arr.sorted()
	if( (varr[1]-varr[0]) > (varr[n-1]-varr[n-2]) )
		{
			println(varr[n-1]-varr[1])
		}
	else if( (varr[1]-varr[0]) < (varr[n-1]-varr[n-2]) )
	{
		println(varr[n-2]-varr[0])
	}
	else
		{println(0)}
}