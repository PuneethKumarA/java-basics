package abstraction;

public abstract class BmwFlyingCar extends FlyingCars {
	
		@Override
		public void stopCar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void flyCar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void landCar() {
			// TODO Auto-generated method stub

		}

		

		

		public static int add(int i, int j) {
			return i+j;
		}

		public static boolean isEligibletoVote(int age) {
			if(age > 17) {
				return true;
			}
			
			return false;
		}

		
	}

