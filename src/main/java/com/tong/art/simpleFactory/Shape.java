package com.tong.art.simpleFactory;

public abstract class Shape {

    public static Shape createShape(String type) throws UnsupportedShapeException {
        if (type.equals("round")) {
            return new Round();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        } else if (type.equals("triangle")) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("參數錯誤");
        }
    }

    public abstract void draw();

    public abstract void erase();
}
