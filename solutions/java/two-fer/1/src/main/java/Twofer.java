public class Twofer {
    public String twofer(String name) {
        String oneFor = (name != null) ? name : "you";

        return "One for " + oneFor + ", one for me.";
    }
}
