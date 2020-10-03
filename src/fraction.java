
public class fraction {
	private int numerateur;
	private int denominateur;
	
	public fraction(int num, int denum) {
		numerateur = num;
		denominateur = denum;
	}
	public String toString() {
		   return "Numerateur: " + this.numerateur +
			  "\nDenoinateur: " + this.denominateur + "\n= " + this.numerateur/this.denominateur;
	}
}
