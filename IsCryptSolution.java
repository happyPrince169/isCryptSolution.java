package Codefights;

public class IsCryptSolution {
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		long rs = 0;
		long num = 0;
		for (int i = 0; i < 3; i++) {
			String str = "";
			for (int k = 0; k < crypt[i].length(); k++) {
				char ch = crypt[i].charAt(k);
				for (int j = 0; j < solution.length; j++) {
					if (ch == solution[j][0]) {
						str += solution[j][1];
						break;
					}
				}
			}
			if (str.length() > 1 && str.charAt(0) == '0') {
				return false;
			}
			if (i < 2) {
				rs += Long.parseLong(str);
			} else {
				num = Long.parseLong(str);
			}
		}
		if (rs == num) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] crypt = { "AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC" };
		char[][] solution = { { 'A', '1' }, { 'B', '2' }, { 'C', '3' } };
		System.out.println(isCryptSolution(crypt, solution));

	}

}
