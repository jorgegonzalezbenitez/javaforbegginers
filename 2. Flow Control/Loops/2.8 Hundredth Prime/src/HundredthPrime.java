public class HundredthPrime {
   public static void main(String[] args) {
      int cuenta = 0;
      int numero = 2;
      while (cuenta < 100) {
         if (isPrime(numero)) {
            cuenta++;
            if (cuenta == 100) {
               System.out.println( numero);
            }
         }
         numero++;
      }
   }
   public static boolean isPrime(int n) {
      if (n <= 1) {
         return false;
      }
      if (n <= 3) {
         return true;
      }
      if (n % 2 == 0 || n % 3 == 0) {
         return false;
      }
      for (int i = 5; i * i <= n; i += 6) {
         if (n % i == 0 || n % (i + 2) == 0) {
            return false;
         }
      }
      return true;
   }
}