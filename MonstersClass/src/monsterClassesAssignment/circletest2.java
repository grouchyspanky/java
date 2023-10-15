package monsterClassesAssignment;

class MonsterAttack {
    private String monsterName;
    private String attackLocation;
    private double damagesInMillionUSD;
    private String dateOfAttack;

    MonsterAttack(String monsterName, String attackLocation, double damageInMillionUSD, String dateOfAttack) {
        this.monsterName = monsterName;
        this.attackLocation = attackLocation;
        this.damagesInMillionUSD = damageInMillionUSD;
        this.dateOfAttack = dateOfAttack;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public void setAttackLocation(String attackLocation) {
        this.attackLocation = attackLocation;
    }

    public void setDamagesInMillionUSD(double damagesInMillionUSD) {
        this.damagesInMillionUSD = damagesInMillionUSD;
    }

    public void setDateOfAttack(String dateOfAttack) {
        this.dateOfAttack = dateOfAttack;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public String getAttackLocation() {
        return attackLocation;
    }

    public double getDamagesInMillionUSD() {
        return damagesInMillionUSD;
    }

    public String getDateOfAttack() {
        return dateOfAttack;
    }

    
    public String toString() {
        return "Monster's Name: " + monsterName + "\n" +
                "Attack Location: " + attackLocation + "\n" +
                "Damage In Million USD: " + damagesInMillionUSD + "\n" +
                "Date Of Attack: " + dateOfAttack + "\n";
    }
}



