package com.iot.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = -5397509916926006362L;	
	
	private String sub;
	private String country;
	private String employeetype;
	private String firstname;
	private String gehrbusinesssegment;
	private String mail;
	private String gessobusinessunit;
	private String title;
	private String[] gevdsGroupIDmemberOf;	
	private String lastname;
	private String gessocompanyname;
	private String gehrindustrygroup;
	private String gessojobfunction;
	private String street;
	private String location;
	private String state;
	
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("given_name")
	private String givenName;
	@JsonProperty("family_name")
	private String familyName;
	private String email;
	private String name;	
	
	
}
