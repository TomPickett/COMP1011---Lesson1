	public class Person {
		private float height;
		private float weight;
		private String name;
	
	    //getters
		public float getHeight() {
			return height;
		}

		//setters
		public void setHeight(float height) {
			this.height = height;
		}

		//Constructor
		public Person(String name, float weight) {
			this.name = name;
			this.setHeight(6);
			this.weight = weight;
		}
		
		public void walks() {
			this.weight *= 0.9;
			System.out.println(this.name + " lost weight!");
			System.out.println(this.name + " weighs: " + this.weight + "lbs");
		}
		
		public void eats() {
			this.weight *= 1.2;
			System.out.println(this.name + " gained weight!");
			System.out.println(this.name + " weighs: " + this.weight);
		}
		
	}
