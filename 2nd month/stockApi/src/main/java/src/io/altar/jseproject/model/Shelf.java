package src.io.altar.jseproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=Shelf.GET_ALL_SHELVES_QUERY_NAME, query="SELECT s FROM Shelf s")
@NamedQuery(name=Shelf.GET_SHELVES_BY_PRODUCT_ID_QUERY_NAME, query="SELECT s FROM Shelf s WHERE s.product.id = :productId")
@NamedQuery(name=Shelf.GET_ALL_SHELVES_IDS, query="SELECT s.id FROM Shelf s")
public class Shelf extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_SHELVES_QUERY_NAME = "Shelf.getAllShelves";
	public static final String GET_SHELVES_BY_PRODUCT_ID_QUERY_NAME = "Shelf.getAllShelvesByProductId";
	public static final String GET_ALL_SHELVES_IDS = "Shelf.getAllShelvesIds";
	
	@ManyToOne(cascade=CascadeType.REMOVE)
	private Product product;
	private int size;
	private float price;
	
	public Shelf () {
	}
	

	public Shelf (int size, float price, Product product) {
		super();
		this.size = size;
		this.price = price;
		this.product = product;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}



}
