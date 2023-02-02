package abstractic;

interface Animal {
    public void makeSound();
  }
  
  abstract class Mammal implements Animal {
    protected String name;
  
    public Mammal(String name) {
      this.name = name;
    }
  
    public abstract void move();
  }
  
  class Dog extends Mammal {
    public Dog(String name) {
      super(name);
    }
  
    @Override
    public void makeSound() {
      System.out.println(name + " barks");
    }
  
    @Override
    public void move() {
      System.out.println(name + " runs");
    }
  }
  
  class Cat extends Mammal {
    public Cat(String name) {
      super(name);
    }
  
    @Override
    public void makeSound() {
      System.out.println(name + " meows");
    }
  
    @Override
    public void move() {
      System.out.println(name + " walks");
    }
  }
  
 
