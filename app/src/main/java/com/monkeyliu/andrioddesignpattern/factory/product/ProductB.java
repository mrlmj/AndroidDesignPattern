package com.monkeyliu.andrioddesignpattern.factory.product;

import android.util.Log;

/**
 * Created by monkey on 2017/8/23.
 */

public class ProductB implements IProduct {
    @Override
    public void sayHello() {
        Log.v(TAG, "ProductB hello");
    }
}
