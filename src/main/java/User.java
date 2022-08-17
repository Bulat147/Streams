import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

//        users.stream()
//                .sorted((user1, user2) -> Integer.compare(user2.getAge(), user1.getAge()))
//                .limit(3)
//                .forEach(System.out::println); // проброс параметров

//        users.stream()
//                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
//                .filter((user) -> user.getAge()<40)
//                .limit(3)
//                .map(User::getName)
//                .forEach(System.out::println);


        users.stream()
               //.findFirst(); - возвращает первый элемент из потока
                .filter((user) -> user.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("None User"));
    }

    private String name;
    private int age;

    private User(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
