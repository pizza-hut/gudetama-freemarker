package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.gudetama.CompositeRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositeRequestObject
 */
@Validated

public class CompositeRequestObject  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allOrNone")
  private Boolean allOrNone = null;

  @JsonProperty("compositeRequest")
  @Valid
  private List<CompositeRequest> compositeRequest = null;

  public CompositeRequestObject allOrNone(Boolean allOrNone) {
    this.allOrNone = allOrNone;
    return this;
  }

  /**
   * Specifies what to do when an error occurs while processing a subrequest. If the value is true, the entire composite request is rolled back. The top-level request returns HTTP 200 and includes responses for each subrequest. If the value is false, the remaining subrequests that don’t depend on the failed subrequest are executed. Dependent subrequests aren’t executed.
   * @return allOrNone
  **/
  @ApiModelProperty(example = "true", value = "Specifies what to do when an error occurs while processing a subrequest. If the value is true, the entire composite request is rolled back. The top-level request returns HTTP 200 and includes responses for each subrequest. If the value is false, the remaining subrequests that don’t depend on the failed subrequest are executed. Dependent subrequests aren’t executed.")


  public Boolean isAllOrNone() {
    return allOrNone;
  }

  public void setAllOrNone(Boolean allOrNone) {
    this.allOrNone = allOrNone;
  }

  public CompositeRequestObject compositeRequest(List<CompositeRequest> compositeRequest) {
    this.compositeRequest = compositeRequest;
    return this;
  }

  public CompositeRequestObject addCompositeRequestItem(CompositeRequest compositeRequestItem) {
    if (this.compositeRequest == null) {
      this.compositeRequest = new ArrayList<CompositeRequest>();
    }
    this.compositeRequest.add(compositeRequestItem);
    return this;
  }

  /**
   * Get compositeRequest
   * @return compositeRequest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompositeRequest> getCompositeRequest() {
    return compositeRequest;
  }

  public void setCompositeRequest(List<CompositeRequest> compositeRequest) {
    this.compositeRequest = compositeRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeRequestObject compositeRequestObject = (CompositeRequestObject) o;
    return Objects.equals(this.allOrNone, compositeRequestObject.allOrNone) &&
        Objects.equals(this.compositeRequest, compositeRequestObject.compositeRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOrNone, compositeRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeRequestObject {\n");
    
    sb.append("    allOrNone: ").append(toIndentedString(allOrNone)).append("\n");
    sb.append("    compositeRequest: ").append(toIndentedString(compositeRequest)).append("\n");
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

