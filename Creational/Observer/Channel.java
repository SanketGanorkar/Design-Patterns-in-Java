import java.util.ArrayList;
import java.util.List;
public class Channel implements ISubject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(IObserver observer){
        subscribers.add((Subscriber) observer);
    }

    @Override
    public void unsubscribe(IObserver observer){
        subscribers.remove((Subscriber) observer);
    }

    @Override
    public void notifyObservers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void uploadVideo(String title){
        this.title = title;
        System.out.println("Video Uploaded: " + title);
        notifySubscribers();
    }
}
