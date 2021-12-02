package br.com.senior.erpxpluggtointeggration;

import br.com.senior.erpx.ProductPayload;
import br.com.senior.pluggto.dto.PluggToProductPayload;

public class ErpxToPluggToConverter {

    private ErpxToPluggToConverter() {
    }

    public static PluggToProductPayload toPluggToProduct(ProductPayload product) {
        PluggToProductPayload pluggToProduct = new PluggToProductPayload();
        pluggToProduct.sku = product.code;
        pluggToProduct.name = product.description;
        pluggToProduct.ean = product.barcode;
        pluggToProduct.shortDescription = product.additionalDescription;
        pluggToProduct.external = product.id;
        return pluggToProduct;
    }

}
