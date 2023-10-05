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
        Iterator<Integer> it;
        it = set.iterator();

        System.out.print("set (no duplicates): ");
//        for (Integer temp : set) {
//            System.out.print(temp+" ");
//        }
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        System.out.println("Multiplicity of each number in the list.");
        it = list.iterator();
        Map<Integer,Integer> map = new HashMap<>();
//        for (Integer temp : list) {
//            map.put(temp,map.getOrDefault(temp,0)+1);
//        }
        while (it.hasNext()) {
            int key = it.next();
            map.put(key,map.getOrDefault(key,0)+1);
        }






        Set<Integer> keyset = map.keySet();//맵의key셋
        it = keyset.iterator();
        Integer key;
        while(it.hasNext()) { //맵 풀력
            key = it.next();
            System.out.println(key + ":" + map.get(key));
        }


//        for (Integer key2 : map.keySet()) {
//            System.out.println(key2 + ":" + map.get(key2));
//        }

        int[] arr = new int[n+1]; //각자의 도수 분포표를 표시
        int maxindex =-1;
        for (Integer temp : map.keySet()) {
            maxindex= Math.max(maxindex,map.get(temp));
            arr[map.get(temp)]++;
        }
        System.out.println("Multiplicity frequency");
        for (int i = 1; i <=maxindex; i++) {
            System.out.println(i+": "+arr[i]);
        }

    }
}
