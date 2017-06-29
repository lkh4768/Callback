/**
 * Created by WES on 2017-06-30.
 */
public class Main {
    public static void main(String args[])
    {
        CallbackUser cu = new CallbackUser();
        cu.call(new Callback() {
            @Override
            public void print() {
                System.out.println("this is Callback");
            }
        });

        Callback cb = new CallbackImpl();
        cu.call(cb);
    }
}
