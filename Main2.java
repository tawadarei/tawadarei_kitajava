
    class Animal {
        public String Name;
        public int Age;
    
        public void ShowProfile() {
            System.out.println("名前は" + Name + "、" + Age +"歳です。");
        }
    }
    
    class Cat extends Animal {
        public void Sleep () {
            System.out.println("スースー");
        }
    }

    class Dog extends Animal {
        public void Run() {
            System.out.println("トコトコ");
        }
    }
public class Main2 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.Name = "ミッキー";
        c.Age = 1;
        c.ShowProfile();
        c.Sleep();

        Dog d = new Dog();
        d.Name = "レオ";
        d.Age = 4;
        d.ShowProfile();
        d.Run(); 
    }
    }

