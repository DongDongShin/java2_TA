package w6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileProcessor3 {



    public List<String> readFile(String fileName) throws FileNotFoundException{
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        sc.close();
        return list;

    }

    public void discardWords(List<String> list, String s) {

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if (temp.endsWith(s)) {
                it.remove();//해당 값 remove
            }
        }

    }

    public void discardWords2(List<String> list, String s) {

        for (int i = list.size() - 1; i >= 0; i++) {
            if (list.get(i).endsWith(s)) {
                list.remove(i);
            }
        }

//        for(int i=0;i<list.size();i++){//반복을 하겠지..
//            if (list.get(i).endsWith(s)) {
//                list.remove(i);
//                i--; //리스트의 값을 지워주 었기 때문에 i--를 해야함
//            }
//        }

    }

    public List<String> backwards(List<String> list){
        List<String> new_list = new ArrayList<>();
        ListIterator<String> it = list.listIterator(list.size());//리스트의 마지막 인덱스를 가리킴
        while (it.hasPrevious()) {
            new_list.add(it.previous());
        }

        return new_list;



    }

    public static void main(String[] args) throws FileNotFoundException{


        FileProcessor3 processor = new FileProcessor3();
        List<String> words = processor.readFile("data/words.txt");
        System.out.println(words);

        List<String> bwords = processor.backwards(words);
        System.out.println(bwords);

        processor.discardWords(words,"fy");
        System.out.println(words);
        processor.discardWords2(bwords,"er");
        System.out.println(bwords);
    }
}
