package edu.monmouth.lab1;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import edu.monmouth.employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt
    	if (args.length != Lab1Constants.ALLOWEDARGUMENTS) {
			System.err.println("Please enter only one argument. No more and no less.");
			System.exit(Lab1Constants.FAILURECODE);
		}
		
		try {
			PrintStream st = new PrintStream(args[0]);
			System.setOut(st);
			System.setErr(st);
		}
		
		catch (FileNotFoundException e) {
			System.err.println("Error: Connot redirect stderr and stdout" + e.getMessage());
			e.printStackTrace();
			System.exit(Lab1Constants.FAILURECODE);
		}
		
	// declare a List that stores Employee objects in a LinkedList
		LinkedList<Employee> employees = new LinkedList<>();
	    	
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	employees.add(salaryEmployee1);
    	employees.add(salaryEmployee2);
    	employees.add(pieceEmployee1);
    	employees.add(pieceEmployee2);
    	employees.add(salaryEmployee3);
    	employees.add(salesEmployee);
    			
	System.out.println("Iterating forward through list");
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	Iterator<Employee> allEmployees = employees.iterator();
    int iterNum = 1;

    while (allEmployees.hasNext()) {
        System.out.println("Employee " + iterNum + ": " + allEmployees.next());
        iterNum++;
    }
    iterNum = 1;
	
	System.out.println("\nIterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay
	allEmployees = employees.iterator();
    while (allEmployees.hasNext()) {
    	Employee currentEmp = allEmployees.next();
    	
        System.out.println("Employee " + iterNum + ": $" + currentEmp.getMonthlyPay());
        iterNum++;
    }
    iterNum = 1;
    
	// remove salaryEmployee1 from the list
    if (employees.size() > 0) {
    	employees.remove(0);
    }
		
	System.out.println("\nIterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	
	allEmployees = employees.iterator();
    while (allEmployees.hasNext()) {
        System.out.println("Employee " + iterNum + ": " + allEmployees.next());
        iterNum++;
    }
    iterNum = 1;
			
	// declare an array of references to Employee objects
    Employee[] employeesArray;
	// sized to the number of Employee objects in the List
    employeesArray = new Employee[employees.size()];
	// using a List method, transfer the List to the array
    employeesArray = employees.toArray(employeesArray);

	System.out.println("\nContents of array");	
	// iterate thru the array, printing out each Employee's attributes
	for (int i = 0; i < employeesArray.length; i++) {
		System.out.println("Employee " + (i+1) + ": " + employeesArray[i]);
	}
	
    }

}
