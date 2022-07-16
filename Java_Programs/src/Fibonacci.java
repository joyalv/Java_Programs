public class Fibonacci
{
     
static void nearestFibonacci(int num)
{
	int ans; 
    if (num == 0)
    {
        System.out.print(0);
        return;
    }
 
    int f0 = 0,f1 = 1;
 
    int nextFibNum = f0 + f1;
    while (nextFibNum <= num)
    {
         f0 = f1;
         f1 = nextFibNum;
         nextFibNum = f0 + f1;
    }
 
   if((Math.abs(nextFibNum - num) >= Math.abs(f1 - num)))
	   {
	   ans=f1;
	   }
   else
   {
	   ans=nextFibNum;
   }
    
      System.out.print(ans);
}
 
public static void main (String[] args)
{
    int N = 16;
     
    nearestFibonacci(N);
}
}

