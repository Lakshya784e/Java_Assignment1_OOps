class Ourclass{
    String name;
    public Ourclass(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(name);
    }
}
public class ques32 {
    public static void main(String[] args) {
        Ourclass o = new Ourclass("Raghav");
        o.display();
    }
}
