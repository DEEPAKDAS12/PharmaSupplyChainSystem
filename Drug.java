import java.util.ArrayList;
import java.util.List;

public class Drug {
    private String name;
    private int batchNumber;
    private String currentOwner;
    private List<String> transactionHistory;

    public Drug(String name, int batchNumber, String initialOwner) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.currentOwner = initialOwner;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Manufactured by: " + initialOwner);
    }

    public void transferOwnership(String newOwner) {
        this.currentOwner = newOwner;
        this.transactionHistory.add("Transferred to: " + newOwner);
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Drug Details:\n");
        sb.append("  - Name: ").append(name).append("\n");
        sb.append("  - Batch Number: ").append(batchNumber).append("\n");
        sb.append("  - Current Owner: ").append(currentOwner).append("\n");
        sb.append("  - Transaction History:\n");
        for (String event : transactionHistory) {
            sb.append("    * ").append(event).append("\n");
        }
        return sb.toString();
    }
}
