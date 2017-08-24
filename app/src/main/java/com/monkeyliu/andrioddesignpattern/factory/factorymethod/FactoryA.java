package com.monkeyliu.andrioddesignpattern.factory.factorymethod;

import com.monkeyliu.andrioddesignpattern.factory.product.IProduct;
import com.monkeyliu.andrioddesignpattern.factory.product.ProductA;

/**
 * Created by monkey on 2017/8/23.
 */

public class FactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
