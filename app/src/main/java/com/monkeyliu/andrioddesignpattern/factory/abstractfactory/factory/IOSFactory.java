package com.monkeyliu.andrioddesignpattern.factory.abstractfactory.factory;

import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IInterfaceController;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IOSInterface;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IOSOperator;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IOperatorController;

/**
 * Created by monkey on 2017/8/24.
 */

public class IOSFactory implements ISystemFactory {
    @Override
    public IInterfaceController createInterfaceController() {
        return new IOSInterface();
    }

    @Override
    public IOperatorController createOperatorController() {
        return new IOSOperator();
    }
}
