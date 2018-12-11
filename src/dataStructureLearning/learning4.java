/**
 * 
 */
package dataStructureLearning;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
public class learning4 {
public static void main(String[] args) {
	String str ="04";
	int a =Integer.parseInt(str);
	Thread my=new Thread(new myThread());
	my.start();

	System.out.println(a);
}
}
