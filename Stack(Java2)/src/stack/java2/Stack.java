/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.java2;

/**
 *
 * @author DNO
 */
abstract class Stack
{
	int top;
	Stack()
	{
		this.top = -1;
	}
	abstract void push(int val);
	abstract int pop();
	abstract void display();
}