package uk.ac.cam.aa2743.Section4;

import uk.ac.cam.aa2743.Section2.OOPLinkedList;
import uk.ac.cam.aa2743.Section2.OOPLinkedListElement;

public class OOPSortedLinkedList extends OOPLinkedList {
    public void addElement(int content) {
        if (head == null || content <= head.getData()) {
            head = new OOPLinkedListElement(content, head);
        } else {
            OOPLinkedListElement index = head;
            while (index.getNext() != null && index.getNext().getData() < content) {
                index = index.getNext();
            }
            index.setNext(new OOPLinkedListElement(content, index.getNext()));
        }
        size = size + 1;
    }
}