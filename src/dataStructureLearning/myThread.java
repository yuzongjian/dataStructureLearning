/**
 * 
 */
package dataStructureLearning;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
public class myThread extends Thread{

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("Æô¶¯À²");
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Æô¶¯À²1234");
		super.run();
	}
	
	

}
