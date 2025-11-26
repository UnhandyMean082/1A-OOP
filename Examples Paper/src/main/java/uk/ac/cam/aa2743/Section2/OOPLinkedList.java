package uk.ac.cam.aa2743.Section2;

public class OOPLinkedList {
    protected OOPLinkedListElement head;
    protected int size;

    public OOPLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addToHead(int element) {
        this.head = new OOPLinkedListElement(element, this.head);
        this.size++;
    }

    public int removeFromHead() {
        if (this.head == null) {
            throw new IllegalStateException("Cannot remove from an empty list.");
        }
        int removedData = this.head.getData();
        this.head = this.head.getNext();
        this.size--;
        return removedData;
    }

    public OOPLinkedListElement getHead() {
        if (this.head == null) {
            throw new IllegalStateException("List is empty.");
        }
        return this.head;
    }

    public int getHeadVal() {
        if (this.head == null) {
            throw new IllegalStateException("List is empty.");
        }
        return this.head.getData();
    }

    public int getNthElement(int n) {
        if (n < 0 || n >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.size);
        }
        OOPLinkedListElement current = this.head;
        int count = 0;
        while (count < n) {
            current = current.getNext();
            count++;
        }
        return current.getData();
    }

    public int getLength() {
        return this.size;
    }
}