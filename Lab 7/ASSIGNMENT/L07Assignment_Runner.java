
public class L07Assignment_Runner {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Large",1,1,2);
		Pizza p2 = new Pizza();
		
		PizzaOrder o1 = new PizzaOrder(p1, p2);
		
		System.out.println(p1.getDescription());
		System.out.println("Cost of this pizza is: "+p1.calcCost()+"\n");
		System.out.println(p2.getDescription());
		System.out.println("Cost of this pizza is: "+p2.calcCost()+"\n");
		
		System.out.println("Cost of the total Order is: "+o1.calcTotal()+"\n");
		

	}

}
