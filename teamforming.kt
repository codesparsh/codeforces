fun main(args: Array<String>) {
	
	var n: Int = readLine()!!.toInt()
	var arr = IntArray(n)
	for (i in 0..n-1)
	 {arr[i]= readLine()!!.toInt()}
	var varr = arr.sorted()
	var ans: Int=0
	for (i in 1..(n-1) step 2) ans+=varr[i]-varr[i-1]
	println(ans)
}