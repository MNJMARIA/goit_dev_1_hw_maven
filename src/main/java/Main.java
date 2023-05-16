import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Maria", "Stepanova");

        System.out.println(gson.toJson(person));
    }
}
