package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.gudetama.CompositeResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositeResponse
 */
@Validated

public class CompositeResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("body")
  @Valid
  private List<CompositeResponseBody> body = null;

  @JsonProperty("httpStatusCode")
  private Integer httpStatusCode = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  @JsonProperty("httpHeaders")
  @Valid
  private Map<String, String> httpHeaders = null;

  public CompositeResponse body(List<CompositeResponseBody> body) {
    this.body = body;
    return this;
  }

  public CompositeResponse addBodyItem(CompositeResponseBody bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<CompositeResponseBody>();
    }
    this.body.add(bodyItem);
    return this;
  }

  /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompositeResponseBody> getBody() {
    return body;
  }

  public void setBody(List<CompositeResponseBody> body) {
    this.body = body;
  }

  public CompositeResponse httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * Get httpStatusCode
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "200", value = "")


  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public CompositeResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(example = "refAccount", value = "")


  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public CompositeResponse httpHeaders(Map<String, String> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public CompositeResponse putHttpHeadersItem(String key, String httpHeadersItem) {
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
    CompositeResponse compositeResponse = (CompositeResponse) o;
    return Objects.equals(this.body, compositeResponse.body) &&
        Objects.equals(this.httpStatusCode, compositeResponse.httpStatusCode) &&
        Objects.equals(this.referenceId, compositeResponse.referenceId) &&
        Objects.equals(this.httpHeaders, compositeResponse.httpHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, httpStatusCode, referenceId, httpHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeResponse {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

