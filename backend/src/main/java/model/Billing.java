package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Period;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="billing")
public class Billing implements Serializable{

	private static final long serialVersionUID = -6882394239673689489L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	Date paidDate;
	
	@NotNull
	Period period;
	
	@NotNull
	private BigDecimal total;

	public Billing() {
		super();
	}

	public Billing(Date paidDate, Period period, BigDecimal total) {
		super();
		this.paidDate = paidDate;
		this.period = period;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

}
