package classes;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Dice{

    private LongAdder[] result = {
            new LongAdder(),
            new LongAdder(),
            new LongAdder(),
            new LongAdder(),
            new LongAdder(),
            new LongAdder()
    };

    @Override
    public String toString() {
        String s = "";
        int total = 0;
        for (int i = 0; i < result.length; i++) {
            s += String.format("Numero %d: %d veces\n", i+1, result[i].longValue());
            total += result[i].longValue();
        }

        s += String.format("Total de veces: %d + %d + %d + %d + %d + %d = %d\n", result[0].longValue(), result[1].longValue(),
                result[2].longValue(), result[3].longValue(), result[4].longValue(), result[5].longValue(), total);

        return s;
    }

    public void throwDice(int number){
        result[number-1].add(1);

        System.out.println("Se ha lanzado el número " + number);


    }
}
