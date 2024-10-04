
class Animal {
    public String Name;
    public int Age;

    public void ShowProfile() {
        System.out.println("名前は" + Name + "、" + Age +"歳です。");
    }
    public void Speak(){
        System.out.println("....");
    }
    
}

class Cat extends Animal {
    public void Speak() {
        System.out.println("ニャー");
    }
    public void Sleep () {
        System.out.println("スースー");
    }
}

class Dog extends Animal {
    public void Speak() {
        System.out.println("ワンワン");
    }
    public void Run() {
        System.out.println("トコトコ");
    }
}
public class Main4 {

public static void main(String[] args) {
    Animal[] animal = new Animal[4];
    animal[0] = new Cat();
    animal[1] = new Dog();
    animal[2] = new Cat();
    animal[3] = new Dog();
    for (Animal x: animal) {
       x.Speak(); 
    }
}
}