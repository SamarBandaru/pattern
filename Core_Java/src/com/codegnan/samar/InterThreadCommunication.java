package com.codegnan.samar;
class CubbyHole{
	private int item;
	private boolean available = false;
	public synchronized void put(int i) {
		if(available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		item=i;
		available=true;
		notifyAll();
	}
	public synchronized int get() {
		if(available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available=false;
		notifyAll();
		return item;
	}
}
class Producer extends Thread{
	CubbyHole cb;
	public Producer(CubbyHole cb) {
		this.cb = cb;
	}
	public void run() {
		for(int i = 1;i<=10;i++) {
			cb.put(i);
			System.out.println("Producer inserted the item:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread{
	CubbyHole cb;
	public Consumer(CubbyHole cb) {
		this.cb = cb;
	}
	public void run() {
		for(int i = 1;i<=10;i++) {
			int item = cb.get();
			System.out.println("Consumer got the item:"+item);
			try {
				Thread.sleep(980);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) {
		CubbyHole cb = new CubbyHole();
		Producer p = new Producer(cb);
		Consumer c = new Consumer(cb);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}