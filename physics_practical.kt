fun main(args: Array<String>)
{
	var c =0
	val n = readLine()!!.toInt()
	var x= readLine()!!.split(" ").map{it-> it.toInt()}
   var arr = IntArray(n)
   for(i in x)
   {
      arr[c++] = i 

   }
	var varr= arr.sorted()
	var filter = varr.filter{it<=2*varr[0]}
	println(varr.size-filter.size)
}