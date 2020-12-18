import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    StopWatch(){
        this.startTime = new Date();
    }

    public void start(){
        this.startTime = new Date();
    }

    public void stop(){
        this.endTime = new Date();
    }

    public long getElapsedTime(){
        return this.endTime.getTime()- this.startTime.getTime();
    }
}
