package com;
 abstract class AirAutomobile1 
 {
	 String modelNo1;
		void setmodelNo1(String modelNo)
		{
			this.modelNo1=modelNo1;
			
		}
		
		String show()
		{
			return modelNo1;
		}
 }
class Automobile2 extends AirAutomobile1 implements AirAuto,Train{

	@Override
	public int Train(int b) {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public int AirAuto(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	
		
}
 interface AirAuto
 {
	 int maxspeed=100;
		int AirAuto(int a);
 }
 interface Train
 {
	 int speed=50;
		int Train(int b);
 }
 public class NewAutomobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile2 a=new Automobile2();
		Automobile2 b=new Automobile2();
		a.setmodelNo1("Air Bus");
		//System.out.println(AirAuto.show());
		System.out.println(a.AirAuto(90));
		System.out.println(AirAuto.maxspeed);
		System.out.println(b.Train(9));
		System.out.println(Train.speed);


	}

}
