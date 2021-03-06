package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 原型模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 */
public class Prototype implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;

	private String string;
	private SerializeObject obj;
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializeObject getObj() {
		return obj;
	}

	public void setObj(SerializeObject obj) {
		this.obj = obj;
	}


	//浅复制
	public Object clone() throws CloneNotSupportedException{
		Prototype proto=(Prototype)super.clone();
		return proto;
	}
	
	//深复制
	public Object deepClone() throws ClassNotFoundException,IOException{
		
		 /* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		 /* 读出当前对象的二进制流 */ 
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject();
	}
}

class SerializeObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
}
