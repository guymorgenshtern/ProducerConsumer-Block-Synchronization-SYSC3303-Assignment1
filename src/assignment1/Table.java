package assignment1;

import java.util.ArrayList;

public class Table {
	private static final int SIZE = 2;
	private ArrayList<SandwichIngredient> tableContents;
	private int sandwichCount;
	private boolean tableFull;
	private boolean tableEmpty;
	
	public Table() {
		tableContents = new ArrayList<SandwichIngredient>();
		sandwichCount = 0;
		tableFull = false;
		tableEmpty = true;
	}
	
	/**
	 * Add ingredients to the table, prints which ingredients were added, and updates table status
	 * @param ingredients - ArrayList of SandwichIngredient
	 */
	public void addIngredients (ArrayList<SandwichIngredient> ingredients) {
		this.tableContents.addAll(ingredients);
		System.out.println("Added: " + ingredients.get(0) + " " + ingredients.get(1));
		tableEmpty = false;
		tableFull = true;
		
	}
	
	/**
	 * clears ingredients from table given the final missing sandwich ingredient, prints final ingredient, updates sandwich count, 
	 * and updates table status
	 * @param finalIngredient
	 */
	public void useIngredients (SandwichIngredient finalIngredient) {
		this.tableContents.clear();
		sandwichCount++;
		System.out.println(sandwichCount + ", Final Ingredient: " + finalIngredient + " added");
		System.out.println("SANDWICH COUNT: " + sandwichCount);
		tableEmpty = true;
		tableFull = false;
	}
	
	/**
	 * 
	 * @return ArrayL of SandwichIngredient - current ingredients in table
	 */
	public ArrayList<SandwichIngredient> getTableContents() {
		return tableContents;
	}
	
	/**
	 * 
	 * @return int - number of sandwiches made
	 */
	public int getCount() {
		return sandwichCount;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean isTableFull() {
		return tableFull;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean isTableEmpty() {
		return tableEmpty;
	}
	
 }
 