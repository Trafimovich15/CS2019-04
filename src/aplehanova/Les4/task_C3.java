package aplehanova.Les4;

import java.util.Locale;
import com.ibm.icu.text.RuleBasedNumberFormat;

public class task_C3 {
    public static void main(String[] args) {
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);

        for(int x=1; x<=10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println(nf.format(x) + " умноженое на " + nf.format(y) + " равно " + nf.format(x * y));
            }

            System.out.println();
        }


    }
}
