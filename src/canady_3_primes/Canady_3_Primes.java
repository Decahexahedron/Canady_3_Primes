package canady_3_primes;

public class Canady_3_Primes {

    public static void main(String[] args) {
    int x = 0;
          for(int i=0; i<100; i++){
               if(isPrime(i)==true){
                   System.out.println(i);
               }
            }
        }

static boolean isEven(int number){
    return (number % 2 == 0);
}

static boolean isOdd(int number){
    return (number % 2 != 0);
}

static boolean isPrime(int number){
    boolean prime = true;
    int divisors = 0;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                divisors = divisors + 1;
            }
            if(divisors > 0){
                return false;
            }
            else {
                return true;
            }
        }
    return prime;
}



}

/*-
What is a Method?
A method is a function
Like a little program, it can communicate
with the rest of the program, by returning values
like finding a square root, something
you want to do again and again
*/
