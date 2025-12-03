package uk.ac.cam.aa2743.Section8;

public class OOPLinkedList<T> implements OOPList<T> {
    private OOPLinkedListElement<T> head;
    private int length;
    public OOPLinkedList() {
        head = null;
        length = 0;
    }
    public void addHeadElement(T content) {
        head = new OOPLinkedListElement<T>(content, head);
        length = length + 1;
    }
    public void removeHeadElement() {
        if (head != null) {
            head = head.nextElement;
            length = length - 1;
        }
    }
    public T getHeadElement() {
        if (head == null) return null; // Handle empty list safety
        return head.content;
    }
    public T getNthElement(int n) {
        OOPLinkedListElement<T> index = head;
        int i = 0;
        while (i < n) {
            if (index == null) return null;
            index = index.nextElement;
            i = i + 1;
        }
        if (index == null) return null;
        return index.content;
    }
    public int getLength() {
        return length;
    }
}
class OOPLinkedListElement<T> {
    T content;
    OOPLinkedListElement<T> nextElement;
    OOPLinkedListElement(T content, OOPLinkedListElement<T> nextElement) {
        this.content = content;
        this.nextElement = nextElement;
    }
}