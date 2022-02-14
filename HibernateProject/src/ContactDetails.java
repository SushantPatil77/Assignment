import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ContactDetails {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long cid;
	    private String phone, email;
	    @Embedded
	    private ContenctType contenctType;
		public ContactDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ContactDetails(Long cid, String phone, String email, ContenctType contenctType) {
			super();
			this.cid = cid;
			this.phone = phone;
			this.email = email;
			this.contenctType = contenctType;
		}
		@Override
		public int hashCode() {
			return Objects.hash(cid, contenctType, email, phone);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ContactDetails other = (ContactDetails) obj;
			return Objects.equals(cid, other.cid) && contenctType == other.contenctType
					&& Objects.equals(email, other.email) && Objects.equals(phone, other.phone);
		}
		public Long getCid() {
			return cid;
		}
		public void setCid(Long cid) {
			this.cid = cid;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public ContenctType getContenctType() {
			return contenctType;
		}
		public void setContenctType(ContenctType contenctType) {
			this.contenctType = contenctType;
		}
		@Override
		public String toString() {
			return "ContactDetails [cid=" + cid + ", phone=" + phone + ", email=" + email + ", contenctType="
					+ contenctType + "]";
		}
	    
	    
	    
}
