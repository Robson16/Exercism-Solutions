import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean theyHaveNewCard = !myCollection.containsAll(theirCollection);
        boolean iHaveNewCard = !theirCollection.containsAll(myCollection);

        return theyHaveNewCard && iHaveNewCard;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> commonItems = new HashSet<>(collections.getFirst());

        for (Set<String> collection : collections) {
            commonItems.retainAll(collection);
        }

        return commonItems;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allUniqueCards = new HashSet<>();

        for (Set<String> collection : collections) {
            allUniqueCards.addAll(collection);
        }

        return allUniqueCards;
    }
}
