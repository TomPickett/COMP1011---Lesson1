	public class Person {
		private float height;
		private float weight;
	
		/**
		 * @return the height
		 */
		public float getHeight() {
			return height;
		}

		/**
		 * @param height the height to set
		 */
		public void setHeight(float height) {
			this.height = height;
		}

		//Constructor
		public Person() {
			this.setHeight(6);
			this.weight = 200;
		}
		
		public void walks() {
			this.weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("You weigh: " + this.weight + "lbs");
		}
		
		public void eats() {
			this.weight *= 1.2;
			System.out.println("You gained weight!");
			System.out.println("You weight: " + this.weight);
		}
		
	}
