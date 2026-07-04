class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int totalDigits = String.valueOf(Math.abs(numberToCheck)).length();
        int sum = 0;
        int number = Math.abs(numberToCheck);

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit,  totalDigits);
            number /= 10;
        }

        return sum == numberToCheck;
    }

}
