package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.transaction.Transactional;
@Service
@Transactional

public class CustomerService {

	@Autowired
	private CustomerRepository rep;
   public List<Customer> listAll() {
	return rep.findAll();}

public Customer get(Integer id) {
	return rep.findById(id).get();
}

public void save(Customer customer) {
	
	rep.save(customer);
}

public void delete(Integer id) {
	rep.deleteById(id);
	
}

}

