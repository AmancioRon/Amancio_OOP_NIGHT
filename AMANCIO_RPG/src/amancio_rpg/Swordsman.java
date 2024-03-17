
package amancio_rpg;

public class Swordsman extends Character {
    
    public Swordsman(int health, int damage, int shield) {
        super (health, damage, shield);
    }
    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }
}
