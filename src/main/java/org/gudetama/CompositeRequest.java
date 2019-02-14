package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositeRequest
 */
@Validated

public class CompositeRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("body")
  private Object body = null;

  @JsonProperty("httpHeaders")
  @Valid
  private Map<String, String> httpHeaders = null;

  public CompositeRequest method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "GET", value = "")


  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public CompositeRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(example = "refAccountFinancialAccount", value = "")


  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public CompositeRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "/services/data/v43.0/query/?q=select+Account__c,CreatedById,CreatedDate,CurrencyIsoCode,Id,IsDeleted,LastModifiedById,LastModifiedDate,Name,RecordTypeId,SystemModstamp+from+Account_Financial_Account__c+where+Account__c='@{refAccount[0].Id'", value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CompositeRequest body(Object body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")


  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }

  public CompositeRequest httpHeaders(Map<String, String> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public CompositeRequest putHttpHeadersItem(String key, String httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new HashMap<String, String>();
    }
    this.httpHeaders.put(key, httpHeadersItem);
    return this;
  }

  /**
   * Get httpHeaders
   * @return httpHeaders
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(Map<String, String> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeRequest compositeRequest = (CompositeRequest) o;
    return Objects.equals(this.method, compositeRequest.method) &&
        Objects.equals(this.referenceId, compositeRequest.referenceId) &&
        Objects.equals(this.url, compositeRequest.url) &&
        Objects.equals(this.body, compositeRequest.body) &&
        Objects.equals(this.httpHeaders, compositeRequest.httpHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, referenceId, url, body, httpHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
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

