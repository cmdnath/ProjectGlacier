package com.accuweather.glacier.api.objects1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Headline",
"DailyForecasts"
})
public class Example  {
	@JsonProperty("Headline")
	private Headline2 headline;
	@JsonProperty("DailyForecasts")
	private List<DailyForecast> dailyForecasts = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	



	/**
	* No args constructor for use in serialization
	* 
	*/
	public Example() {
	}
	/**
	* 
	* @param headline
	* @param dailyForecasts
	*/
	public Example(Headline2 headline, List<DailyForecast> dailyForecasts) {
	super();
	this.headline = headline;
	this.dailyForecasts = dailyForecasts;
	}

	@JsonProperty("Headline")
	public Headline2 getHeadline() {
	return headline;
	}

	@JsonProperty("Headline")
	public void setHeadline(Headline2 headline) {
	this.headline = headline;
	}

	@JsonProperty("DailyForecasts")
	public List<DailyForecast> getDailyForecasts() {
	return dailyForecasts;
	}

	@JsonProperty("DailyForecasts")
	public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
	this.dailyForecasts = dailyForecasts;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
	return new ToStringBuilder(this).append("headline", headline).append("dailyForecasts", dailyForecasts).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
	return new HashCodeBuilder().append(headline).append(additionalProperties).append(dailyForecasts).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
	if (other == this) {
	return true;
	}
	if ((other instanceof Example) == false) {
	return false;
	}
	Example rhs = ((Example) other);
	return new EqualsBuilder().append(headline, rhs.headline).append(additionalProperties, rhs.additionalProperties).append(dailyForecasts, rhs.dailyForecasts).isEquals();
	}

}
