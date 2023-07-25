import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook  {
   static HashMap<String, ArrayList> phoneBook = new HashMap<>();

   public static void addPhoneBook (String name,String  phone){
        if (phoneBook.containsKey(name)){
            ArrayList phones = phoneBook.get(name);
            phones.add(phone);
            phoneBook.put(name,phones);
        } else{
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name,phones);
        }
    }

    public static void printPhoneBook (){
    phoneBook.entrySet()
            .stream()
            .sorted((s1,s2) -> Integer.compare(s2.getValue().size(),s1.getValue().size()))
            .forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));
    }
}
