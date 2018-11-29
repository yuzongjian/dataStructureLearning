/**
 * 
 */
package dataStructureLearning;

/**
 * @author yuzongjian
 *面向对象数组
 * This is a project for the power supply bureau.
 */
public class learning2 {
	public static boolean main(String[] args) {
		String x="1234567";
		 StringBuffer sb = new StringBuffer();
	        char[] ch = x.toCharArray();
	        for(int i = ch.length-1;i>=0;i--){
	            sb.append(ch[i]);
	        }
	        String y=sb.toString();
	        if(y.equals(x)) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	}

}
