public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("A circle is drawn!");
    }

    @Override
    public void colorize(){
        System.out.println("A circle is colorized!");
    }
}
