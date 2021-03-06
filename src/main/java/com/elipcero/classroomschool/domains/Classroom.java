package com.elipcero.classroomschool.domains;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.elipcero.schoolcore.AbstractDomain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor
@ToString(callSuper = true) 
public class Classroom extends AbstractDomain {

	public Classroom(int id) {
		super(id);
	}
	
	@Column(length=50, nullable=false)
	private String name;
}
