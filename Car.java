class Vehicle {
  private int wheels = 4;
  private int doors = 4;
  private int seats = 5;
  private int maxSpeed;

  public int getmaxSpeed(){  
    return this.maxSpeed;  
  }

  public void setmaxSpeed(int maxSpeed){  
    this.maxSpeed = maxSpeed;
  }

  protected void run() {
    for(int i = 1; i<= 20; i++) {
      System.out.println(this.maxSpeed);
    }
  }

  protected void info() {
    System.out.println(String.format("wheel = %s", this.wheels));
    System.out.println(String.format("doors = %s", this.doors));
    System.out.println(String.format("maxSpeed = %s", this.maxSpeed));
  }
}

class Car extends Vehicle {

  public static void main(String[] args) {
    Car Toyota = new Car();
    Car BMW = new Car();
    Toyota.setmaxSpeed(100);
    Toyota.run();
    BMW.setmaxSpeed(200);
    BMW.run();
  }
}
