package composite;

import java.util.Enumeration;

/*
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等
 */
public class Tree {  
	  
    TreeNode root = null;  
  
    public Tree(String name) {  
        root = new TreeNode(name);  
    }  
  
    public static void main(String[] args) {  
        Tree tree = new Tree("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");  
        TreeNode nodeD = new TreeNode("D"); 
        nodeB.add(nodeC);  
        tree.root.add(nodeB);
        tree.root.add(nodeD);
        Enumeration<TreeNode> e=tree.root.getChildren();
        while(e.hasMoreElements()){
        	System.out.println(e.nextElement().getName());
        }
    }  
}  
