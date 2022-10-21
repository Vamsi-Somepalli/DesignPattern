public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("product class being visited");

	}

	public void visitTrading(Trading trading) {
		System.out.println("trading class being visited");

	}

	public void visitFacade(Facade facade) {
		System.out.println("visiting Facade class");

	}

}
