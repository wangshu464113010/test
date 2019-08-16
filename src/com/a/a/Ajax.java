package com.a.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ajax {
//<<<<<<< HEAD
	public static void main(String[] args) {
		System.out.println("dfsafdfdanhg");
		System.out.println("dfsafdsafdanhg");
		System.out.println("HelloWorld");
		
	}
//=======

	
//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
//<<<<<<< HEAD
	public void stringa() {
		System.out.println("dfsafdsafdanhg");
		System.out.println("HelloWorld");
		System.out.println("Hello World !!! -+-----+-");
	}
//=======
	
	
	
	public void add() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("a.txt"));
		pw.println(10);
		pw.flush();
		System.out.println();
		PrintStream ps = new PrintStream(new File("a.txt"));
		ps.println("1234756");
		ps.close();
	}
	
	public void add123456() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("a.txt"));
		pw.println(10);
		pw.flush();
		System.out.println();
		PrintStream ps = new PrintStream(new File("a.txt"));
		ps.println("1234756");
		ps.close();
//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
	}
}
