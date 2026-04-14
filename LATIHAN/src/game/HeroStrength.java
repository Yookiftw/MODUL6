package game;

//Soal 3
public class HeroStrength extends Hero {
    private String build = "Strength";
    public HeroStrength(String name, double health, double attackPower) {
        super(name, health, attackPower);
    }
//Soal 4
    @Override
    public void display() {
        super.display();
        System.out.println("Build: " + build);
    }
    @Override
    public void takenHit(double damage){
        takenHit(damage);
        setHealth(getHealth() - (damage / 2));
    }
}
