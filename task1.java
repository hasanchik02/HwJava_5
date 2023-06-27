import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String st;
        String name;
        String phone;
        Boolean getOut = false;

        while(!getOut){
        System.out.println("1 - добавить 2 - выйти");
        st = scan.nextLine();
        System.out.println("Введите Имя абонента");
        name = scan.nextLine();
        System.out.println("Введите номер телефона абонента");
        phone = scan.nextLine();

        switch (st) {
            case "1": {
            ArrayList<String> list = new ArrayList<>();
                if (map.containsKey(name)){
                for (String s: map.keySet()){
                    list.add(s);
                    }
                }
                else{
                    map.merge(name,phone, (o,n) -> o == null ? n: o + " " + n);
                }
                    }
                        case "9": {
                        getOut = true;
                            Collection.sort(list, new Comparator<String>() {
                            @Override
                            public int compare(String o1, String o2){
                                return map.get(o1).split(" ").length - map.get(o2).split(" ").length;
                            }
                            });
                            break;
                            }   
                                
                        
            }
        }
    }
}
