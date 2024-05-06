
public class Romano {
    private String romanicNumber;

    public Romano(String number) {
        this.romanicNumber = number.toUpperCase();
        }


        public int toArabic() {
        int result = 0;
        for (int i = 0 ;i < romanicNumber.length()-1; i++) {
            char actualNumber = romanicNumber.charAt(i);
            char nextNumber = romanicNumber.charAt(i + 1);
            if (getNumberRomanic(actualNumber) >= getNumberRomanic(nextNumber)) {
            result += getNumberRomanic(actualNumber);
            } else {
            result -= getNumberRomanic(actualNumber);
            }
        }
        result += getNumberRomanic(romanicNumber.charAt(romanicNumber.length()-1));
        return result;
        }

        public int getNumberRomanic(char number) {
        if (number == 'V') {
            return 5;
        } else if (number == 'X') {
            return 10;
        } else if (number == 'L') {
            return 50;
        } else if (number == 'C') {
            return 100;
        } else if (number == 'D') {
            return 500;
        } else if (number == 'M') {
            return 1000;
        }
        return 1;
    }
}