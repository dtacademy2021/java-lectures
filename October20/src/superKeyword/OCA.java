package superKeyword;

class A1 { 
    public int a; 
    A1 (int a) { 
        this.a = a; 
   }
}
class A2 extends A1 { 
    int a; 
    A2 (int a , int b) { 
    	 this.a = b; 
         super (a);
    } 
}
