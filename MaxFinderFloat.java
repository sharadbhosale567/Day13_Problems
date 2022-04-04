package day13generic;

public class MaxFinderFloat {
    public static Float findMax1(Float number1, Float number2, Float number3) {
        Float max= number1;
        if (max < number2){
            max=number2;
        }
        if(max < number3){
            max=number3;
        }
        return max;
    }
}
