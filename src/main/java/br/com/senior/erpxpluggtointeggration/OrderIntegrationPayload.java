package br.com.senior.erpxpluggtointeggration;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.senior.erpx.local.City;
import br.com.senior.erpx.person.Person;
import br.com.senior.pluggto.dto.PluggToOrder;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class OrderIntegrationPayload {

    public static final JacksonDataFormat ORDER_INTEGRATION_PAYLOAD_FORMAT = new JacksonDataFormat(OrderIntegrationPayload.class);

    @JsonProperty("order")
    public PluggToOrder order;
    @JsonProperty("city")
    public City city;
    @JsonProperty("customer")
    public Person customer;

}
