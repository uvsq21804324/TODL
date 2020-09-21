
public class Fraction {
	private int numerateur;
	private int denominateur;
	
	public Fraction(int num, int denum) {
		numerateur = num;
		denominateur = denum;
	}
	public String toString() {
		   return "Numerateur: " + this.numerateur +
			  "\nDenoinateur: " + this.denominateur;
	}
}
