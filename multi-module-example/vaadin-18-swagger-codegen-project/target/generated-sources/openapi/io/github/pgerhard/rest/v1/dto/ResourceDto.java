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
import io.github.pgerhard.rest.v1.dto.MimeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A resource
 */
@ApiModel(description = "A resource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-26T22:11:15.151+01:00")
public class ResourceDto {
  @SerializedName("data")
  private String data = null;

  @SerializedName("mimeType")
  private MimeType mimeType = null;

  public ResourceDto data(String data) {
    this.data = data;
    return this;
  }

   /**
   * The Base64 encoded content of the requested resource
   * @return data
  **/
  @ApiModelProperty(value = "The Base64 encoded content of the requested resource")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ResourceDto mimeType(MimeType mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(value = "")
  public MimeType getMimeType() {
    return mimeType;
  }

  public void setMimeType(MimeType mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDto resourceDto = (ResourceDto) o;
    return Objects.equals(this.data, resourceDto.data) &&
        Objects.equals(this.mimeType, resourceDto.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDto {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

