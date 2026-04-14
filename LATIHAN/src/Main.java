import game.Hero;
import game.HeroStrength;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new HeroStrength("Vader", 100, 100);
        Hero hero2 = new HeroStrength("Lancelot", 100, 250);

        hero1.display();
        hero2.display();

        hero1.training();
        hero2.training();

        hero1.takenHit(50);
        hero2.takenHit(50);

        hero1.display();
        hero2.display();
    }    
}
