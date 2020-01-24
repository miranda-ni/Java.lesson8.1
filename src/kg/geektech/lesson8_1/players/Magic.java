package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Magic extends Hero {
    private int inCreaseDamage;

    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }


    public int getInCreaseDamage() {
        return inCreaseDamage;
    }

    public void setInCreaseDamage() {
        this.inCreaseDamage = new Random().nextInt(20) +5;
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < 4; i++) {
            if (heroes[i].getDamage()>0) {
                setInCreaseDamage ();
                heroes[i].setDamage(heroes[i].getDamage()+getInCreaseDamage());
                System.out.println(" Увеличить атаку " + heroes[i].getClass().getSimpleName() + " " + getInCreaseDamage() );
            }
        }

        }





}
