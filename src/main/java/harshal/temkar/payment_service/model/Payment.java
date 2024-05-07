package harshal.temkar.payment_service.model;

import java.io.Serializable;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Table(name = "PAYMENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment implements Serializable{

	@Id
	@GeneratedValue
    @UuidGenerator(style = Style.TIME)
	@Column(name = "ID")
	private String id;

	@NotBlank
	@Column(name = "CUSTOMER_ID")
    private String customerid;
	
	@NotBlank
	@Column(name = "AMOUNT")
    private double amount;
	
	@NotBlank
	@Column(name = "STATUS")
    private String status;
}
