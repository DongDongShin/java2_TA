package w5;

import java.util.*;

public class CollectionsExercise  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed how many, max: ");
        long seed = sc.nextLong();
        Random random = new Random(seed);
        int n = sc.nextInt();
        int max = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(max));
        }
        System.out.print("list: ");
        for (Integer temp : list) {
            System.out.print(temp+" ");

        }
        System.out.println();
        Collections.sort(list);
        System.out.print("sorted list: ");
        for (Integer temp : list) {
            System.out.print(temp+" ");

        }
        System.out.println();
        Set<Integer> set = new HashSet<>(list);
        System.out.print("set (no duplicates): ");
        for (Integer temp : set) {
            System.out.print(temp+" ");
        }
        System.out.println();
        System.out.println("Multiplicity of each number in the list.");
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer temp : list) {
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int[] arr = new int[n+1];
        int maxindex =-1;

        for (Integer temp : map.keySet()) {
            System.out.println(temp+":"+map.get(temp));
            maxindex= Math.max(maxindex,map.get(temp));
            arr[map.get(temp)]++;
        }
        System.out.println("Multiplicity frequency");
        for (int i = 1; i <=maxindex; i++) {
            System.out.println(i+": "+arr[i]);
        }

    }
}
