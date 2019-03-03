class Solution {
     public String intToRoman(int num) {
		StringBuilder str = new StringBuilder("");
		while (num > 0) {
			if (num >= 1000) {
				str.append("M");
				num = num - 1000;
			} else if (num >= 900) {
				str.append("CM");
				num = num - 900;
			} else if (num >= 500) {
				str.append("D");
				num = num - 500;
			} else if (num >= 400) {
				str.append("CD");
				num = num - 400;
			} else if (num >= 100) {
				str.append("C");
				num = num - 100;
			} else if (num >= 90) {
				str.append("XC");
				num = num - 90;
			} else if (num >= 50) {
				str.append("L");
				num = num - 50;
			} else if (num >= 40) {
				str.append("XL");
				num = num - 40;
			} else if (num >= 10) {
				str.append("X");
				num = num - 10;
			} else if (num >= 9) {
				str.append("IX");
				num = num - 9;
			} else if (num >= 5) {
				str.append("V");
				num = num - 5;
			} else {
				switch (num) {
				case 4:
					str.append("IV");
					num = num - 4;
					break;
				case 3:
					str.append("I");
					num--;
				case 2:
					str.append("I");
					num--;
				case 1:
					str.append("I");
					num--;
				}
			}
		}

		return str.toString();
	
    }
}