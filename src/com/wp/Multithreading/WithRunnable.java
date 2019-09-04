package com.wp.Multithreading;

public class WithRunnable implements Runnable{
	 int eno,salary;
	 String Ename;
	
	 public WithRunnable(int eno, int salary, String ename) {
		 this.eno = eno;
		 this.salary = salary;
		 this.Ename = ename;
		 }
 
	 public void calculateSalary(int salary) {

		 int hra = (int) (0.1 * salary);
		 int da = (int) (0.2 * salary);
		 int ca = (int) (0.1 * salary);
		 System.out.println("Thread "+Thread.currentThread().getName()+" " + "with  enumber" + "  " + eno + "  " + "and  name :" + Ename + " " + " "
		 + "has basic salary:"+salary+" and  hra :" + hra + " da :" + da + " " + "ca:" + " " + ca );
		 }

	public static void main(String[] args) {
		Thread t1 = new Thread(new WithRunnable(1, 15000, "Ankush"));
		t1.setName("Employee1");
		Thread t2 = new Thread(new WithRunnable(2, 35000, "Sadiya"));
		t2.setName("Employee2");
		Thread t3 = new Thread(new WithRunnable(3, 80000, "Harshita"));
		t3.setName("Employee3");
		Thread t4 = new Thread(new WithRunnable(4, 96000, "Ashi"));
		t4.setName("Employee4");
		Thread t5 = new Thread(new WithRunnable(5, 30000, "Pooja"));
		t5.setName("Employee5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		}

	@Override
	public void run() {
		calculateSalary(salary);
		
	}

}
