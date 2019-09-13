package com.designPattern.structural.flyweight;

import java.util.HashMap;

public class JDShapeFactory  {

    private static final HashMap<ShapeType,JDShape> shapes = new HashMap<ShapeType,JDShape>();

    public static JDShape getShape(ShapeType type) {
        JDShape shapeImpl = shapes.get(type);

        if(shapeImpl==null){
            if(type.equals(ShapeType.OVAL_FILL)){
                shapeImpl = new JDOval(true);
            }else if(type.equals(ShapeType.OVAL_NOFILL)){
                shapeImpl = new JDOval(false);
            }else if(type.equals(ShapeType.LINE)){
                shapeImpl = new JDLine();
            }
            shapes.put(type,shapeImpl);
        }
        return shapeImpl;
    }
        public static enum ShapeType{
            OVAL_FILL,OVAL_NOFILL,LINE;
        }
}
