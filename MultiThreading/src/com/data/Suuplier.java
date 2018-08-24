package com.data;
public class Suuplier implements Runnable {
	private Message msg;
	public Suuplier(Message msg) {
		this.msg=msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
       String name=Thread.currentThread().getName();
       System.out.println(name+" started");
       try {
		Thread.sleep(1000);
		synchronized (msg) {
			msg.setMsg("Hello from thread");
			msg.notify();
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}

}
