package com.pfa.amicali.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "feedBack")

public class FeedBack implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;    
 
    @Column(name = "provider_name", nullable = false, length = 100)
    private String provider_name;
 
    @Column(name = "email_address", nullable = false, length = 100)
    private String provider_Email;    
 
    @Column(name = "comment", nullable = false, length = 1000)
    private String comment;
 
    @Column(name = "rating", nullable = true)
    private int rating;
 
    @ManyToOne
    @JoinColumn(name = "product", nullable = false)
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "provider", nullable = false)
    private Provider providers;
	@Column(name = "created", nullable = true)
    private Date created;

	public FeedBack(Long id, String provider_name, String provider_Email, String comment, int rating,
					Product product, Date created) {
		super();
		this.id = id;
		this.provider_name = provider_name;
		this.provider_Email = provider_Email;
		this.comment = comment;
		this.rating = rating;
		this.product = product;
		this.created = created;
	}

	public FeedBack() {

	}
 
    @PrePersist
      protected void onCreate() {
        created = new Date();
      }

    public Provider getProviders() {
		return providers;
	}

	public void setProviders(Provider providers) {
		this.providers = providers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public String getProvider_Email() {
		return provider_Email;
	}

	public void setProvider_Email(String provider_Email) {
		this.provider_Email = provider_Email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "feedBack [id=" + id + ", provider_name=" + provider_name + ", provider_Email=" + provider_Email
				+ ", comment=" + comment + ", rating=" + rating + ", product=" + product + ", created=" + created + "]";
	}
 

 
}