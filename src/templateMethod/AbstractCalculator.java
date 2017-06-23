package templateMethod;

public abstract class AbstractCalculator {
	 /*主方法，实现对本类其它方法的调用*/ 
	public final int calculate(String exp,String opt){
		int arrayInt[]=split(exp, opt);
		return calculate(arrayInt[0], arrayInt[1]);
	}
	
	 /*被子类重写的方法*/
	abstract public int calculate(int num1,int num2);
	
	public int[] split(String exp,String opt){
		String[] arrays=exp.split(opt);
		int[] arrayInt=new int[2];
		arrayInt[0]=Integer.parseInt(arrays[0]);
		arrayInt[1]=Integer.parseInt(arrays[1]);
		return arrayInt;
	}
}
