class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                outputString.append('_');
            } else if (currentChar == '-') {
                if (i + 1 < identifier.length()) {
                    outputString.append(Character.toUpperCase(identifier.charAt(i + 1)));
                    i++;
                }
            } else if(Character.isDigit(currentChar)) {
                switch (currentChar) {
                    case '4': 
                        outputString.append('a');
                        break;
                    case '3': 
                        outputString.append('e');
                        break;
                    case '0':
                        outputString.append('o');
                        break;
                    case '1':
                        outputString.append('l');
                        break;
                    case '7':
                        outputString.append('t');
                        break;
                }
            } else if (Character.isLetter(currentChar)) {
                outputString.append(currentChar);
            }
        }

        return outputString.toString();
    }
}
