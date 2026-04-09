package OrderAndInventoryManagement.exception;

public class InsuffcientStockException extends RuntimeException {

    public InsuffcientStockException(String msg) {
        super(msg);
    }
}
