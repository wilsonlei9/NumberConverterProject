public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        String s = "";
        int decimal = 0;
        if (base == 2)
        {
            for (int i = 0; i < digits.length; i++)
            {
                double power = (digits.length - 1) - i;
                decimal += digits[i] * Math.pow(2, power);
            }
            s = "Decimal: ";
        }

        if (base == 8)
        {
            for (int i = 0; i < digits.length; i++)
            {
                double power = (digits.length - 1) - i;
                decimal += digits[i] * Math.pow(8, power);
            }
            s = "Decimal: ";
        }
        System.out.print(s);
        return decimal;
    }

    public int[] convertToBinary() {
        return null;
    }

    public int[] convertToOctal() {
        return null;
    }
}
