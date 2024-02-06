class EmployeeBuilderExample {
	public static void main(String[] args) {
		//Building the object of Employee thru the build() method provided in EmployeeBuilder class.
		Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
		System.out.println(employee);

		Employee employee2 = new Employee.EmployeeBuilder("Betaal", "EFG").setHasCar(true).setHasBike(true).build();
		System.out.println(employee2);

	}
}