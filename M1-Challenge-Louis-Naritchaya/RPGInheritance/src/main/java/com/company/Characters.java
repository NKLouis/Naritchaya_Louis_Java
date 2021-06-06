package com.company;

public class Characters {
        //Properties
        String name;
        String strength;
        String health;
        String stamina;
        String speed;
        String attackPower;

        // Abilities
        String run;
        String attack;
        String heal;
        String decreaseHealth;
        String increaseStamina;
        String decreaseStamina;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
                System.out.println(name);
        }

        public String getStrength() {
                return strength;
        }

        public void setStrength(String strength) {
                this.strength = strength;
                System.out.println(strength);
        }

        public String getHealth() {
                return health;
        }

        public void setHealth(String health) {
                this.health = health;
                System.out.println(health);
        }

        public String getStamina() {
                return stamina;
        }

        public void setStamina(String stamina) {
                this.stamina = stamina;
                System.out.println(stamina);
        }

        public String getSpeed() {
                return speed;
        }

        public void setSpeed(String speed) {
                this.speed = speed;
                System.out.println(speed);
        }

        public String getAttackPower() {
                return attackPower;
        }

        public void setAttackPower(String attackPower) {
                this.attackPower = attackPower;
                System.out.println(attackPower);
        }
        /////////////////////////////////////////////////////////////////////////////////
        public String getRun() {
                String run = "run";
                return run;
        }

        public void setRun(String run) {
                this.run = run;
                System.out.println(run);
        }

        public String getAttack() {
                String attack = "attack";
                return attack;
        }

        public void setAttack(String attack) {
                this.attack = attack;
        }

        public String getHeal() {
                String heal = "heal";
                return heal;
        }

        public void setHeal(String heal) {
                this.heal = heal;
        }

        public String getDecreaseHealth() {
                String decreaseHealth = "decreaseHealth";
                return decreaseHealth;
        }

        public void setDecreaseHealth(String decreaseHealth) {
                this.decreaseHealth = decreaseHealth;
        }

        public String getIncreaseStamina() {
                String increaseStamina = "increaseStamina";
                return increaseStamina;
        }

        public void setIncreaseStamina(String increaseStamina) {
                this.increaseStamina = increaseStamina;
        }

        public String getDecreaseStamina() {
                String decreaseStamina = "decreaseStamina";
                return decreaseStamina;
        }

        public void setDecreaseStamina(String decreaseStamina) {
                this.decreaseStamina = decreaseStamina;
        }
}







