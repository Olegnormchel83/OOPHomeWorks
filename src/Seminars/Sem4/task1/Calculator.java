package Seminars.Sem4.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Calculator {
    public double sum(List<? extends Number> numbers) {
        double s = 0;
        for (Number number : numbers) {
            s += number.doubleValue();
        }
        return s;
    }

    public double composition(Number a, Number b) {
        return (double) Math.round(a.doubleValue() * b.doubleValue() * 100) / 100;
    }

    public double division(Number a, Number b) {
        return (double) Math.round((a.doubleValue() / b.doubleValue()) * 100) / 100;
    }

    public String binaryValue(Object number) {
        StringBuilder sb = new StringBuilder();
        int parsedNum = 0;
        if (number.getClass().equals(String.class)) {
            parsedNum = Integer.parseInt(number.toString());
        }

        if (number.getClass().equals(Integer.class)
                || number.getClass().equals(Double.class)
                || number.getClass().equals(Float.class)) {
            parsedNum = ((Number) number).intValue();
        }

        if (parsedNum <= 0) {
            return "0";
        } else {
            binaryTranslation(parsedNum, sb);
            return sb.reverse().toString();
        }
    }

    private void binaryTranslation(Integer num, StringBuilder sb) {
        while (num != 0) {
            sb.append(num % 2);
            num /= 2;
        }
    }
}
