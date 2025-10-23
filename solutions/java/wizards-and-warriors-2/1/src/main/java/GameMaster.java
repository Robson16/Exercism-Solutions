public class GameMaster {

    public String describe(Character character) {
        return String.format(
                "You're a level %d %s with %d hit points.",
                character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints()
        );
    }

    public String describe(Destination destination) {
        return String.format(
                "You've arrived at %s, which has %d inhabitants.",
                destination.getName(),
                destination.getInhabitants()
        );
    }

    public String describe(TravelMethod travelMethod) {
        String how;

        switch (travelMethod) {
            case WALKING:
                how = "by walking.";
                break;
            case HORSEBACK:
                how = "on horseback.";
                break;
            default:
                return "You are not traveling.";
        }

        return String.format("You're traveling to your destination %s", how);
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return String.format("%s %s %s", describe(character), describe(travelMethod), describe(destination));
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
