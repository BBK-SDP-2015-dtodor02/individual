package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class BnzInstruction extends Instruction {

	private int op;
	private String label2;

	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, int op, String label2) {
		this(label, "bnz");
		this.op = op;
		this.label2 = label2;
	}

	@Override
	public void execute(Machine m) {
		if (m.getRegisters().getRegister(op) != 0) {
			m.setPc(m.getLabels().indexOf(label2));
		}
	}

	@Override
	public String toString() {
		return super.toString() + " current: " + op + ", goto: " + label2;
	}
}
