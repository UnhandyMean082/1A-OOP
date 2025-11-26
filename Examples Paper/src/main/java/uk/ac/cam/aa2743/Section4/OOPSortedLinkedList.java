package uk.ac.cam.aa2743.Section4;

import uk.ac.cam.aa2743.Section2.OOPLinkedList;
import uk.ac.cam.aa2743.Section2.OOPLinkedListElement;

public class OOPSortedLinkedList extends OOPLinkedList {

    public void addElement(int content) {
        if (this.head == null || content <= this.head.getData()) {
            this.head = new OOPLinkedListElement(content, this.head);
        } else {
            OOPLinkedListElement index = this.head;
            while (index.getNext() != null && index.getNext().getData() < content) {
                index = index.getNext();
            }
            index.setNext(new OOPLinkedListElement(content, index.getNext()));
        }
        this.size = this.size + 1;
    }
}