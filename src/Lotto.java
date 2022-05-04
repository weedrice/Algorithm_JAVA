import java.util.Random;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
        int count = 0;
        while(count < 5) {
            TreeSet<Integer> lotto = new TreeSet<>();
            Random r = new Random();

            while(lotto.size() < 6) {
                lotto.add(r.nextInt(45) + 1);
            }
            int hap = 0;
            for (Integer i : lotto) {
                hap += i;
            }
            if(hap >= 100 && hap <= 170) {
                System.out.println("lotto = " + lotto);
                count++;
            }
        }
    }
}
