public class OuterClass {
    public static void main(String[] args) {
        OtherClass myOther = new OtherClass();
        OtherClass.InnerClass myInner = new OtherClass.InnerClass();
        System.out.println(myInner.y + myOther.x);
        System.out.println(myInner.myInnerMethod());
    }
}
