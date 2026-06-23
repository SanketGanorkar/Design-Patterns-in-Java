public class Youtube {
    public static void main(String[] args) {
        Channel pewdipie = new Channel();

        Subscriber sub1 = new Subscriber("Sanket");
        Subscriber sub2 = new Subscriber("RJMannu");
        Subscriber sub3 = new Subscriber("DJMannu");

        pewdipie.subscribe(sub1);
        pewdipie.subscribe(sub2);
        pewdipie.subscribe(sub3);

        sub1.subscribedChannel(pewdipie);
        sub2.subscribedChannel(pewdipie);
        sub3.subscribedChannel(pewdipie);

        pewdipie.uploadVideo("Camera unboxing");
    }
}
