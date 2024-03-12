
package amancio_rpg;

public class Paladin extends Swordsman{
   
    private boolean hasRessurected;
    private int health, damage, shield;
   
    
    public Paladin(int health, int damage, int shield)
    {
        super(health, damage, shield);
        
        this.health = health;
        this.damage = damage;
        this.shield = shield;
        hasRessurected = false;
    }
    @Override
   public void receiveDamage(int damage)
   {
       if (damage%2==0)
       {
           damage/=2;
           damage -= shield;
           health -= damage;
           if (health <= 0) {
               resurrect();
           }
           
       }
   }
       public void resurrect(){
           if (hasRessurected == false) {
           hasRessurected = true;
           health = 100;
       }
       }

    
}
