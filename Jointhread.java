package activity;

 class childthread implements Runnable{
Thread t;
childthread()
{
	t=new Thread(this,"ChildThread");
  	System.out.println("Thread creatd: "+t);
  	t.start();
}
	public void run() {
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t +"loop :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException obj)
		{
			System.out.println("Thread :"+t+"interuppted");
		}
	}
}
 class Jointhread
{
	public static void main(String[]args)
	{
		childthread obj=new childthread();
		System.out.println(obj.t +"is alive ? :"+obj.t.isAlive());
		try
		{
				System.out.println("main tread waiting1 for child thread to finish");
				obj.t.join();
			}
		catch(InterruptedException e)
		{
			System.out.println("main thread is interuppted");
		}
		System.out.println(obj.t +"is alive ? :"+obj.t.isAlive());
		System.out.println("main thread is exiting");	
	}
	}
