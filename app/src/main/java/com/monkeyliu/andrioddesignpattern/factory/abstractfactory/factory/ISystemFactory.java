package com.monkeyliu.andrioddesignpattern.factory.abstractfactory.factory;

import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IInterfaceController;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IOperatorController;

/**
 * Created by monkey on 2017/8/24.
 * 抽象工厂模式：是工厂方法模式的升级版。
 *
 * 为了解决工厂方法模式会有大量的工厂类的问题，在某些特定的场景下，不再是一个工厂生产一个产品，
 * 而是一个工厂生产一类产品，可以大大减少系统的复杂度。并且统一了同一个产品族的初始化。
 *
 * 这种方案是具有倾斜性的"开闭原则"，对于增加一个产品族来说，可以满足开闭原则，但是如果增加一个产品，
 * 则需要修改所有其他的工厂。所以这种模式适用于那种前期设计稳定，确定不会增加产品的场景。
 */

public interface ISystemFactory {
    IInterfaceController createInterfaceController();
    IOperatorController createOperatorController();
}
