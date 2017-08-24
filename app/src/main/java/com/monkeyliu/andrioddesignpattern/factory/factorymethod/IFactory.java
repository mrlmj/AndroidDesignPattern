package com.monkeyliu.andrioddesignpattern.factory.factorymethod;

import com.monkeyliu.andrioddesignpattern.factory.product.IProduct;

/**
 * Created by monkey on 2017/8/23.
 * 工厂方法模式：为了遵循单一职责原则，将工厂类创建产品的方法抽象，由各个子类进行实现。每个工厂类中只负责
 * 对应产品的实现。即符合了单一职责原则，又符合了开闭原则。
 *
 * 缺点是：每个产品类都有对应的工厂类，增加了系统的复杂度。
 *
 * Java中集合框架的迭代器就是使用了此模式，将迭代器的实例化延迟到了每个数据结构中
 */

public interface IFactory {
    IProduct createProduct();
}
