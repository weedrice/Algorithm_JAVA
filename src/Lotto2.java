import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto2 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            List<Integer> balls = new ArrayList<>();
            for(int i=1;i<=45;i++) {
                balls.add(i);
            }
            Collections.shuffle(balls);
            List<Integer> lotto = balls.subList(0, 6);
            Collections.sort(lotto);
            int hap = 0;
            for(Integer i : lotto) {
                hap += i;
            }
            if(hap >= 100 && hap <= 170) {
                System.out.println("lotto = " + lotto);
                System.out.println("hap = " + hap);
                count++;
            }
        }
    }
}
