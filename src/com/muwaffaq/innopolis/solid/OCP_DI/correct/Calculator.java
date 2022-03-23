package com.muwaffaq.innopolis.solid.OCP_DI.correct;

interface Operation {
    double calculate();
}
class Add implements Operation{
    private final double left;
    private final double right;
    
    Add(double left, double right){
      this.left = left;
      this.right = right;
    }

    @Override
    public double calculate(){
      return left + right;
    }

}
class Substract implements Operation{
    private final double left;
    private final double right;
    
    Substract(double left, double right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(){
        return left - right;
    }
}
class Divide implements Operation{
    private final double left;
    private final double right;
    
    Divide(double left, double right){
        this.left = left;
        this.right = right;
    }
    
    @Override
    public double calculate(){
        return left - right;
    }
}
class Multiplication implements Operation{
    private final double left;
    private final double right;
    
    Multiplication(double left, double right){
        this.left = left;
        this.right = right;
    }
    
    @Override
    public double calculate(){
        return left - right;
    }
}
class CalculatorCorrect {
    public double calculate(Operation operation) {
        return operation.calculate();
    }
    
    public static void main(String[] args) {
        CalculatorCorrect calculator = new CalculatorCorrect();
        calculator.calculate(new Add(5, 6));
        calculator.calculate(new Add(7, 8));
    
    }

}
