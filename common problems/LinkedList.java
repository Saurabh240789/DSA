package com.cisco.cadi.epsilon.collab.catalog.service.addjabber.ucdt;

class LinkedList {   
	static Node  head;
	
	static class Node { 	// 1->2->3->4
										// 1    2->3->4
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	
	Node reverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
	}
	
	// prints content of double linked list 
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	
	public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 

}
