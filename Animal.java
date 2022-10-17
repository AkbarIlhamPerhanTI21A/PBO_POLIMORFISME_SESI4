
/**
 * PBO Sesi 4
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 * Poliforfisme Overriding 
 */

package PBO;

   class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}