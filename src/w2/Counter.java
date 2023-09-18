package w2;




/**
 * 최대값에 도달하면 다시 0부터 세기 시작하는 계수기
 * @author 정충교
 * @version 1.0
 */
class Counter {

    private int count = 0;
    public final int MAX = 10;

    /**
     * count 값을 증가시킨다.
     * 만약 count 값이 MAX를 초과한다면 0으로 돌아간다.
     */
    public void tick() {

        count++;
        if (!isInputValid(count)) {
            count =0;
        }


    }

    /**
     *  Getter 메소드
     * @return 현재의 count 값
     * 		   (0 <= 반환값 <= MAx)
     */
    public int getCount() {
        return count;
    }

    /**
     * 현재의 count 값을 설정한다.
     * @param number count 값으로 설정할 수
     *        (전제조건: 0 <= number <= MAX)
     */
    public void setCount(int number) {
        if(isInputValid(number))
            count = number;
    }

    /*
     * count 설정 값이 유효 범위 내에 있는지 검사
     */
    private boolean isInputValid(int number) {
        if (number < 0)
            return false;
        if (number > MAX)
            return  false;
        return true;

    }
}
