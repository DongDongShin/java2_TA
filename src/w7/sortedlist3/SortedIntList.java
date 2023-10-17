package w7.sortedlist3;


import java.util.*;

public class SortedIntList extends ArrayIntList {

    private boolean unique;

    public SortedIntList() {
        super();
        unique = false; //일단 중복을 허용 노


    }
    public SortedIntList(int capacity) {//요량을 지정
        super(capacity);
        unique = false; //일단 중복을 허용 노
    }
    public SortedIntList(boolean unique) {
        super();
        this.unique = unique;
    }
    public SortedIntList(boolean unique,int capacity) {
        super(capacity);
        this.unique = unique;
    }
    
    public boolean getUnique() {
    	return unique;
    }
    public void setUnique(boolean unique) {
    	if(unique&&!this.unique) {
    		removeDuplication();
    		this.unique = true;
    		
    	}
    	else this.unique = unique;
    	
    }
    
    private void removeDuplication() {

		for (int i = 0; i < size-1; i++){
			for (int j = i + 1; j < size; j++) {
				if (element[i] == element[j]) {
					remove(j);	// 같으면 뒤에 있는 원소를 삭제.
					j--;	// 삭제에 따라 밀려 내려온 원소도 검사하도록 해 줌.
				}
				else
					break;	// 같지 않으면 그 이후의 원소는 더 이상 볼 필요 없음.
			}				// (오름차순으로 정렬되어 있으므로)
		}

	}
    
 


    @Override
    public void add(int value) { //이제 여기서 유니크를 판단을 해줘야함. 
        int index = Arrays.binarySearch(element,0,size, value);// 적당한 인덱스를 찾음 얘가 들어갈 얘
        if(index >=0){//들어갈 인덱스가 이미 있다는 것이야
        	if(!unique)
            super.add(index,value);
        }
        else { //없으면 원래 있어야 할 자리에 -를하고 1을 빼줌...
            super.add(-(index+1),value);

        }
    }
    
    @Override
    public void add(int index,int value) {
      throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(int value) {
        int index = Arrays.binarySearch(element,0,size,value);
        if (index >= 0) {
            return  index;
        }
        else return -1;
    }

    public int max() {
        if (size == 0) {
          throw new NoSuchElementException();
        }
        else return element[size-1];

    }

    public int min(){
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else return element[0];

    }
    @Override
    public String toString(){
    	StringBuilder sb = new StringBuilder();
        sb.append("S:"+super.toString());
        if(unique) {
        	sb.append("U");
        }
        
        return sb.toString();
        
        
    }
}
