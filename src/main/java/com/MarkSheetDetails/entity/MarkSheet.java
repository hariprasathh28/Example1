package com.MarkSheetDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="marksheet_table")
public class MarkSheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int rollno;
	private int sem1theory;
	private int sem1practicals;
	private int sem2theory;
	private int sem2practicals;
	private int sem1total;
	private int sem2total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getSem1theory() {
		return sem1theory;
	}
	public void setSem1theory(int sem1theory) {
		this.sem1theory = sem1theory;
	}
	public int getSem1practicals() {
		return sem1practicals;
	}
	public void setSem1practicals(int sem1practicals) {
		this.sem1practicals = sem1practicals;
	}
	public int getSem2theory() {
		return sem2theory;
	}
	public void setSem2theory(int sem2theory) {
		this.sem2theory = sem2theory;
	}
	public int getSem2practicals() {
		return sem2practicals;
	}
	public void setSem2practicals(int sem2practicals) {
		this.sem2practicals = sem2practicals;
	}
	public int getSem1total() {
		return sem1total;
	}
	public void setSem1total(int sem1total) {
		this.sem1total = sem1total;
	}
	public int getSem2total() {
		return sem2total;
	}
	public void setSem2total(int sem2total) {
		this.sem2total = sem2total;
	}

}
