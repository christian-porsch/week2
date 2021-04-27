public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubstractionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    public double getDivisionalResult(){

        if (secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }
}