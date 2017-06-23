package strategy;

public abstract class AbstractCalculator {
	public int[] split(String exp,String opt){
		String[] arrays=exp.split(opt);
		int[] newArrays=new int[2];
		newArrays[0]=Integer.parseInt(arrays[0]);
		newArrays[1]=Integer.parseInt(arrays[1]);
		return newArrays;
	}
}
