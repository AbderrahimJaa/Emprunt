package tp2.Emprunt.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private Livre livre;
	private Date dateEmprunt;
	private String isBnlivre;

	@ManyToOne
	private Client client;
	private Date dateRestituationPrevu;
	private Date dateRestituationEffective;

	/**
	 * @return the isBnlivre
	 */
	public String getIsBnlivre() {
		return isBnlivre;
	}

	/**
	 * @param isBnlivre the isBnlivre to set
	 */
	public void setIsBnlivre(String isBnlivre) {
		this.isBnlivre = isBnlivre;
	}

	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emprunt(Long id, Livre livre, Date dateEmprunt, Client client, Date dateRestituationPrevu,
			Date dateRestituationEffective) {
		super();
		this.id = id;
		this.livre = livre;
		this.dateEmprunt = dateEmprunt;
		this.client = client;
		this.dateRestituationPrevu = dateRestituationPrevu;
		this.dateRestituationEffective = dateRestituationEffective;
	}

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
	 * @return the livre
	 */
	public Livre getLivre() {
		return livre;
	}

	/**
	 * @param livre the livre to set
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	/**
	 * @return the dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	/**
	 * @param dateEmprunt the dateEmprunt to set
	 */
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the dateRestituationPrevu
	 */
	public Date getDateRestituationPrevu() {
		return dateRestituationPrevu;
	}

	/**
	 * @param dateRestituationPrevu the dateRestituationPrevu to set
	 */
	public void setDateRestituationPrevu(Date dateRestituationPrevu) {
		this.dateRestituationPrevu = dateRestituationPrevu;
	}

	/**
	 * @return the dateRestituationEffective
	 */
	public Date getDateRestituationEffective() {
		return dateRestituationEffective;
	}

	/**
	 * @param dateRestituationEffective the dateRestituationEffective to set
	 */
	public void setDateRestituationEffective(Date dateRestituationEffective) {
		this.dateRestituationEffective = dateRestituationEffective;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Emprunt other = (Emprunt) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", livre=" + livre + ", dateEmprunt=" + dateEmprunt + ", client=" + client
				+ ", dateRestituationPrevu=" + dateRestituationPrevu + ", dateRestituationEffective="
				+ dateRestituationEffective + "]";
	}

	public String getIsBnlivre1() {
		// TODO Auto-generated method stub
		return null;
	}

}
