package activity;

 class Alivedemo implements Runnable{
Thread t;
Alivedemo()
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
				Thread.sleep(100);
			}
		}
		catch(InterruptedException obj)
		{
			System.out.println("Thread :"+t+"interuppted");
		}
	}
}
 class Alive
{
	public static void main(String[]args)
	{
		Alivedemo obj=new Alivedemo();
		System.out.println(obj.t +"is alive ? :"+obj.t.isAlive());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main tread loop: "+i);
				Thread.sleep(200);	
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread is interuppted");
		}
		System.out.println(obj.t +"is alive ? :"+obj.t.isAlive());
		System.out.println("main thread is exiting");	
	}
	}
