package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.gudetama.Attribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lead
 */
@Validated

public class Lead  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private Attribute attributes = null;

  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Company")
  private String company = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("Street")
  private String street = null;

  @JsonProperty("PostalCode")
  private String postalCode = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("StateCode")
  private String stateCode = null;

  @JsonProperty("GeoCodeAccuracy")
  private String geoCodeAccuracy = null;

  @JsonProperty("OwnerId")
  private String ownerId = null;

  @JsonProperty("RecordTypeId")
  private String recordTypeId = null;

  @JsonProperty("External_ID__c")
  private String externalIDC = null;

  @JsonProperty("Source_System__c")
  private String sourceSystemC = null;

  @JsonProperty("Integration_Key__c")
  private String integrationKeyC = null;

  @JsonProperty("Source_Channel__c")
  private String sourceChannelC = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("CountryCode")
  private String countryCode = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("Latitude")
  private String latitude = null;

  @JsonProperty("Longitude")
  private String longitude = null;

  @JsonProperty("AnnualRevenue")
  private BigDecimal annualRevenue = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("DoNotCall")
  private Boolean doNotCall = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("HasOptedOutOfEmail")
  private Boolean hasOptedOutOfEmail = null;

  @JsonProperty("Fax")
  private String fax = null;

  @JsonProperty("HasOptedOutOfFax")
  private Boolean hasOptedOutOfFax = null;

  @JsonProperty("Industry")
  private String industry = null;

  @JsonProperty("LeadSource")
  private String leadSource = null;

  @JsonProperty("MobilePhone")
  private String mobilePhone = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Salutation")
  private String salutation = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("MiddleName")
  private String middleName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  @JsonProperty("NumberOfEmployees")
  private Integer numberOfEmployees = null;

  @JsonProperty("Phone")
  private String phone = null;

  @JsonProperty("Rating")
  private String rating = null;

  @JsonProperty("Title")
  private String title = null;

  @JsonProperty("Website")
  private String website = null;

  @JsonProperty("CreatedDate")
  private String createdDate = null;

  @JsonProperty("LastModifiedDate")
  private String lastModifiedDate = null;

  @JsonProperty("PhotoUrl")
  private String photoUrl = null;

  public Lead attributes(Attribute attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Attribute getAttributes() {
    return attributes;
  }

  public void setAttributes(Attribute attributes) {
    this.attributes = attributes;
  }

  public Lead id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Lead company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Lead status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Lead street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(value = "")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Lead postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Lead state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Lead stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  **/
  @ApiModelProperty(value = "")


  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public Lead geoCodeAccuracy(String geoCodeAccuracy) {
    this.geoCodeAccuracy = geoCodeAccuracy;
    return this;
  }

  /**
   * Get geoCodeAccuracy
   * @return geoCodeAccuracy
  **/
  @ApiModelProperty(value = "")


  public String getGeoCodeAccuracy() {
    return geoCodeAccuracy;
  }

  public void setGeoCodeAccuracy(String geoCodeAccuracy) {
    this.geoCodeAccuracy = geoCodeAccuracy;
  }

  public Lead ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Lead recordTypeId(String recordTypeId) {
    this.recordTypeId = recordTypeId;
    return this;
  }

  /**
   * Get recordTypeId
   * @return recordTypeId
  **/
  @ApiModelProperty(value = "")


  public String getRecordTypeId() {
    return recordTypeId;
  }

  public void setRecordTypeId(String recordTypeId) {
    this.recordTypeId = recordTypeId;
  }

  public Lead externalIDC(String externalIDC) {
    this.externalIDC = externalIDC;
    return this;
  }

  /**
   * Get externalIDC
   * @return externalIDC
  **/
  @ApiModelProperty(value = "")


  public String getExternalIDC() {
    return externalIDC;
  }

  public void setExternalIDC(String externalIDC) {
    this.externalIDC = externalIDC;
  }

  public Lead sourceSystemC(String sourceSystemC) {
    this.sourceSystemC = sourceSystemC;
    return this;
  }

  /**
   * Get sourceSystemC
   * @return sourceSystemC
  **/
  @ApiModelProperty(value = "")


  public String getSourceSystemC() {
    return sourceSystemC;
  }

  public void setSourceSystemC(String sourceSystemC) {
    this.sourceSystemC = sourceSystemC;
  }

  public Lead integrationKeyC(String integrationKeyC) {
    this.integrationKeyC = integrationKeyC;
    return this;
  }

  /**
   * Get integrationKeyC
   * @return integrationKeyC
  **/
  @ApiModelProperty(value = "")


  public String getIntegrationKeyC() {
    return integrationKeyC;
  }

  public void setIntegrationKeyC(String integrationKeyC) {
    this.integrationKeyC = integrationKeyC;
  }

  public Lead sourceChannelC(String sourceChannelC) {
    this.sourceChannelC = sourceChannelC;
    return this;
  }

  /**
   * Get sourceChannelC
   * @return sourceChannelC
  **/
  @ApiModelProperty(value = "")


  public String getSourceChannelC() {
    return sourceChannelC;
  }

  public void setSourceChannelC(String sourceChannelC) {
    this.sourceChannelC = sourceChannelC;
  }

  public Lead country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Lead countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Lead city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Lead latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Lead longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Lead annualRevenue(BigDecimal annualRevenue) {
    this.annualRevenue = annualRevenue;
    return this;
  }

  /**
   * Get annualRevenue
   * @return annualRevenue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAnnualRevenue() {
    return annualRevenue;
  }

  public void setAnnualRevenue(BigDecimal annualRevenue) {
    this.annualRevenue = annualRevenue;
  }

  public Lead description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Lead doNotCall(Boolean doNotCall) {
    this.doNotCall = doNotCall;
    return this;
  }

  /**
   * Get doNotCall
   * @return doNotCall
  **/
  @ApiModelProperty(value = "")


  public Boolean isDoNotCall() {
    return doNotCall;
  }

  public void setDoNotCall(Boolean doNotCall) {
    this.doNotCall = doNotCall;
  }

  public Lead email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Lead hasOptedOutOfEmail(Boolean hasOptedOutOfEmail) {
    this.hasOptedOutOfEmail = hasOptedOutOfEmail;
    return this;
  }

  /**
   * Get hasOptedOutOfEmail
   * @return hasOptedOutOfEmail
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasOptedOutOfEmail() {
    return hasOptedOutOfEmail;
  }

  public void setHasOptedOutOfEmail(Boolean hasOptedOutOfEmail) {
    this.hasOptedOutOfEmail = hasOptedOutOfEmail;
  }

  public Lead fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Lead hasOptedOutOfFax(Boolean hasOptedOutOfFax) {
    this.hasOptedOutOfFax = hasOptedOutOfFax;
    return this;
  }

  /**
   * Get hasOptedOutOfFax
   * @return hasOptedOutOfFax
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasOptedOutOfFax() {
    return hasOptedOutOfFax;
  }

  public void setHasOptedOutOfFax(Boolean hasOptedOutOfFax) {
    this.hasOptedOutOfFax = hasOptedOutOfFax;
  }

  public Lead industry(String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   * @return industry
  **/
  @ApiModelProperty(value = "")


  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public Lead leadSource(String leadSource) {
    this.leadSource = leadSource;
    return this;
  }

  /**
   * Get leadSource
   * @return leadSource
  **/
  @ApiModelProperty(value = "")


  public String getLeadSource() {
    return leadSource;
  }

  public void setLeadSource(String leadSource) {
    this.leadSource = leadSource;
  }

  public Lead mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @ApiModelProperty(value = "")


  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public Lead name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Lead salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * Get salutation
   * @return salutation
  **/
  @ApiModelProperty(value = "")


  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public Lead firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Lead middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Lead lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Lead numberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
    return this;
  }

  /**
   * Get numberOfEmployees
   * @return numberOfEmployees
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public Lead phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Lead rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Lead title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Lead website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Lead createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")


  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Lead lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")


  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public Lead photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
  **/
  @ApiModelProperty(value = "")


  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lead lead = (Lead) o;
    return Objects.equals(this.attributes, lead.attributes) &&
        Objects.equals(this.id, lead.id) &&
        Objects.equals(this.company, lead.company) &&
        Objects.equals(this.status, lead.status) &&
        Objects.equals(this.street, lead.street) &&
        Objects.equals(this.postalCode, lead.postalCode) &&
        Objects.equals(this.state, lead.state) &&
        Objects.equals(this.stateCode, lead.stateCode) &&
        Objects.equals(this.geoCodeAccuracy, lead.geoCodeAccuracy) &&
        Objects.equals(this.ownerId, lead.ownerId) &&
        Objects.equals(this.recordTypeId, lead.recordTypeId) &&
        Objects.equals(this.externalIDC, lead.externalIDC) &&
        Objects.equals(this.sourceSystemC, lead.sourceSystemC) &&
        Objects.equals(this.integrationKeyC, lead.integrationKeyC) &&
        Objects.equals(this.sourceChannelC, lead.sourceChannelC) &&
        Objects.equals(this.country, lead.country) &&
        Objects.equals(this.countryCode, lead.countryCode) &&
        Objects.equals(this.city, lead.city) &&
        Objects.equals(this.latitude, lead.latitude) &&
        Objects.equals(this.longitude, lead.longitude) &&
        Objects.equals(this.annualRevenue, lead.annualRevenue) &&
        Objects.equals(this.description, lead.description) &&
        Objects.equals(this.doNotCall, lead.doNotCall) &&
        Objects.equals(this.email, lead.email) &&
        Objects.equals(this.hasOptedOutOfEmail, lead.hasOptedOutOfEmail) &&
        Objects.equals(this.fax, lead.fax) &&
        Objects.equals(this.hasOptedOutOfFax, lead.hasOptedOutOfFax) &&
        Objects.equals(this.industry, lead.industry) &&
        Objects.equals(this.leadSource, lead.leadSource) &&
        Objects.equals(this.mobilePhone, lead.mobilePhone) &&
        Objects.equals(this.name, lead.name) &&
        Objects.equals(this.salutation, lead.salutation) &&
        Objects.equals(this.firstName, lead.firstName) &&
        Objects.equals(this.middleName, lead.middleName) &&
        Objects.equals(this.lastName, lead.lastName) &&
        Objects.equals(this.numberOfEmployees, lead.numberOfEmployees) &&
        Objects.equals(this.phone, lead.phone) &&
        Objects.equals(this.rating, lead.rating) &&
        Objects.equals(this.title, lead.title) &&
        Objects.equals(this.website, lead.website) &&
        Objects.equals(this.createdDate, lead.createdDate) &&
        Objects.equals(this.lastModifiedDate, lead.lastModifiedDate) &&
        Objects.equals(this.photoUrl, lead.photoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, company, status, street, postalCode, state, stateCode, geoCodeAccuracy, ownerId, recordTypeId, externalIDC, sourceSystemC, integrationKeyC, sourceChannelC, country, countryCode, city, latitude, longitude, annualRevenue, description, doNotCall, email, hasOptedOutOfEmail, fax, hasOptedOutOfFax, industry, leadSource, mobilePhone, name, salutation, firstName, middleName, lastName, numberOfEmployees, phone, rating, title, website, createdDate, lastModifiedDate, photoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lead {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    geoCodeAccuracy: ").append(toIndentedString(geoCodeAccuracy)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    recordTypeId: ").append(toIndentedString(recordTypeId)).append("\n");
    sb.append("    externalIDC: ").append(toIndentedString(externalIDC)).append("\n");
    sb.append("    sourceSystemC: ").append(toIndentedString(sourceSystemC)).append("\n");
    sb.append("    integrationKeyC: ").append(toIndentedString(integrationKeyC)).append("\n");
    sb.append("    sourceChannelC: ").append(toIndentedString(sourceChannelC)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    annualRevenue: ").append(toIndentedString(annualRevenue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    doNotCall: ").append(toIndentedString(doNotCall)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hasOptedOutOfEmail: ").append(toIndentedString(hasOptedOutOfEmail)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    hasOptedOutOfFax: ").append(toIndentedString(hasOptedOutOfFax)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    leadSource: ").append(toIndentedString(leadSource)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    numberOfEmployees: ").append(toIndentedString(numberOfEmployees)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

