package org.gudetama;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.gudetama.CompositeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositeResponseObject
 */
@Validated

public class CompositeResponseObject  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("compositeResponse")
  @Valid
  private List<CompositeResponse> compositeResponse = null;

  public CompositeResponseObject compositeResponse(List<CompositeResponse> compositeResponse) {
    this.compositeResponse = compositeResponse;
    return this;
  }

  public CompositeResponseObject addCompositeResponseItem(CompositeResponse compositeResponseItem) {
    if (this.compositeResponse == null) {
      this.compositeResponse = new ArrayList<CompositeResponse>();
    }
    this.compositeResponse.add(compositeResponseItem);
    return this;
  }

  /**
   * Get compositeResponse
   * @return compositeResponse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompositeResponse> getCompositeResponse() {
    return compositeResponse;
  }

  public void setCompositeResponse(List<CompositeResponse> compositeResponse) {
    this.compositeResponse = compositeResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeResponseObject compositeResponseObject = (CompositeResponseObject) o;
    return Objects.equals(this.compositeResponse, compositeResponseObject.compositeResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeResponseObject {\n");
    
    sb.append("    compositeResponse: ").append(toIndentedString(compositeResponse)).append("\n");
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

