package w5;

import java.text.CollationElementIterator;
import java.util.*;

public class SpecialNumberGenerator2 {


    public List<Long> getPrimes(int n) {
        List<Long> list = new ArrayList<>();
        list.add(2L);
        while (list.size() != n) {
            list.add(getNextPrime(list));
        }
        return list;

    }


    public long getNextPrime(List<Long> primes) {
        Long temp = primes.get(primes.size()-1);//마지막 인덱스에 있는 값

        boolean find = false;
        while (!find) {
            temp= temp+1L;//일단 더해 줌.
            int i;
            for (i = 0;i< primes.size(); i++) {
                if (temp % primes.get(i)  == 0) {
                    break; //이전에 있는 걸로 나뉘어 지면 해당수는 소수임.
                }
            }
            if (i == primes.size()) {
                find = true;
            }

        }
        return temp;


    }

    public Collection<Long> getUglies(int n) { //해당 사이즈가 n개가 되어야 함.
        SortedSet<Long> sset = new TreeSet<>();
        sset.add(1L);
        Long temp = 1L; //일단 이 친구를 넣었음
        //
        while (sset.headSet(temp).size()<n) {
            sset.add(temp * 2L);
            sset.add(temp * 3L);
            sset.add(temp * 5L); //계속 더 해줌.

            SortedSet<Long> n_set = sset.tailSet(temp + 1L);
            temp = n_set.first(); //다음 인덱스
            //이제 다음 수를 더해줘야지


        }

        return sset.headSet(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Primes: ");
        int n = sc.nextInt();

        List<Long> primes = new SpecialNumberGenerator2().getPrimes(n);
        ListIterator<Long> lit = primes.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next()+" ");
        }
        int cnt =0;
        System.out.println();
        while (lit.hasPrevious()) {
            if(cnt == 10)
                break;
            System.out.print(lit.previous()+" ");
            cnt++;
        }
        System.out.println();
        System.out.println("Number of uglies: ");
        int n2 = sc.nextInt();
        Collection<Long> uglies = new SpecialNumberGenerator2().getUglies(n2);
        System.out.println("Ugly numbers: " + uglies);
        System.out.println();


        //--------------------------------------------

        primes.retainAll(uglies);
        System.out.println("Intersection: " + primes);
        System.out.println();

        primes = new SpecialNumberGenerator2().getPrimes(n); // 소수 집합을 새로 구한다.
        primes.addAll(uglies);
        SortedSet<Long> union = new TreeSet<>(primes);
        System.out.println("Union: " + union);
        System.out.println();

        System.out.print("Front 20 numbers in the union: ");
        List<Long >list = new ArrayList<>(union);
        lit = list.listIterator();
        int count = 0;
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
            if (++count >= 20)
                break;
        }
        System.out.println();

        System.out.print("10 numbers in the end of the union: ");
        lit = list.listIterator(Math.max(0,  union.size()-10));//마지막 10개를 지정하는데.. union size
        count = 0;
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
            if (++count >= 10)
                break;
        }
        System.out.println();


    }
}
