package N1E1;

public class Main {
	public static void main(String args[]) {
		BorsaBro bro = new BorsaBro();
		BorsaBro broo = new BorsaBro();
		AgentDeBrorsa loboDeWallStreetWannabe = new AgentDeBrorsa();
		
		loboDeWallStreetWannabe.escoltadorNou(bro);
		loboDeWallStreetWannabe.escoltadorNou(broo);
		loboDeWallStreetWannabe.setBorsa(true);
		bro.status();
		broo.status();
		System.out.println();
		loboDeWallStreetWannabe.escoltadorFora(broo);
		loboDeWallStreetWannabe.setBorsa(false);
		bro.status();
		broo.status();
		
		
	}
}
