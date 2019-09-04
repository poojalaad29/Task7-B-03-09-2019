package com.wp.Multithreading;

public class ThreadClass extends Thread {

	int eno;
	int salary;
	String ename;

	public ThreadClass(int eno, int salary, String ename) {
	this.eno = eno;
	this.salary = salary;
	this.ename = ename;
	}

		public void calculateSalary(int salary) {

		int hra = (int) (0.1 * salary);

		int da = (int) (0.2 * salary);
		int ca = (int) (0.1 * salary);
		System.out.println(currentThread().getName() + " " + "having enumber" + "  " + eno + "  " + "and having name :"
		+ ename + " " + " " + "has hra :" + hra + " da :" + da + " " + "ca:" + " " + ca + "....");
		}

		@Override
		public void run() {
		calculateSalary(salary);

		}

		public static void main(String args[]) {

		ThreadClass empthread1 = new ThreadClass(1, 15000, "Ankush");
		empthread1.setName("Employee1");
		ThreadClass empthread2 = new ThreadClass(2, 35000, "Sadiya");
		empthread2.setName("Employee2");
		ThreadClass empthread3 = new ThreadClass(3, 80000, "Harshita");
		empthread3.setName("Employee3");
		ThreadClass empthread4 = new ThreadClass(4, 96000, "Ashi");
		empthread4.setName("Employee4");
		ThreadClass empthread5 = new ThreadClass(5, 30000, "Pooja");
		empthread5.setName("Employee5");
		empthread1.start();
		empthread2.start();
		empthread3.start();
		empthread4.start();
		empthread5.start();

		}

	}

