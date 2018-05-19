package david.chap1;

import java.lang.System; //Redundant Import - java.lang is implicitly imported. It doesn't nedd an explicit import declaration
import java.lang.*;		 //Redundant Import - java.lang is implicitly imported. It doesn't nedd an explicit import declaration
import java.util.Random;
import java.util.*;		 //Redundant Import - In the util package we just have declared what was needed (Random).

import java.util.Date;	//import a class name takes precedence hover * (wildcards) imports.
import java.sql.*;

public class _01_01_ImportExample{
	public static void main(String[] args){
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}