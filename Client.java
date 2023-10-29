public class Client {
    String FIO;
    long timeWork;

    public Client(String FIO, long timeWork) {
        this.FIO = FIO;
        this.timeWork = timeWork;
    }


    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public long getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(long timeWork) {
        this.timeWork = timeWork;
    }
}
