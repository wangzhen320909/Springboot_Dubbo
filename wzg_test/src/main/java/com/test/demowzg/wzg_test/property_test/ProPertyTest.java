package com.test.demowzg.wzg_test.property_test;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ProPertyTest {

    public void test1() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReturnVo returnVo = new ReturnVo("000000000000", "SUCCESS");

        Map<String, Object> map = new HashMap<>();
        PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
        PropertyDescriptor[] propertyDescriptors = propertyUtilsBean.getPropertyDescriptors(returnVo);
        for(int i=0;i<propertyDescriptors.length;i++){
            String name = propertyDescriptors[i].getName();
            Object o = propertyUtilsBean.getNestedProperty(returnVo, name);
            System.out.println(name);
            map.put(name, o);
        }
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ProPertyTest proPertyTest = new ProPertyTest();
        proPertyTest.test1();
    }
}
