// Solving problem 3 on project euler

public class LargestPrimeFactor{
  public static void main(String[] args){
    System.out.println(getLargestPrimeFactor(600851475143l));

    // Below can be uncommented to see how fast the program runs

    // final long a = System.nanoTime();
    // getLargestPrimeFactor(600851475143l);
    // final long b = System.nanoTime();
    // System.out.println((b-a) / 1e6);
  }

  public static long getLargestPrimeFactor(long number){
    for (int i=(int)Math.sqrt(number); i > 1; i--){
      if (number % i == 0.0 && isPrime(i)){
        return i;
      }
    }
    return 0;
  }

  public static boolean isPrime(int n) {
    //check if n is a multiple of 2
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
}
