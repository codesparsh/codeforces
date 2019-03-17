fun main(args: Array<String>)
{
	var(n,m,a,b)=readLine()!!.split(' ').map{it.toInt()}
	var s1=((n/m)*b)+((n%m)*a)
	var s2= (n/m+1)*b
	var s3= n*a
	println(minOf(s1,s2,s3))	
}