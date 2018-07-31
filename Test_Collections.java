package com.ptg.collectionFrameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class Employee{
	
	ArrayList<Object> arrayList;
	LinkedList<Object> linkedList;
	Vector<Object> vector;
	Stack<Object> stack;
	TreeSet<Object> treeSet;
	LinkedHashSet<Object> linkedHashSet;
	HashSet<Object> hashSet;
	TreeMap<Object, Object> treeMap;
	LinkedHashMap<Object, Object> linkedHashMap;
	HashMap<Object, Object> hashMap;
    Hashtable<Object, Object> hashTable;
    Properties properties;
    PriorityQueue<Object> priorityQueue;
    
    public Employee() {
    	arrayList=new ArrayList<Object>();
    	linkedList=new LinkedList<Object>();
    	vector=new Vector<Object>();
    	stack=new Stack<Object>();
    	treeSet=new TreeSet<Object>();
    	linkedHashSet=new LinkedHashSet<Object>();
    	hashSet=new HashSet<Object>();
    	treeMap=new TreeMap<Object, Object>();
    	linkedHashMap=new LinkedHashMap<Object, Object>();
    	hashMap=new HashMap<Object, Object>();
    	hashTable=new Hashtable<Object, Object>();
    	properties=new Properties();
    	priorityQueue=new PriorityQueue<Object>();
    }
    	
    	public void setArrayListElements() {
    		
    		arrayList.add(new Integer(22));
    		arrayList.add(new String("SRC"));
    		arrayList.add(new Integer(22));
    		arrayList.add(new Double(4445.66));
    		arrayList.add(null);
    		
    	}
    	
    	public void getArrayListElements() {
    		System.out.println("Array List :" +arrayList);
    	}
    	
    	public void setLinkedListElements() {
    		linkedList.add(new Integer(22));
    		linkedList.add(new String("SRC"));
    		linkedList.add(new Integer(22));
    		linkedList.add(new Double(4445.66));
    		linkedList.add(null);
    	}
    	
    	public void getLinkedListElements() {
    		System.out.println("Linked List :" +linkedList);
    	}
    	
    	public void setVectorElements() {
    		vector.add(new Integer(22));
    		vector.add(new String("SRC"));
    		vector.add(new Integer(22));
    		vector.add(new Double(4445.66));
    		vector.add(null);
    	}
    	
    	public void getVectorElements() {
    		System.out.println("Vector :" +vector);
    	}
    	
    	
    		public void setStackElements() {
        		stack.add(new Integer(22));
        		stack.add(new String("SRC"));
        		stack.add(new Integer(22));
        		stack.add(new Double(4445.66));
        		stack.add(null);
        	}
    		
    		public void getStackElements() {
        		System.out.println("Stack :" +stack);
        	}
        	
    	}
    
	

public class Test_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Employee emp=new Employee();
            emp.setArrayListElements();
            emp.getArrayListElements();
            emp.setLinkedListElements();
            emp.getLinkedListElements();
            emp.setVectorElements();
            emp.getVectorElements();
            emp.setStackElements();
            emp.getStackElements();
	}

}
