package com.zy.springmvc.common;

import org.springframework.cglib.beans.BeanMap;
import org.springframework.util.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhangy
 * @Date 19:21 2019/10/31
 **/
public class MapUtils {

    /**
     * 将对象装换为map
     *
     * @param bean
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = new HashMap();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将Map集合中的数据封装到JavaBean对象中
     * @param map        集合
     * @param classType 封装javabean对象
     * @throws Exception
     */
    public static <T> T map2bean(Map<String, Object> map,Class<T> classType) throws Exception
    {
        //采用反射动态创建对象
        T obj = classType.newInstance();
        //获取对象字节码信息,不要Object的属性
        BeanInfo beanInfo = Introspector.getBeanInfo(classType,Object.class);
        //获取bean对象中的所有属性
        PropertyDescriptor[] list = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd : list) {
            String key = pd.getName();    //获取属性名
            Object value=map.get(key);  //获取属性值
            if (null != value && !StringUtils.isEmpty(value)) pd.getWriteMethod().invoke(obj, value);//调用属性setter()方法,设置到javabean对象当中
        }
        return obj;
    }

    /**
     * 将List<T>转换为List<Map<String, Object>>
     *
     * @param objList
     * @return
     */
    public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
        List<Map<String, Object>> list = new ArrayList();
        if (objList != null && objList.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0, size = objList.size(); i < size; i++) {
                bean = objList.get(i);
                map = beanToMap(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 将List<Map<String,Object>>转换为List<T>
     *
     * @param maps
     * @param clazz
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps, Class<T> clazz)
            throws Exception {
        List<T> list = new ArrayList();
        if (maps != null && maps.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0, size = maps.size(); i < size; i++) {
                map = maps.get(i);
                bean = clazz.newInstance();
                map2bean(map, clazz);
                list.add(bean);
            }
        }
        return list;
    }


}
