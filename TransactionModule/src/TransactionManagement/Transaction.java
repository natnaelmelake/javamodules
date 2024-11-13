package TransactionManagement;


import ItemManagement.Item;
import UserManagement.User;


public class Transaction {
    private int transactionId;
    private User user;
    private Item item;

    public Transaction(int transactionId, User user, Item item) {
        this.transactionId = transactionId;
        this.user = user;
        this.item = item;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", user=" + user + ", item=" + item + "]";
    }


}

