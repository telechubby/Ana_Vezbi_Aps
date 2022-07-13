class Single_Node{
    int data;
    Single_Node next;

    public Single_Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Single_Node getNext() {
        return next;
    }

    public void setNext(Single_Node next) {
        this.next = next;
    }
}

class Single_List{
    Single_Node first;

    public Single_List() {
        this.first=null;
    }

    public void addNode(Single_Node newElement){
        if(first==null){
            this.first=newElement;
        }
        else{
            Single_Node currentPosition=this.first;
            while(currentPosition.next!=null) {
                currentPosition = currentPosition.next;
            }
            currentPosition.setNext(newElement);
        }
    }

    public int length(){
        if(this.first==null)
            return 0;
        else{
            int counter=1;
            Single_Node currentPosition=this.first;
            while(currentPosition.next!=null) {
                currentPosition = currentPosition.next;
                counter=counter+1;
            }
            return counter;
        }
    }

    public void deleteLast(){
        int length=this.length();
        if(length==0)
        {
            return;
        }
        else if(length==1){
            this.first=null;
            return;
        }
        else {
            Single_Node currentPosition=this.first;
            for(int i=0;i<length-2;i++){
                currentPosition=currentPosition.next;
            }
            currentPosition.next=null;
            return;
        }
    }
}

class Double_Node{
    int data;
    Double_Node last;
    Double_Node next;

    public Double_Node(int data) {
        this.data = data;
        this.last = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Double_Node getLast() {
        return last;
    }

    public void setLast(Double_Node last) {
        this.last = last;
    }

    public Double_Node getNext() {
        return next;
    }

    public void setNext(Double_Node next) {
        this.next = next;
    }
}

class Double_List{
    /*
    Create
    Read
    Update
    Delete
     */
    Double_Node first;

    public Double_List() {
        this.first=null;
    }

    public void addNode(Double_Node newElement){
        if(first==null){
            this.first=newElement;
        }
        else{
            Double_Node currentPosition=this.first;
            while(currentPosition.next!=null) {
                currentPosition = currentPosition.next;
            }
            currentPosition.setNext(newElement);
            currentPosition.next.setLast(currentPosition);
        }
    }

    public int length(){
        if(this.first==null)
            return 0;
        else{
            int counter=1;
            Double_Node currentPosition=this.first;
            while(currentPosition.next!=null) {
                currentPosition = currentPosition.next;
                counter=counter+1;
            }
            return counter;
        }
    }

    public void deleteLast(){
        int length=this.length();
        if(length==0)
        {
            return;
        }
        else if(length==1){
            this.first=null;
            return;
        }
        else {
            Double_Node currentPosition=this.first;
            for(int i=0;i<length-2;i++){
                currentPosition=currentPosition.next;
            }
            currentPosition.next=null;
            return;
        }
    }
}

public class Double_Linked_List {
    public static void main(String[] args) {
        Double_List lista=new Double_List();
        lista.addNode(new Double_Node(3));
        lista.addNode(new Double_Node(3));
        lista.addNode(new Double_Node(3));
        lista.addNode(new Double_Node(3));
        System.out.println(lista.length());
        lista.addNode(new Double_Node(3));
        System.out.println(lista.length());
        lista.deleteLast();
        System.out.println(lista.length());
        lista.deleteLast();
        System.out.println(lista.length());
    }
}
