package com.pfa.amicali.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@Entity
@Table(name = "Provider")
public class Provider implements Serializable{
	
	public Provider(String taxCode, String provider_name, String phoneN, String email, String address, Date createdAt,
			Date updatedAt) {
		super();
		this.taxCode = taxCode;
		this.provider_name = provider_name;
		this.phoneN = phoneN;
		this.email = email;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Provider() {
		
	}
	


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "taxCode", nullable = false)
    private String taxCode;
   
	@Column(name = "provider_name", nullable = false)
    private String provider_name;
   
	@Column(name = "phoneN", nullable = false)
    private String phoneN;

	@Column(name = "email_address", nullable = false)
    private String email;
	

	@Column(name = "address", nullable = false)
    private String address;
   
	@Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;
    
    
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    
    
    
    
    @OneToMany(mappedBy = "Providers", fetch = FetchType.LAZY) private
	  List<Product> Products;
	  
	  
	  public List<Product> getProducts() {
		return Products;
	}


	public void setProducts(List<Product> Products) {
		this.Products = Products;
	}



	@OneToMany(mappedBy = "Providers", fetch = FetchType.LAZY) private
	  List<FeedBack> feedback;
	  
	  @Column(name="rating", columnDefinition = "int default 0") 
	  private int rating;
	 
	 


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTaxCode() {
		return taxCode;
	}


	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}


	public String getProvider_name() {
		return provider_name;
	}


	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}


	public String getPhoneN() {
		return phoneN;
	}


	public void setPhoneN(String phoneN) {
		this.phoneN = phoneN;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	
	

	public List<FeedBack> getFeedback() {
		return feedback;
	}


	public void setFeedback(List<FeedBack> feedback) {
		this.feedback = feedback;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Provider [id=" + id + ", taxCode=" + taxCode + ", provider_name=" + provider_name + ", phoneN=" + phoneN
				+ ", email=" + email + ", address=" + address + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
   

}
