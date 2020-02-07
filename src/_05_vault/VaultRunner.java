package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond jamesBond = new JamesBond();
		int code = jamesBond.findCode(vault);
		System.out.println("found code: " + vault.tryCode(code));
	}
}
