package Polymorphism;

class Character{
    public void attack(){
        System.out.println("Attack the enemy");
    }
}

class Warrior extends Character{
    @Override
    public void attack(){
        System.out.println("Warrior attack with his hammer and sword.");
    }
}
class Mage extends Character{
    @Override
    public void attack(){
        System.out.println("Mage attack with his fire and water power.");
    }
}


public class Game {
    public static void main(String[]args){
        Warrior warrior=new Warrior();
        warrior.attack();
        Mage mage=new Mage();
        mage.attack();
    }
}
