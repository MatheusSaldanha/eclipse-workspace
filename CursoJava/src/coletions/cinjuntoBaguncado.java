package coletions;

import java.util.HashSet;

public class cinjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto =new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Text");
        conjunto.add(1);

        
        System.out.println("Tamanhao é "+ conjunto.size());

        System.out.println(conjunto.remove("Text"));
        
        System.out.println("Tamanhao é "+ conjunto.size());

        System.out.println(conjunto.contains(1.2));

        HashSet nums =  new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums);

        System.out.println(conjunto);

    }
}
