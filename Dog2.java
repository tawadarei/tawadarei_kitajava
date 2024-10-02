public class Dog2 {
    private String Name;
    private int age;

    public void SetAge(int age) {
   
    }
    public void SetName(String nm) {
        Name = nm;
    }
    public void ShowProfile() {
        System.out.println("名前は、" + Name + "です");
        System.out.println("年齢は、" + age + "です");
    }
public static void main(String[] args) {
    Dog2 d = new Dog2();
    d.SetName("しろ");
    d.SetAge(2);
    d.ShowProfile();
}
}
