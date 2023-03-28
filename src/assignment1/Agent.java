package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agent implements Runnable{
	private Table table;
	private ArrayList<SandwichIngredient> availableIngredients;
	
	/**
	 * 
	 * @param table - shared table for Agent to add to
	 */
	public Agent (Table table) {
		this.table =  table;
		this.availableIngredients = new ArrayList<SandwichIngredient>();
		availableIngredients.add(SandwichIngredient.BREAD);
		availableIngredients.add(SandwichIngredient.JAM);
		availableIngredients.add(SandwichIngredient.PEANUT_BUTTER);
	}
	
	/**
	 * shuffles list of ingredients and picks first two items in new list as a sublist
	 * @return ArrayList<SandwichIngredient>
	 */
	private ArrayList<SandwichIngredient> chooseRandomIngredients() {
		ArrayList<SandwichIngredient> newList = new ArrayList<SandwichIngredient>(this.availableIngredients);
		Collections.shuffle(newList);
		return new ArrayList<SandwichIngredient>(newList.subList(0, 2));
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (table) {
				while (table.isTableFull()) {
					try {
						table.wait();
					} catch (InterruptedException e) {
						System.err.println(e);
						return;
					}
				}
					
				table.addIngredients(chooseRandomIngredients());
				
				table.notifyAll();
		
				
			}
		}
		}

}
