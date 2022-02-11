import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Laptop implements Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1356992991318477432L;
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int lid;
	    @Column(name = "PROCESSOR")
	    private String cpu;
	    @Column(name = "HARD_DISK", length = 6, nullable = true, insertable = true,
	            table = "laptop", updatable = true)
	    private String hdd;
	    private String ram;
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date mgf;
		public Laptop() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Laptop(int lid, String cpu, String hdd, String ram, Date mgf) {
			super();
			this.lid = lid;
			this.cpu = cpu;
			this.hdd = hdd;
			this.ram = ram;
			this.mgf = mgf;
		}
		@Override
		public int hashCode() {
			return Objects.hash(cpu, hdd, lid, mgf, ram);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Laptop other = (Laptop) obj;
			return Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd) && lid == other.lid
					&& Objects.equals(mgf, other.mgf) && Objects.equals(ram, other.ram);
		}
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public String getHdd() {
			return hdd;
		}
		public void setHdd(String hdd) {
			this.hdd = hdd;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public Date getMgf() {
			return mgf;
		}
		public void setMgf(Date mgf) {
			this.mgf = mgf;
		}
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", mgf=" + mgf + "]";
		}
	    
	    
}
