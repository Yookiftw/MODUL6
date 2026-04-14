package game;
//Soal 1
public class Hero {
    private String name;
    private double health, attackPower;

    public Hero(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {return name;}
    public double getHealth() {return health;}
    public double getAttackPower() {return attackPower;}

    public void setName(String name) {this.name = name;}
    public void setHealth(double health) {this.health = health;}
    public void setAttackPower(double attackPower) {this.attackPower = attackPower;}

//Soal 2
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower); 
    }

    public void training(){
        this.attackPower += 10;
        System.out.println("This hero is in training.");
    }

    public void takenHit(double damage){
        this.health -= damage;
        System.out.println(damage);
    }

}
