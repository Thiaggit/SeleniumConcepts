package strings;

public class RemoveWhiteSpacesLeadingAndTrailing {

	public void removingWhiteSpaces() {
		String str = " Thiagarajan ";
		System.out.println(str.trim());
		System.out.println(str.strip());
		System.out.println(str.replaceAll("^[ \t]+|[ \t]+$", ""));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveWhiteSpacesLeadingAndTrailing obj = new RemoveWhiteSpacesLeadingAndTrailing();
		obj.removingWhiteSpaces();
	}

}
