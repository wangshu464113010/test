package com.a.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class dsa {
	private void syso() {
		System.out.println("dsfdsfgsd");
		//<<<<<<< HEAD
		String a = "12";
		//=======
		System.out.println("˭��һ��˭�Ӱ�");
		//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
		System.out.println("ndksjfjsk");
		System.out.println("ndksjfjsk");
		System.out.println("˭��һ��˭�Ӱ�");
	}
	public void add() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("a.txt"));
		pw.println(10);
		pw.flush();
		System.out.println();
		PrintStream ps = new PrintStream(new File("a.txt"));
		ps.println("1234756");
		ps.close();
	}
	
}
