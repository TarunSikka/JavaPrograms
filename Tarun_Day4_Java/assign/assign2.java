class assign2 {

   static long sum=0;
    static void printPrimeNos(int N){

        int number = 2;
        int primeCount = 0;
        
        while(primeCount< N){
            if(isPrime(number)){
                System.out.print(number + " ");
                primeCount++;
                sum+=number;
            }
            number++;
        }
    }

    static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 100;
        printPrimeNos(N);
        System.out.println("\n Sum= "+sum);
        
    }
}