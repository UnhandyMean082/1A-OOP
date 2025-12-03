package uk.ac.cam.aa2743.Section8;

public interface OOPList<T> {
    void addHeadElement(T content);
    void removeHeadElement();
    T getHeadElement();
    T getNthElement(int n);
    int getLength();
}
