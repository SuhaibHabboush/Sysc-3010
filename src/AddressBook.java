
import java.util.*;

public class AddressBook {
	ArrayList <Buddyinfo>list;
	
	public AddressBook(){
		list = new ArrayList<Buddyinfo>();
		
	}
	
	public void addBuddy(Buddyinfo b){
		list.add(b);
	}
	
	public void removeBuddy(Buddyinfo b){
		list.remove(b);
	}
	
	public Buddyinfo getB(int index){
		return list.get(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buddyinfo x1, x2, x3;
		AddressBook temp = new AddressBook();
		
		x1 = new Buddyinfo("Suhib", "333", 819);
		x2 = new Buddyinfo("Malek", "777", 613);
		x3 = new Buddyinfo("Ali", "444", 994);
		
		temp.addBuddy(x1);
		temp.addBuddy(x2);
		temp.addBuddy(x3);
		temp.removeBuddy(x1);
		System.out.println("Hello " + temp.getB(1).getName() + "!");
		
	}

}