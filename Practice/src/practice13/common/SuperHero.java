package practice13.common;

public class SuperHero extends Hero{
	Item equipment;

	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

}
