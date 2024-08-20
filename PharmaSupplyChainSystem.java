import java.util.HashMap;
import java.util.Map;

public class PharmaSupplyChainSystem {
    private Map<Integer, Drug> drugs;

    public PharmaSupplyChainSystem() {
        drugs = new HashMap<>();
    }

    public void registerDrug(String name, int batchNumber, String manufacturer) {
        Drug drug = new Drug(name, batchNumber, manufacturer);
        drugs.put(batchNumber, drug);
        System.out.println("Drug successfully registered:\n" + drug);
    }

    public void transferDrug(int batchNumber, String newOwner) {
        Drug drug = drugs.get(batchNumber);
        if (drug != null) {
            drug.transferOwnership(newOwner);
            System.out.println("Drug ownership transferred:\n" + drug);
        } else {
            System.out.println("Error: Drug with batch number " + batchNumber + " not found.");
        }
    }

    public void verifyDrug(int batchNumber) {
        Drug drug = drugs.get(batchNumber);
        if (drug != null) {
            System.out.println("Verifying Drug:\n" + drug);
        } else {
            System.out.println("Error: Drug with batch number " + batchNumber + " not found.");
        }
    }

    public static void main(String[] args) {
        PharmaSupplyChainSystem system = new PharmaSupplyChainSystem();

        // Registering a new drug
        system.registerDrug("Paracetamol", 1001, "ABC Pharmaceuticals");

        // Transferring the drug to a distributor
        system.transferDrug(1001, "XYZ Distributors");

        // Transferring the drug to a pharmacy
        system.transferDrug(1001, "HealthPlus Pharmacy");

        // Verifying the drug's transaction history
        system.verifyDrug(1001);
    }
}
