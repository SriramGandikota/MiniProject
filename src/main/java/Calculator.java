public class Calculator {
    public float SquareRoot(int x){
        return (float)Math.sqrt(x);
    }
    public int Factorial(int x){
        if(x==1)return 1;
        return x*Factorial(x-1);
    }
    public float NaturalLog(int x){
        return (float)Math.log(x);
    }
    public float PoW(int x,int y) {
        return (float)Math.pow((double) x, (double) y);
    }
}
