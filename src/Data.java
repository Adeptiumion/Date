public class Data<T> {
    private T hours;
    private T minutes;

    public Data(T hours, T minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return parser(hours) + ":" + parser(minutes);
    }

    private String parser(T time){
        String buffer = time.toString();
        return buffer.length() == 1 ? "0" + buffer : buffer;
    }
}
