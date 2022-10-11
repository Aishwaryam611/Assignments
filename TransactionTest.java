package com.streamAssignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;



public class TransactionTest {



   public static void main(String[] args)
    {
        List<Transaction> list = new ArrayList<>();
        
        Trader t1 = new Trader("Palak", "Raipur");
        Trader t2 = new Trader("Aishwarya", "Pune");
        Trader t3 = new Trader("Pooja", "Pune");
        Trader t4 = new Trader("Ganesh", "Delhi");
        
        list.add(new Transaction(t1 , 2011,12));
        list.add(new Transaction(t2 , 2011,89));
        list.add(new Transaction(t3 , 2011,90));
        list.add(new Transaction(t4 , 2014,78));
        
        
        System.out.println("1...Trader who living in delhi");
        list.stream().filter(obj->obj.trader.getCity().contains("Delhi"))
        .forEach(System.out::println);
        
        System.out.println("2...highest value of all transactions ");
        
        Optional<Integer> m = list.stream().map(n->n.getValue()).max((o1,o2)->o1.compareTo(o2));
        System.out.println(m.get());
        
       System.out.println("3...smallest value of all transactions ");
        
        Optional<Integer> m1 = list.stream().map(n->n.getValue()).min((o1,o2)->o1.compareTo(o2));
        System.out.println(m1.get());
        
        System.out.println("4...2011 , or sort by value");
        
        list.stream().filter(n->n.getYear()== 2011).sorted((o1,o2)->o1.getValue()-o2.getValue()).forEach(System.out::println);
        
        //list.stream().filter(n->n.getYear()== 2011).sorted(Comparator.comparing(Transaction::getValue())).forEach(System.out::println);
        
    }



}