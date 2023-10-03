package w5;

import java.util.*;

public class SpecialNumberGenerator {


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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Primes: ");
        int n = sc.nextInt();

        List<Long> primes = new SpecialNumberGenerator().getPrimes(n);
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


    }
}
