package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Laptop  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1924758564324492557L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long lid;
	    private String brand, cpu,hdd,ram;
	    @OneToOne
	    @JoinColumn(name="emp_id")
	    private Employee empLaptop;
		public Laptop() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Laptop(Long lid, String brand, String cpu, String hdd, String ram, Employee empLaptop) {
			super();
			this.lid = lid;
			this.brand = brand;
			this.cpu = cpu;
			this.hdd = hdd;
			this.ram = ram;
			this.empLaptop = empLaptop;
		}
		public Long getLid() {
			return lid;
		}
		public void setLid(Long lid) {
			this.lid = lid;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
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
		public Employee getEmpLaptop() {
			return empLaptop;
		}
		public void setEmpLaptop(Employee empLaptop) {
			this.empLaptop = empLaptop;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public int hashCode() {
			return Objects.hash(brand, cpu, empLaptop, hdd, lid, ram);
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
			return Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu)
					&& Objects.equals(empLaptop, other.empLaptop) && Objects.equals(hdd, other.hdd)
					&& Objects.equals(lid, other.lid) && Objects.equals(ram, other.ram);
		}
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", brand=" + brand + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram
					+ ", empLaptop=" + empLaptop + "]";
		}
		
	    
	    
}
