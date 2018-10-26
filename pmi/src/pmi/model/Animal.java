package pmi.model;

public class Animal {

		public String animalName;
		public int Legs;
		public Animal(String animalName, int legs) {
			super();
			this.animalName = animalName;
			Legs = legs;
		}
		public Animal() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getAnimalName() {
			return animalName;
		}
		public void setAnimalName(String animalName) {
			this.animalName = animalName;
		}
		
		public int getLegs() {
			return Legs;
		}
		public void setLegs(int legs) {
			Legs = legs;
		}
		@Override
		public String toString() {
			return "Animal [animalName=" + animalName + ", Legs=" + Legs + "]";
		}
		
}
