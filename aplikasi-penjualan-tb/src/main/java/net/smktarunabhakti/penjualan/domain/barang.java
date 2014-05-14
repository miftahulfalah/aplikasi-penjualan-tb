package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_barang")
public class barang implements Serializable {
	
		@Id
		@GeneratedValue(generator = "system-uuid")
		@GenericGenerator(name = "system-uuid", strategy = "uuid2")
		private String Id;
		
		@NotNull
		@Column(name="kode_barang", nullable = false, length=5)
		private String kodebarang;
		
		@Column(name="nama_barang", nullable = false)
		private String namabarang;

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public String getKodebarang() {
			return kodebarang;
		}

		public void setKodebarang(String kodebarang) {
			this.kodebarang = kodebarang;
		}

		public String getNamabarang() {
			return namabarang;
		}

		public void setNamabarang(String namabarang) {
			this.namabarang = namabarang;
		}
		
	}

