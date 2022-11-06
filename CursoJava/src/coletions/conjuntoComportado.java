package coletions;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
    public static void main(String[] args) {
      //  Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<>();
        lista.add("Matheus");
        lista.add("Jerusa");
        lista.add("Reinaldo");

        for(String nomes: lista){
            System.out.println(nomes);
        }
        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(4);
        nums.add(80);
        nums.add(10);

        for(int n: nums){
            System.out.println(n);
        }

    }
}
