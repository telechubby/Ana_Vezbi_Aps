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
        }
    }
}

public class Double_Linked_List {

}
