package ss4_class_object.bai_tap;


import java.util.Date;


public class StopWatch {
    Date starTime;
    Date endTime;

    public StopWatch() {
    }

    public Date getStarTime() {

        return this.starTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void star() {
        this.starTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    // vì trả về giá trị milisecond nên phải để kiểu giá trị là long
    public long getElapsedTime() {
        return this.endTime.getTime() - this.starTime.getTime();
    }

    public static void main(String[] args) {
        //
        StopWatch time = new StopWatch();
        time.star();
        System.out.println(time.getStarTime());
        for (long i = 0; i < 900000000; i++) {

        }
        time.stop();
        System.out.println(time.getEndTime());
        time.getElapsedTime();
        System.out.println(time.getElapsedTime());
    }
}
