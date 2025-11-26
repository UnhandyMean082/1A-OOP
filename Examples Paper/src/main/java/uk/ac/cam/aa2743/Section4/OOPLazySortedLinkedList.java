package uk.ac.cam.aa2743.Section4;

import uk.ac.cam.aa2743.Section2.OOPLinkedListElement;

public class OOPLazySortedLinkedList extends OOPSortedLinkedList {
    public boolean isSorted;

    public OOPLazySortedLinkedList() {
        super();
        this.isSorted = false;
    }

    @Override
    public void addToHead(int element) {
        super.addToHead(element);
        this.isSorted = false;
    }

    @Override
    public int getHeadVal() {
        ensureSorted();
        return super.getHeadVal();
    }

    @Override
    public int getNthElement(int n) {
        ensureSorted();
        return super.getNthElement(n);
    }

    @Override
    public int removeFromHead() {
        ensureSorted();
        return super.removeFromHead();
    }

    private void ensureSorted() {
        if (!this.isSorted) {
            sort();
            this.isSorted = true;
        }
    }

    private void sort() {
        OOPLazySortedLinkedList sorted = new OOPLazySortedLinkedList();
        while (this.size != 0) {
            sorted.addElement(super.removeFromHead());
        }
        this.head = sorted.getHead();
        this.size = sorted.getLength();
    }
}
