class Car
{
   int model;
   String make;
   private int speed=0;
   
   public Car()
   {}
   
   public Car(int x, String y)
   {
      model=x;
      make=y;
      //speed=z;
   }
   
   public int getModel()
   {
      return model;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   public void accelerate()
   {
      speed=speed+5;
      // return // peed;
   }
   
      
   public void brake()
   {
      speed=speed-5;
      
   }
   
}

class lab1b
{
   public static void main(String args[])
   {
      
      Car obj = new Car(2022, "VW");
      
      obj.accelerate();
      System.out.println("Speed:\t"+obj.getSpeed());
      obj.accelerate();
      System.out.println("Speed:\t"+obj.getSpeed());
      obj.accelerate();
      System.out.println("Speed:\t"+obj.getSpeed());
      obj.accelerate();
      System.out.println("Speed:\t"+obj.getSpeed());
      obj.accelerate();
      System.out.println("Speed:\t"+obj.getSpeed());
      
      obj.brake();
      System.out.println("Speed:\t"+obj.getSpeed()); 
            
      obj.brake();
      System.out.println("Speed:\t"+obj.getSpeed());
            
      obj.brake();
      System.out.println("Speed:\t"+obj.getSpeed());
            
      obj.brake();
      System.out.println("Speed:\t"+obj.getSpeed());
            
      obj.brake();
      System.out.println("Speed:\t"+obj.getSpeed());
      
   }
}