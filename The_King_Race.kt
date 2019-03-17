fun main(args: Array<String>)
{
	var n=readLine()!!.toInt()
	var (x,y)=readLine()!!.split(' ').map{it.toInt()}
	var s=(x-1)+(y-1)
	var p= (n-x)+(n-y)
	if(s<p)
	 {println("white")}
	else if(s==p)
	 {
		println("black")}
	 else 
	 {println("black")}
}