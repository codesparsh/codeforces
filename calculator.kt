fun main() {
	var n =readLine()!!.toInt()
	var (x,y)=readLine()!!.split(' ').map{it.toInt()}
	when(n){
		 1-> println(x+y)
		 2-> println(x-y)
		3-> println(x*y)
		4-> println(x/y)
	}
}