class A1{
void m(){
System.out.println("Method m is invoked");
}
void n(){
m();
}




public static void main(String args[]){
A1 obj1=new A1();
obj1.n();
}
}