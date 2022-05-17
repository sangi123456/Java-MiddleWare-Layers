package com.training.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



   public class TestDBConnection {
	   
    public static void main(String[] args) {

    Connection conn = null;
    java.sql.Statement stmt = null;
    ResultSet rs = null;


  //step1 - load the driver in the memory at runtime
   try {
    Class.forName("org.postgresql.Driver");
   } catch (ClassNotFoundException e) {
   e.printStackTrace();
}

    //Step 2 - make connection to the database -
   //URL jdbc://localHost: 5432/testdb,username,password
   try {
      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
     System.out.println(" **DB connection Successful**");
     } catch (SQLException e) {
       e.printStackTrace();
}

//Step 3 - To Create a stament object to send sql query to database
    try {
    stmt = conn.createStatement();
   } catch (SQLException e1) {
   e1.printStackTrace();
}

    //insert employee record into database
    Statement stmt1 = null;
   try {
	stmt1 = conn.createStatement();
  } catch (SQLException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
   }
   int rows = 0;
  try {
	rows = stmt1.executeUpdate("insert into person(age,name) values(27,'kitty')");
  } catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
    System.out.println("Rows inserted = "+ rows);


        //step 4 - Execute the Query
     try {
         rs = stmt1.executeQuery("SELECT * FROM person");
        while(rs.next()) {
       int id = rs.getInt(1);
        String name = rs.getString(2);
     int age = rs.getInt(3);
   System.out.println("Record - " + id + " " + name + " " + age );
     }
    } catch (SQLException e) {
      e.printStackTrace();
  }

   }
}