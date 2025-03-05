import com.oxd.list.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        LinkedList<String> listStr = new LinkedList<>();
        listStr.insertAtEnd("Hello");
        listStr.insertAtEnd("World!");

        System.out.println("====== 0 ======");
        System.out.println(listStr.get(0));
        System.out.println("====== 1 ======");
        System.out.println(listStr.get(1));

        System.out.println(listStr);
        listStr.removeLast();
        System.out.println(listStr);
        listStr.removeLast();
        listStr.removeLast();

        System.out.println(listStr);

    }
}