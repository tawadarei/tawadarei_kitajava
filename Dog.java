public class Dog {

    private String Name;
    public void SetName (String nm) {
       this.Name = nm;
    }
    public void ShowProfile() {
        System.out.println("名前は、" + Name + "です");

    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.SetName("レオ");
        d.ShowProfile();
    } 
}


