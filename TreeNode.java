/*
Yikai Wang
APCS2 pd5
HW36 -- Algorithm as Data Structure
2016-05-09
*/

/*****************************************************
 * class TreeNode
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 *****************************************************/

public class TreeNode {

    //instance variables / attributes of a TreeNode:
    private int value;
    private TreeNode leftNode = null;
    private TreeNode rightNode = null;


    /*****************************************************
     * default constructor
     * Construct a tree node with specified value, 
     * with null left and right subtrees.
     *****************************************************/
    TreeNode( int initValue )
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    value = initValue;
    }
          

    /*****************************************************
     * overloaded constructor
     * Construct a tree node with specified value, left, and right subtrees.
     *****************************************************/
    TreeNode( int initValue, TreeNode initLeft, TreeNode initRight ) 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    this(initValue);
    leftNode = initLeft;
    rightNode = initRight;
    }
 

    /*****************************************************
     * Returns the left subtree of this node.
     *****************************************************/
    TreeNode getLeft() 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    return leftNode;
    }


    /*****************************************************
     * Returns the right subtree of this node.
     *****************************************************/
    TreeNode getRight() 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    return rightNode;
    }


    /*****************************************************
     * Returns the value stored in this tree node.
     *****************************************************/
    int getValue() 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    return value;
    }


    /*****************************************************
     * Sets the value of the left subtree of this node.
     *****************************************************/
    void setLeft( TreeNode theNewLeft ) 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    leftNode = theNewLeft;
    }


    /*****************************************************
     * Sets the value of the right subtree of this node.
     *****************************************************/
    void setRight( TreeNode theNewRight ) 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    rightNode = theNewRight;
    }


    /*****************************************************
     * Sets the value of this tree node.
     *****************************************************/
    void setValue( int theNewValue ) 
    {
	/*** YOUR IMPLEMENTATION HERE ***/
    value = theNewValue;
    }
 
}//end class
