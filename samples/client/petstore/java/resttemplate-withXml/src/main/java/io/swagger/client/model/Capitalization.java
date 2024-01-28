/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
/**
 * Capitalization
 */


@XmlRootElement(name = "Capitalization")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Capitalization")
public class Capitalization {
  @JsonProperty("smallCamel")
  @JacksonXmlProperty(localName = "smallCamel")
  @XmlElement(name = "smallCamel")
  private String smallCamel = null;

  @JsonProperty("CapitalCamel")
  @JacksonXmlProperty(localName = "CapitalCamel")
  @XmlElement(name = "CapitalCamel")
  private String capitalCamel = null;

  @JsonProperty("small_Snake")
  @JacksonXmlProperty(localName = "small_Snake")
  @XmlElement(name = "small_Snake")
  private String smallSnake = null;

  @JsonProperty("Capital_Snake")
  @JacksonXmlProperty(localName = "Capital_Snake")
  @XmlElement(name = "Capital_Snake")
  private String capitalSnake = null;

  @JsonProperty("SCA_ETH_Flow_Points")
  @JacksonXmlProperty(localName = "SCA_ETH_Flow_Points")
  @XmlElement(name = "SCA_ETH_Flow_Points")
  private String scAETHFlowPoints = null;

  @JsonProperty("ATT_NAME")
  @JacksonXmlProperty(localName = "ATT_NAME")
  @XmlElement(name = "ATT_NAME")
  private String ATT_NAME = null;

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

   /**
   * Get smallCamel
   * @return smallCamel
  **/
  @Schema(description = "")
  public String getSmallCamel() {
    return smallCamel;
  }

  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

   /**
   * Get capitalCamel
   * @return capitalCamel
  **/
  @Schema(description = "")
  public String getCapitalCamel() {
    return capitalCamel;
  }

  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

   /**
   * Get smallSnake
   * @return smallSnake
  **/
  @Schema(description = "")
  public String getSmallSnake() {
    return smallSnake;
  }

  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

   /**
   * Get capitalSnake
   * @return capitalSnake
  **/
  @Schema(description = "")
  public String getCapitalSnake() {
    return capitalSnake;
  }

  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

   /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
  **/
  @Schema(description = "")
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }

  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

   /**
   * Name of the pet 
   * @return ATT_NAME
  **/
  @Schema(description = "Name of the pet ")
  public String getATTNAME() {
    return ATT_NAME;
  }

  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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
