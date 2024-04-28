interface Character{
    abstract void attack();
}
interface Weapon{
    abstract void use();
}
class Warrior implements Character, Weapon{
    public void attack(){
        System.out.println("Warrior attacks with a sword");
    }
    public void use(){
        System.out.println("Warrior uses a sword");
    }
}
public class multiple{
    public static void main(String args[]){
        Warrior w = new Warrior();
        w.attack();
        w.use();
    }
}