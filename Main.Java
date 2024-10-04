public class Main{

class Animal {
    public String Name;
    public int Age;

    public void ShowProfile() {
        System.out.println("名前は" + Name + "、" + Age +"歳です。");
    }
}

public class Cat extends Animal {
    public void Sleep () {
        System.out.println("スースー");
    }
}

public static void main(String[] args) {
    Cat c = new Cat();
    c.Name = "ミッキー";
    c.Age = 1;
    c.ShowProfile();
    c.Sleep();
}
}
