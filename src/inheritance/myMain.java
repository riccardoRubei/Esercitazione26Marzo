package inheritance;

public class myMain {

	public static void main(String[] args) {
		
		animal anim = new animal();
		corgi corgi = new corgi();
		animal panda = new panda();
		
		dog Rex1 = new germanShepard();
		Rex1.eat();
		
		vet v = new vet();
		v.visit(anim);
		v.visit(corgi);
		v.visit(panda);
		
	}

}
