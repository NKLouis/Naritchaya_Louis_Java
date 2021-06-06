package com.company;

public class App {
    public static void main(String[] args) {

        // Farmer Properties
        Farmer farmer = new Farmer();

        System.out.println("---Farmer Properties---");
        farmer.setName("Farmer");
        farmer.setStrength("Strength (initial value = 75)");
        farmer.setHealth("Health (initial value = 100)");
        farmer.setStamina("Stamina (initial value = 75)");
        farmer.setSpeed("Speed (initial value = 10)");
        farmer.setAttackPower("AttackPower (initial value = 1)");
        //Farmer Abilities
        System.out.println("---Farmer Abilities---");
        String farmerRun = farmer.getRun();
        String farmerPlow = farmer.getPlow();
        String farmerHarvest = farmer.getHarvest();
        String farmerAttack = farmer.getAttack();
        String farmerHeal = farmer.getHeal();
        String farmerDecreaseHealth = farmer.getDecreaseHealth();
        String farmerIncreaseStamina= farmer.getIncreaseStamina();
        String farmerDecreaseStamina = farmer.getDecreaseStamina();
        System.out.println(farmerRun);
        System.out.println(farmerPlow);
        System.out.println(farmerHarvest);
        System.out.println(farmerAttack);
        System.out.println(farmerHeal);
        System.out.println(farmerDecreaseHealth);
        System.out.println(farmerIncreaseStamina);
        System.out.println(farmerDecreaseStamina);

        System.out.println("");
        System.out.println("");

        // Constable Properties
        Constable constable = new Constable();

        System.out.println("---Constable Properties---");
        constable.setName("Constable");
        constable.setStrength("Strength (initial value = 60)");
        constable.setHealth("Health (initial value = 100)");
        constable.setStamina("Stamina (initial value = 60)");
        constable.setSpeed("Speed (initial value = 20)");
        constable.setAttackPower("AttackPower (initial value = 5)");
        constable.setJurisdiction("jurisdiction");
        //Constable Abilities
        System.out.println("---Constable Abilities---");
        String constableRun = constable.getRun();
        String constableArrest = constable.getArrest();
        String constableAttack = constable.getAttack();
        String constableHeal = constable.getHeal();
        String constableDecreaseHealth = constable.getDecreaseHealth();
        String constableIncreaseStamina= constable.getIncreaseStamina();
        String constableDecreaseStamina = constable.getDecreaseStamina();
        System.out.println(constableRun);
        System.out.println(constableArrest);
        System.out.println(constableAttack);
        System.out.println(constableHeal);
        System.out.println(constableDecreaseHealth);
        System.out.println(constableIncreaseStamina);
        System.out.println(constableDecreaseStamina);

        System.out.println("");
        System.out.println("");

        // Warrior Properties
        Warrior warrior = new Warrior();

        System.out.println("---Warrior Properties---");
        warrior.setName("Warrior");
        warrior.setStrength("Strength (initial value = 75)");
        warrior.setStrength("Health (initial value = 100)");
        warrior.setStrength("Stamina (initial value = 100)");
        warrior.setStrength("Speed (initial value = 50)");
        warrior.setStrength("AttackPower (initial value = 10)");
        warrior.setShieldStrength("ShieldStrength (initial value = 100)");
        //Warrior Abilities
        System.out.println("---Warrior Abilities---");
        String warriorRun = warrior.getRun();
        String warriorAttack = warrior.getAttack();
        String warriorHeal = warrior.getHeal();
        String warriorDecreaseHealth = warrior.getDecreaseHealth();
        String warriorIncreaseStamina= warrior.getIncreaseStamina();
        String warriorDecreaseStamina = warrior.getDecreaseStamina();
        String warriorDecreaseShieldStrength = warrior.getDecreaseShieldStrength();
        System.out.println(warriorRun);
        System.out.println(warriorAttack);
        System.out.println(warriorHeal);
        System.out.println(warriorDecreaseHealth);
        System.out.println(warriorIncreaseStamina);
        System.out.println(warriorDecreaseStamina);
        System.out.println(warriorDecreaseShieldStrength);

    }
}
