package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "tickets")
public class Tickets {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_ticket")
	@Getter @Setter
	private long id;

	@Getter @Setter
	@Column(name = "DateTravel")
	@Temporal(TemporalType.DATE)
	private Date dateTravel;

	@Getter @Setter
	@Column(name = "ArrivalDate")
	@Temporal(TemporalType.DATE)
	private Date arrivalDate;


	@Getter @Setter
	@Column(name = "TimeDeparture")
	@Temporal(TemporalType.TIME)
	private Date timeDeparture;

	@Getter @Setter
	@Column(name = "ArrivelTime")
	@Temporal(TemporalType.TIME)
	private Date arrivelTime;


	@ManyToOne
	@JoinColumn(name="id_route")
	@Getter @Setter
	private Route idRoute;

	@ManyToOne
	@JoinColumn(name="id_client")
	@Getter @Setter
	private Client idClient;




}
