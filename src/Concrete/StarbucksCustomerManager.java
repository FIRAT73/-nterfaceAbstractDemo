package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) 
		{
			this.Save(customer);
		}
		else 
		{
			System.out.println("Not a valid persons");
		}
		
	}

}
