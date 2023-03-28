package assignment1;

public class SandwichSimulation {
	public static void main (String[] args) {
		Table table = new Table();
		Thread agent = new Thread(new Agent(table));
		Thread breadChef = new Thread(new Chef(table, SandwichIngredient.BREAD));
		Thread jamChef = new Thread(new Chef(table, SandwichIngredient.JAM));
		Thread peanutButterChef = new Thread(new Chef(table, SandwichIngredient.PEANUT_BUTTER));
		
		agent.start();
		breadChef.start();
		jamChef.start();
		peanutButterChef.start();
	}
}
