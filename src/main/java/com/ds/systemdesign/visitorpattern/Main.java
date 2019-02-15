package com.ds.systemdesign.visitorpattern;

import java.util.LinkedList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        FinanceDepartment fd = new FinanceDepartment();
        HRDepartment hd = new HRDepartment();

        List<Visitable> list = new LinkedList<Visitable>();
		FulltimeEmployee fte1 = new FulltimeEmployee("张无忌",3200.00,45);
		FulltimeEmployee fte2 = new FulltimeEmployee("杨过",2000.00,40);
		FulltimeEmployee fte3 = new FulltimeEmployee("段誉",2400.00,38);
		ParttimeEmployee pte1 = new ParttimeEmployee("洪七公",80.00,20);
		ParttimeEmployee pte2 = new ParttimeEmployee("郭靖",60.00,18);
        
        list.add(fte1);
        list.add(fte2);
        list.add(fte3);
        list.add(pte1);
        list.add(pte2);

        // method #1
        for(Visitable v : list) {
            v.accept(fd);
            v.accept(hd);
        }

        // method #2
        for(Visitable v : list) {
            fd.visit(v);
            hd.visit(v);
        }
		
    }
}