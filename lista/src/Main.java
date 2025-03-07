import com.oxd.list.OrderedList;

public class Main {
    public static void main(String[] args) {

        OrderedList<Integer> orderedList = new OrderedList<>();
        orderedList.add(301);
        orderedList.add(77);
        orderedList.add(2);
        orderedList.add(107);
        orderedList.add(252);
        orderedList.add(444);

        System.out.println(orderedList);

//        LinkedList<Integer> list = new LinkedList<>();
//        System.out.println("Is empty -> "+list.isEmpty());
//        list.insertAtBeginning(3);
//        list.insertAtBeginning(2);
//        list.insertAtBeginning(1);
//
//        System.out.println(list);
//
//        System.out.println("Size -> "+list.size());
//        System.out.println("Is empty -> "+list.isEmpty());
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);

//        LinkedList<String> listStr = new LinkedList<>();
//        listStr.insertAtEnd("Hello");
//        listStr.insertAtEnd("World!");
//
//        System.out.println("====== 0 ======");
//        System.out.println(listStr.get(0));
//        System.out.println("====== 1 ======");
//        System.out.println(listStr.get(1));
//
//        listStr.remove("Hello");
//
//        System.out.println("====== List ======");
//        System.out.println(listStr);
//
//        listStr.change(0, "Teste");
//        System.out.println("====== List ======");
//        System.out.println(listStr);
////
//        System.out.println(listStr);
//        listStr.removeLast();
//        System.out.println(listStr);
//        listStr.removeLast();
//        listStr.removeLast();
//
//        System.out.println(listStr);
    }
}
/*
1. Pesquisar item na lista v/
Retorar um erro caso o item não exista

2. Retirar item pelo valor da chave v/
Retornar erro se o valor não estiver presente

3. Verificar se a lista está vazia v/
True - Lista vazia

4. Inserir elemento após o i-ésimo item da lista v/
Retornar erro se a lista não possuir o item na posição i

5. Retirar o i-ésimo item da lista v/
Retornar erro se a lista não possuir o item na posição i

6. Retornar o tamanho da lista v/

7. Permitir a modificação de um elemento presente na lista. v/
*/
