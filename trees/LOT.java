package trees;

import java.util.*;
import java.io.*;
import java.lang.*;


//Level Order Traversal
class LOT { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	
        printLevel(root);
    } 
    
    public static void printLevel(Node root){
       if(root == null) {
    	   return;
       }
       
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       
       while(!queue.isEmpty()) {
    	   Node node = queue.poll();
    	   System.out.println(node.data);
    	   
    	   if(node.left != null) {
    		   queue.add(node.left);
    	   }
    	   if(node.right != null) {
    		   queue.add(node.right);
    	   }
       }
    }   
} 

