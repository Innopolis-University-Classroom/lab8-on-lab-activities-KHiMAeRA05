package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
 interface Operation {
   double calculate();
 }
 class Add implements Operation{
   private double left;
   private double right;
   
   Add(double left, double right){
      this.left = left;
      this.right = right;
   }
  
   @Override
   public double calculate(double left, double right){
      return left + right;
   };
 }
 class Substract implements Operation{
   private double left;
   private double right;
  
   Substract(double left, double right){
      this.left = left;
      this.right = right;
   }
  
   @Override
   public double calculate(double left, double right){
      return left - right;
   };
 }
 class Divide implements Operation{
   private double left;
   private double right;
  
   Divide(double left, double right){
      this.left = left;
      this.right = right;
   }
  
   @Override
   public double calculate(double left, double right){
      return left / right;
   };
 }
 class Multiplication implements Operation{
   private double left;
   private double right;
  
   Multiplication(double left, double right){
      this.left = left;
      this.right = right;
   }
  
   @Override
   public double calculate(double left, double right){
      return left * right;
   };
 }
 class CalculatorCorrect {
    public  double calculate(Operation operation) {
        return operation.calculate(left, right);
    }

    public static void main(String[] args) {
        CalculatorCorrect calculator = new CalculatorCorrect();
        calculator.calculate(new Add());
        calculator.calculate(new Add());

    }

}


