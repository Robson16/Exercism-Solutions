import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = this.ability(this.rollDice());
        this.dexterity = this.ability(this.rollDice());
        this.constitution = this.ability(this.rollDice());
        this.intelligence = this.ability(this.rollDice());
        this.wisdom = this.ability(this.rollDice());
        this.charisma = this.ability(this.rollDice());
        this.hitpoints = 10 + this.modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> diceRolls = new ArrayList<>(scores);

        diceRolls.sort(null);

        return diceRolls.get(1) + diceRolls.get(2) + diceRolls.get(3);
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1);
        }

        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
