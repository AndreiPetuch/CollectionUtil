import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("текст один два");
        arrayList.add("три текст чытыри");
        arrayList.add("цйуеце уцуцк у цук");
        System.out.println(getElementsByWorc(arrayList,"текст"));

    }
    public static ArrayList<String> getElementsByWorc(ArrayList<String> arrayList, String word){
        return (ArrayList<String>) arrayList.stream().filter(a->a.contains(word)).collect(Collectors.toList());

    }
}
