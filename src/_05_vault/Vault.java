package _05_vault;
import java.util.*;
public class Vault {
	int secretCode;
	Vault() {
		this.secretCode = new Random().nextInt(1000001);
	}
	boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}
class JamesBond {
	Vault vault;
	JamesBond() {
	}
	int findCode(Vault vault2) {
		for (int x = 0; x < 1000001; x++) {
			System.out.println("trying code: " + x);
			if (vault2.tryCode(x)) {
				return x;
			}
		}
		return -1;
	}
}