package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HubGit 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
  private int hubgitId;
  private String hubgitName;
  private String hubgitEmail;

}
