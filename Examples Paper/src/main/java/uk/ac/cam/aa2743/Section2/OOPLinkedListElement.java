package uk.ac.cam.aa2743.Section2;

public class OOPLinkedListElement {
    private int data;
    private OOPLinkedListElement next;

    public OOPLinkedListElement(int data, OOPLinkedListElement next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public OOPLinkedListElement getNext() {
        return this.next;
    }

    public void setNext(OOPLinkedListElement next) {
        this.next = next;
    }
}