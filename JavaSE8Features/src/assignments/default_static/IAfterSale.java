package assignments.default_static;

public interface IAfterSale {
	double chargeOnDelivery();

	default double discount() {
		return 0.0;
	}
}
