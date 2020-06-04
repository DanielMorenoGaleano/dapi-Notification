package com.avianca.pagos.rest.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.NotNull;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com> <br/>
 *         Date: 10/04/2018 9:04:30 a.m.
 *
 */
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
public class RequestDTO {

	@JsonProperty(value = "orderId")
	@NotNull
	private String orderId;
	@JsonProperty(value = "lastName")
	@NotNull
	private String lastName;
	@JsonProperty(value = "contactIds")
	@NotNull
	private List<String> contactIds;
	@JsonProperty(value = "lang")
	@NotNull
	private String lang;
	@JsonProperty(value = "layoutId")
	@NotNull
	private String layoutId;

	public RequestDTO() {
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getContactIds() {
		return contactIds;
	}

	public void setContactIds(List<String> contactIds) {
		this.contactIds = contactIds;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}

	@Override
	public String toString() {
		return "{\r\n" + "  \"orderId\": \"" + orderId.trim() + "\",\r\n" + "  \"lastName\": \"" + lastName.trim() + "\",\r\n" + "  \"contactIds\": " + contactIds.toString().replace("[","[\"").replace("]","\"]") + ",\r\n" + "  \"lang\": \"" + lang + "\",\r\n" + "  \"layoutId\": \"" + layoutId + "\"\r\n" + "}";
	}

}
