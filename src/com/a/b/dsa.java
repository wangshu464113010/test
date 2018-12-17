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
		System.out.println("璋佹櫄涓�鐐硅皝鍔犵彮");
		//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
		System.out.println("ndksjfjsk");
		System.out.println("ndksjfjsk");
		System.out.println("璋佹櫄涓�鐐硅皝鍔犵彮");
	}
//<<<<<<< HEAD
//<<<<<<< Upstream, based on branch 'master' of https://github.com/wangshu464113010/test.git
	

//=======
	public void dfsadfs() {
		String a = "12";
		//=======
		System.out.println("璋佹櫄涓�鐐硅皝鍔犵彮");
		//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
		System.out.println("ndksjfjsk");
		System.out.println("ndksjfjsk");
		System.out.println("璋佹櫄涓�鐐硅皝鍔犵彮");
//>>>>>>> 7ec2554 zq
	}
//=======
//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
	public void add() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("a.txt"));
		pw.println(10);
		pw.flush();
		System.out.println();
		PrintStream ps = new PrintStream(new File("a.txt"));
		ps.println("1234756");
		ps.close();
	}
//<<<<<<< HEAD
	public void hello() throws FileNotFoundException{
		syso();
		System.out.println();
		PrintStream ps = new PrintStream(new File("a.txt"));
	}
//=======
	public void stringadd(){
		add();
		dfsadfs();
//>>>>>>> branch 'master' of https://github.com/wangshu464113010/test.git
	}
	
}
