public class Dog4 {
    public static void main(String[] args) {
        Dog d = new Dog("トイプードル");
        d.SetName("レオ");
        d.SetAge(3);
        
        d.ShowProfile();
    }
}
class Dog {
    private String Name;
    private int Age;
    private String Kind;

    public Dog (String kind) {this.Kind = kind;}
    public void SetName( String nm ) {Name = nm;}
    public void SetAge(int age) {this.Age = age;}

    public void ShowProfile() {
        System.out.println("犬種は" + Kind + "名前は、" + Name + "年齢は" + Age + "です。" );
    }
}