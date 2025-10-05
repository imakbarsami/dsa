package LinkedList;

import java.util.LinkedList;

public class CollectionLL {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();

        list.addFirst("Sami");
        list.addFirst("name");
        list.addFirst("is");
        list.addFirst("my");


        IO.print(list);
        IO.println();
        IO.println(list.size());


        list.addLast("CSE");
        IO.print(list);
        IO.println();
        IO.println(list.size());
    }
}
