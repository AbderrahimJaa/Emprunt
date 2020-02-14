package tp2.Emprunt.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String isBnLivre;
	private String titre;
	private int nbrExemplaires;

	@Override
	public String toString() {
		return "Livre [id=" + id + ", isBnLivre=" + isBnLivre + ", titre=" + titre + ", nbrExemplaires="
				+ nbrExemplaires + ", nombreJourEmprunt=" + nombreJourEmprunt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Livre other = (Livre) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Livre(long id, String isBnLivre, String titre, int nbrExemplaires, int nombreJourEmprunt) {
		super();
		this.id = id;
		this.isBnLivre = isBnLivre;
		this.titre = titre;
		this.nbrExemplaires = nbrExemplaires;
		this.nombreJourEmprunt = nombreJourEmprunt;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int nombreJourEmprunt;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the isBnLivre
	 */
	public String getIsBnLivre() {
		return isBnLivre;
	}

	/**
	 * @param isBnLivre the isBnLivre to set
	 */
	public void setIsBnLivre(String isBnLivre) {
		this.isBnLivre = isBnLivre;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the nbrExemplaires
	 */
	public int getNbrExemplaires() {
		return nbrExemplaires;
	}

	/**
	 * @param nbrExemplaires the nbrExemplaires to set
	 */
	public void setNbrExemplaires(int nbrExemplaires) {
		this.nbrExemplaires = nbrExemplaires;
	}

	/**
	 * @return the nombreJourEmprunt
	 */
	public int getNombreJourEmprunt() {
		return nombreJourEmprunt;
	}

	/**
	 * @param nombreJourEmprunt the nombreJourEmprunt to set
	 */
	public void setNombreJourEmprunt(int nombreJourEmprunt) {
		this.nombreJourEmprunt = nombreJourEmprunt;
	}

}
