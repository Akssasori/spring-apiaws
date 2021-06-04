package com.springapiaws.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.springapiaws.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private Date creationDate;
	private RequestState state;
	private User user;
	private List<RequestState> statges = new ArrayList<RequestState>();
	
	//

}
