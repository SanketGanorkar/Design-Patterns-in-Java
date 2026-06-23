public class Subscriber implements IObserver {
    private String name;

    private Channel channel = new Channel();

    public Subscriber(String subname){
        super();
        this.name = subname;
    }

    @Override
    public void update(){
        System.out.println("Hey " + name + ", Video Uploaded");
    }

    @Override
    public void subscribedChannel(Channel ch){
        this.channel = ch;
    }
}