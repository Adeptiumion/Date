import java.util.ArrayList;
import java.util.List;

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

    public static List<Data> dataGeneratorList(int size){
        int b;
        List<Data> dataList = new ArrayList<>();
        for (int i = 0; i < size; i++)
            dataList.add(new Data(23, 0));
        return dataList;
    }

    private String parser(T time){
        String buffer = time.toString();
        return buffer.length() == 1 ? "0" + buffer : buffer;
    }
}
