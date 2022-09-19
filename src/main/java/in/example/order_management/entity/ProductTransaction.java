package in.example.order_management.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tbl_product_transaction")
public class ProductTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long productItemId;
	
	@Column(columnDefinition = "integer default 0")
	private long inQty;
	
	@Column(columnDefinition = "integer default 0")
	private long outQty;
	
	@CreationTimestamp
	private Timestamp createdTime;
	
	@UpdateTimestamp
	private Timestamp updatedTime;
	
	@Column(name = "is_deleted",columnDefinition = "integer default 0")
	private int isDeleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductItemId() {
		return productItemId;
	}

	public void setProductItemId(long productItemId) {
		this.productItemId = productItemId;
	}

	public long getInQty() {
		return inQty;
	}

	public void setInQty(long inQty) {
		this.inQty = inQty;
	}

	public long getOutQty() {
		return outQty;
	}

	public void setOutQty(long outQty) {
		this.outQty = outQty;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public ProductTransaction() {
		super();
	}

	public ProductTransaction(long id, long productItemId, long inQty, long outQty, Timestamp createdTime,
			Timestamp updatedTime, int isDeleted) {
		super();
		this.id = id;
		this.productItemId = productItemId;
		this.inQty = inQty;
		this.outQty = outQty;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.isDeleted = isDeleted;
	}

	
	
	

}
