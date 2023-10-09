package w6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileProcessor {



    public List<String> readFile(String fileName) throws FileNotFoundException{
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        sc.close();
        return list;



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


        FileProcessor processor = new FileProcessor();
        List<String> words = processor.readFile("data/words.txt");
        System.out.println(words);

        List<String> bwords = processor.backwards(words);
        System.out.println(bwords);
    }
}
