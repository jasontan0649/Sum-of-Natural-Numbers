class Main {
    public static int sumOfNaturalNumsON(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++)
            sum += i;
        return sum;
    }
    
    public static int sumOfNaturalNumsO1(int begin, int end) {
        //Sum of AP with simplified formula to prevent conversion loss
        return (end * (end + 1) - begin * (begin - 1)) / 2;
    }
    
    
    
    public static void main(String[] args) {
        int answerON = sumOfNaturalNumsON(5, 100);
        System.out.println("Answer for O(n) Algo: " + answerON);
        
        int answerO1 = sumOfNaturalNumsO1(5, 100);
        System.out.println("Answer for O(1) Algo: " + answerO1);
    }
}