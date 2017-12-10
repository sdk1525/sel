import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpTest {
    public static void main(String[] args) {

        Emp emp1 = new Emp("a1","b1","c1");
        Emp emp2 = new Emp("a2","b2","c2");
        Emp emp3 = new Emp("a1","b1","c3");
        Emp emp4 = new Emp("a5","b1","c3");
        Emp emp5 = new Emp("a1","b2","c3");
        Emp emp6 = new Emp("a5","b1","c3");

        List list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        updateDuplicate(list);
        list.stream().forEach(System.out::println);

    }

    public static void updateDuplicate(List<Emp> list){
        list.forEach(t -> t.setDuplicate(Collections.frequency(list,t) > 1));
    }


    public static void updateDuplicateWithForLoop(List<Emp> list){
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.get(i).setDuplicate(Boolean.TRUE);
                    list.get(j).setDuplicate(Boolean.TRUE);
                }
            }
        }
    }

}
