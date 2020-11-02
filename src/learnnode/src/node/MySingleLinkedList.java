package node;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size;

    public MySingleLinkedList() {
        head = null;
        size =0;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        //T 는타입패러미터
        newNode.next= head;
        head = newNode;
        size++;
    }

    public void add(int index, T item) {
        if(index<0||index>size)
            return;
        if(index==0)
            addFirst(item);
        else {
            Node<T> q = getNode(index - 1);
            addAfter(q, item);
        }
    }

    public void addAfter(Node<T> before, T item) {
        Node<T> temp = new Node<>(item);
        temp.next = before.next;
        before.next = temp;
        size++;
    }

    public T get(int index) {
        if(index <0|| index>=size)
            return null;
        Node<T> p = head;
        for(int i=0; i<index;i++) {
            p = p.next;
        }
        return p.data;
    }

    public T removeFirst() {
        if(head==null) {
            return null;
        }else {
            T temp = head.data;
            head = head.next;
            size--;
            return temp;
        }

    }

    public T removeAfter(Node<T> before) {
        if(before.next == null){
            return null;
        }
        else {
            T temp = before.next.data;
            before.next = before.next.next;
            return temp;
        }
    }

    public void remove(int index) {

    }

    public int indexOf(T item) {
        Node<T> p = head;
        int index = 0;
        while (p!=null) {
            if(p.data.equals(item))
                return index;
            p=p.next;
            index++;
        }
        return -1;
    }

    public Node<T> getNode(int index) {
        if(index <0|| index>=size)
            return null;
        Node<T> p = head;
        for(int i= 0; i<index; i++) {
            p=p.next;
        }
        return p;
    }

    public static void main(String[] args) {
        MySingleLinkedList<String> list = new MySingleLinkedList<>();
        list.add(0,"Saturday");
        list.add(1,"Friday");
        list.add(0,"Monday"); //m,s,f
        list.add(2,"Tuesday");//m,s,t,f
        String str = list.get(2);
        list.remove(2);
        int pos =list.indexOf("Friday");
    }
}
