package castingOfObjects;

public class Super {
	
	
	int i = 9;
	
	
	public void m1() {
		
	}
	
	public void m3() {
		
	}
	
	
	public static void main(String[] args) {
		
		
		Super spr = new Sub();
		
//		Super spr = new Super();
		
		Sub sub = new Sub();
		
		
		System.out.println(spr.i);
		
		if(spr instanceof Sub) {
		System.out.println(((Sub)spr).j);
		}
		spr.m1();
		
		if(spr instanceof Sub) {
		((Sub)spr).m2();
		}
		
		
		
		System.out.println(sub.i);
		System.out.println(sub.j);
		sub.m1();
		sub.m2();
		sub.m3();
		
	}
	

}
