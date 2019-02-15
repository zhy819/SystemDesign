package com.ds.systemdesign.visitorpattern;

import java.util.Map;
import java.util.HashMap;

public abstract class VisitorBase implements Visitor {
    private Map<Class<? extends Visitable>, VisitorHandler<Visitable>> handlerMap;

    public VisitorBase() {
        this.handlerMap = new HashMap<Class<? extends Visitable>, VisitorHandler<Visitable>>();
    }

    public void visit(Visitable visitable) {
        if(! handlerMap.containsKey(visitable.getClass())) {
            System.out.println("Fail to find handler for type of (" + visitable + ")");
        }else {
            this.handlerMap.get(visitable.getClass()).handle(visitable);
        }
    }

    protected < T extends Visitable> void addHandler(Class<? extends Visitable> visitable, VisitorHandler<Visitable> handler) {
        if(handlerMap.containsKey(visitable)) {
            System.out.println("Fail to add duplicate handler for type of (" + visitable + ")");
        }else {
            handlerMap.put(visitable, handler);
        }
    }
}