class Main{
  
  //Car
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.AddDoors();
     myCar.AddDoors();
     myCar.AddDoors();
     myCar.AddDoors();
    System.out.println(myCar.doors);
    }

  public static int sum(int a, int b, int c){
   return a + b + c;
  }
 
}

class Car {
  public int doors = 0;
  
public void AddDoors(){
  this.doors++;
}


  
}