package in.example.order_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.example.order_management.entity.ProductTransaction;
import in.example.order_management.service.ProductTransactionService;

@RestController
@RequestMapping("/productTransaction")
public class ProductTransactionController {
	
	@Autowired
	private ProductTransactionService productTransactionService;
	
	

	@PostMapping("/inqty")
	public String  inQty(@RequestBody ProductTransaction productTransaction) {
		return productTransactionService.saveInQty(productTransaction);
	}
	
	@PostMapping("/outqty")
	public String outQty(@RequestBody ProductTransaction productTransaction) {
		return productTransactionService.saveOutQty(productTransaction);
	}
	
	@GetMapping("/availableqty/{id}")
	public ResponseEntity<Integer> availableQty(@PathVariable long id){
		int availableQty = productTransactionService.availableQty(id);
        return new ResponseEntity<>(availableQty, HttpStatus.ACCEPTED);
	}
	
}
