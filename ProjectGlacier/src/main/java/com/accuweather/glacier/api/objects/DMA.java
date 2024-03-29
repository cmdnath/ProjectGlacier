package com.accuweather.glacier.api.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DMA {

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("EnglishName")
    private String englishName;

    /**
     * No args constructor for use in serialization
     *
     */
    public DMA() {
    }

    /**
     *
     * @param englishName
     * @param iD
     */
    public DMA(String iD, String englishName) {
        super();
        this.iD = iD;
        this.englishName = englishName;
    }

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    @JsonProperty("EnglishName")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iD", iD).append("englishName", englishName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(englishName).append(iD).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DMA) == false) {
            return false;
        }
        DMA rhs = ((DMA) other);
        return new EqualsBuilder().append(englishName, rhs.englishName).append(iD, rhs.iD).isEquals();
    }

}