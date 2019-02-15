package com.ds.systemdesign.visitorpattern;

public interface VisitorHandler<T extends Visitable> {
    public void handle(T visitable);
}