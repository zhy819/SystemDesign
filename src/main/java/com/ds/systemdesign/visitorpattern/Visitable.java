package com.ds.systemdesign.visitorpattern;

/**
 * The interface defines a class that can be visited by Visitor
 */
public interface Visitable {
    public void accept(Visitor visitor);
}