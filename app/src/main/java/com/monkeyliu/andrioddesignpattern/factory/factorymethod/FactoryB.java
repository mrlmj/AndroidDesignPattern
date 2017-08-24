package com.monkeyliu.andrioddesignpattern.factory.factorymethod;

import com.monkeyliu.andrioddesignpattern.factory.product.IProduct;
import com.monkeyliu.andrioddesignpattern.factory.product.ProductB;

/**
 * Created by monkey on 2017/8/23.
 */

public class FactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
