package tp2.Emprunt.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cin;
	private int pointFiabilite;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * @return the pointFiabilite
	 */
	public int getPointFiabilite() {
		return pointFiabilite;
	}
	/**
	 * @param pointFiabilite the pointFiabilite to set
	 */
	public void setPointFiabilite(int pointFiabilite) {
		this.pointFiabilite = pointFiabilite;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long id, String cin, int pointFiabilite) {
		super();
		this.id = id;
		this.cin = cin;
		this.pointFiabilite = pointFiabilite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emprunt2 [id=" + id + ", cin=" + cin + ", pointFiabilite=" + pointFiabilite + "]";
	}
	

}
