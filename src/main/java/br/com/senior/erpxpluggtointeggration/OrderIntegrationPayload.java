package br.com.senior.erpxpluggtointeggration;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.senior.erpx.city.City;
import br.com.senior.erpx.pessoa.Person;
import br.com.senior.pluggto.dto.PluggToOrder;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderIntegrationPayload {

    public static final JacksonDataFormat ORDER_INTEGRATION_PAYLOAD_FORMAT = new JacksonDataFormat(PluggToOrder.class);

    public PluggToOrder order;
    public City city;
    public Person customer;

}
