package com.monkeyliu.andrioddesignpattern.factory.abstractfactory.factory;

import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.AndroidInterface;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.AndroidOperator;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IInterfaceController;
import com.monkeyliu.andrioddesignpattern.factory.abstractfactory.product.IOperatorController;

/**
 * Created by monkey on 2017/8/24.
 */

public class AndroidFactory implements ISystemFactory {

    @Override
    public IInterfaceController createInterfaceController() {
        return new AndroidInterface();
    }

    @Override
    public IOperatorController createOperatorController() {
        return new AndroidOperator();
    }
}
