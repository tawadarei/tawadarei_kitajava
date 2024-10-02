public class Dog3 {
    private String Name;
    private int Age;

    public void SetAge(int age) {
        Age = age;
    }
    public void SetName(String nm) {
        Name = nm;
    }
    public void ShowProfile() {
        System.out.println("名前は、" + Name + "です");
        System.out.println("年齢は、" + Age + "です");
    }
public static void main(String[] args) {
    Dog3 d = new Dog3();
    d.SetName("しろ");
    d.SetAge(2);
    d.ShowProfile();
}
}
