package LinkedList;

public class ScratchLL {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }

        lastNode.next=newNode;
    }

    public void removeFirst(){
        if(head==null)return;
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            IO.print("the list is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;

        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;     
    }


    public void printList(){
        if(head==null){
            IO.print("The list is empty...");
            return;
        }

        Node currentNode=head;

        while(currentNode!=null){
            IO.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }

        IO.print("null");
    }
    public static void main(String[] args) {
        ScratchLL list=new ScratchLL();

        list.addLast("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();

        IO.println();
        list.removeLast();
        list.printList();

        IO.println();
        list.removeFirst();
        list.printList();
    }
}
