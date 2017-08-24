package com.monkeyliu.andrioddesignpattern.factory.simplefactory;

import com.monkeyliu.andrioddesignpattern.factory.product.IProduct;
import com.monkeyliu.andrioddesignpattern.factory.product.ProductA;
import com.monkeyliu.andrioddesignpattern.factory.product.ProductB;

/**
 * Created by monkey on 2017/8/23.
 * 简单工厂模式：将产品类的创建封装在同一个类中，不再在客户端进行产品的创建
 * 缺点是：类的职责过重，如果要添加一个产品就需要修改原来的代码，违反了开闭原则。
 */

public class ProductFactory {
    public static IProduct getProdcut(String type) {
        switch (type) {
            case "ProductA":
                return new ProductA();
            case "ProductB":
                return new ProductB();
            default:
                return null;
        }
    }
}
