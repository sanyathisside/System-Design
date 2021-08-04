
import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> itemList;

    public Cart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }
    public void removeItem(Item item){
        itemList.remove(item);
    }
    public void updateItemCount(Item item, int newCount){
        int index = itemList.indexOf(item);
        itemList.get(index).updateCount(newCount);
    }
    public ArrayList<Item> getitemList(){
        return itemList;
    }
    public void checkout(){
        itemList.clear();
    }
}
