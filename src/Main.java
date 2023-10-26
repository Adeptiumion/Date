import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Data<Integer>(1, 1));
        List<Data> list = Data.dataGeneratorList(12);
        System.out.println(list);


    }
}
