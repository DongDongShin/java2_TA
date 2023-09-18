package w2;

class Remocon {

    // 필드
    private int volume = 0;
    private int channel = 0;
    public final static int MAX_VOLUME = 3;		// 최고 음량
    public final static int MAX_CHANNEL = 3;	// 채널 번호 최대값
    // 음량 최소값은 0
    // 채널 번호 최소값도 0

    /**
     * 음량을 한 단계 높인다.
     * 현재 음량이 최대이면 음량이 바뀌지 않는다.
     */
    public void volumeUp() {
        if (volume < MAX_VOLUME) { //볼륨이 3일 때까지만 volume을 상승 시킴
            volume++;
        }
        display();

    }

    /**
     * 음량을 한 단계 낮춘다.
     * 현재 음량이 0이면 음량이 바뀌지 않는다.
     */
    public void volumeDown() {
        if (volume  > 0) { //볼륨이 3일 때까지만 volume을 상승 시킴
            volume--;
        }
        display();

    }

    /**
     * 한 단계 높은 번호로 채널을 변경한다.
     * 현재 가장 높은 번호의 채널에 있다면 0번 채널로 이동한다.
     */
    public void channelUp() {
        if (channel == MAX_CHANNEL) {
             channel =0;
        }
        else
            channel++;
        display();


    }

    /**
     * 한 단계 낮은 번호로 채널을 변경한다.
     * 현재 0번 채널에 있다면 가장 높은 번호의 채널로 이동한다.
     */
    public void channelDown() {
        if (channel == 0) {
            channel =MAX_CHANNEL;
        }
        else
            channel--;
        display();

    }

    /**
     * 현재의 volume, channel 상태를 화면에 보여준다.
     */
    public void display() {
        System.out.println("Volume = "+volume+", Channel = "+channel);
    }

}