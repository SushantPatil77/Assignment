package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2392205494352950635L;
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long eid;
	    private String name, phone, city;
	    @OneToOne(cascade = CascadeType.ALL ,mappedBy = "empLaptop")
	    private Laptop empLaptop;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(Long eid, String name, String phone, String city, Laptop empLaptop) {
			super();
			this.eid = eid;
			this.name = name;
			this.phone = phone;
			this.city = city;
			this.empLaptop = empLaptop;
		}
		@Override
		public int hashCode() {
			return Objects.hash(city, eid, empLaptop, name, phone);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(city, other.city) && Objects.equals(eid, other.eid)
					&& Objects.equals(empLaptop, other.empLaptop) && Objects.equals(name, other.name)
					&& Objects.equals(phone, other.phone);
		}
		public Long getEid() {
			return eid;
		}
		public void setEid(Long eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Laptop getEmpLaptop() {
			return empLaptop;
		}
		public void setEmpLaptop(Laptop empLaptop) {
			this.empLaptop = empLaptop;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", city=" + city + ", empLaptop="
					+ empLaptop + "]";
		}
		
	    

}
