package assignment1;

public class Chef implements Runnable{
	private SandwichIngredient type;
	private Table table;
	
	/**
	 * 
	 * @param table - shared table for Chef to take from
	 * @param type - defines which ingredient chef is responsible for
	 */
	public Chef (Table table, SandwichIngredient type) {
		this.table = table;
		this.type = type;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) { 
			synchronized (table) {
				while ((table.isTableEmpty() || table.getTableContents().contains(type)) && table.getCount() < 20) {
					try {
						table.wait();
					} catch (InterruptedException e) {
						System.err.println(e);
						return;
					}
				}
				
				table.notifyAll();
				
				if (table.getTableContents().size() > 0) {
					table.useIngredients(type);
				}
				
			}
			
		}
	}
}
