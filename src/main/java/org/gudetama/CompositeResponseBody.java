package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositeResponseBody
 */
@Validated

public class CompositeResponseBody  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("errors")
  @Valid
  private List<Object> errors = null;

  @JsonProperty("totalSize")
  private Integer totalSize = null;

  @JsonProperty("done")
  private Boolean done = null;

  @JsonProperty("records")
  @Valid
  private List<Object> records = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;

  public CompositeResponseBody id(String id) {
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

  public CompositeResponseBody success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public CompositeResponseBody errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }

  public CompositeResponseBody addErrorsItem(Object errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Object>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")


  public List<Object> getErrors() {
    return errors;
  }

  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }

  public CompositeResponseBody totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public CompositeResponseBody done(Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public CompositeResponseBody records(List<Object> records) {
    this.records = records;
    return this;
  }

  public CompositeResponseBody addRecordsItem(Object recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Object>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")


  public List<Object> getRecords() {
    return records;
  }

  public void setRecords(List<Object> records) {
    this.records = records;
  }

  public CompositeResponseBody errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "INVALID_FIELD", value = "")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public CompositeResponseBody message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "Occupation__pc,Previous_NPS__pc,Primary_Account_Registration__pc1^ERROR at Row:1:Column:2234 No such column 'Primary_Account_Registration__pc1' on entity 'Account'. If you are attempting to use a custom field, be sure to append the '__c' after the custom field name. Please reference your WSDL or the describe call for the appropriate names.", value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeResponseBody compositeResponseBody = (CompositeResponseBody) o;
    return Objects.equals(this.id, compositeResponseBody.id) &&
        Objects.equals(this.success, compositeResponseBody.success) &&
        Objects.equals(this.errors, compositeResponseBody.errors) &&
        Objects.equals(this.totalSize, compositeResponseBody.totalSize) &&
        Objects.equals(this.done, compositeResponseBody.done) &&
        Objects.equals(this.records, compositeResponseBody.records) &&
        Objects.equals(this.errorCode, compositeResponseBody.errorCode) &&
        Objects.equals(this.message, compositeResponseBody.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, errors, totalSize, done, records, errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeResponseBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

