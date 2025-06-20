package exercise7;


//Observer Interface: Defines the update method that subjects will call.
public interface Observer {
 void update(String stockSymbol, double stockPrice);
}