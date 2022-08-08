package learnprogramming.academy;

public class SimpleCalculator {

        // write your code here
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }
        public void setFirstNumber(double f){
            this.firstNumber=f;
        }
        public double getSecondNumber(){
            return this.secondNumber;
        }
        public void setSecondNumber(double f){
            this.secondNumber=f;
        }
        public double getAdditionResult(){
            return this.firstNumber+ this.secondNumber;
        }
        public double getSubtractionResult(){
            return firstNumber- secondNumber;
        }
        public double getMultiplicationResult(){
            return this.firstNumber* this.secondNumber;
        }
        public double getDivisionResult(){
            if(this.secondNumber==0)
                return 0;
            return this.firstNumber/ this.secondNumber;
        }

}
