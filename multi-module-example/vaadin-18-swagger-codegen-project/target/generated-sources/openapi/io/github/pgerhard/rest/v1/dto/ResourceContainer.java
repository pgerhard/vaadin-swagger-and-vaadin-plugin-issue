/*
 * Missing Cyberroom REST V1 DTO
 * Open API compliant schema definition
 *
 * OpenAPI spec version: 2020.12 - Version 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.pgerhard.rest.v1.dto;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.pgerhard.rest.v1.dto.ResourceDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A container for a list of resources
 */
@ApiModel(description = "A container for a list of resources")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-26T22:11:15.151+01:00")
public class ResourceContainer {
  @SerializedName("data")
  private List<ResourceDto> data = null;

  public ResourceContainer data(List<ResourceDto> data) {
    this.data = data;
    return this;
  }

  public ResourceContainer addDataItem(ResourceDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ResourceDto>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of resources
   * @return data
  **/
  @ApiModelProperty(value = "A list of resources")
  public List<ResourceDto> getData() {
    return data;
  }

  public void setData(List<ResourceDto> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceContainer resourceContainer = (ResourceContainer) o;
    return Objects.equals(this.data, resourceContainer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceContainer {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

