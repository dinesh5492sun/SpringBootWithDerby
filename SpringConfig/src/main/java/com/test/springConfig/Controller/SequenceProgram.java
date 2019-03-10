package com.test.springConfig.Controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceProgram {
	public static void main(String[] args) {
		
		
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 6, 7, 10, 15);
		Collections.sort(al);
		int count1 = 0;
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < al.size(); i++) {
			sb.append(al.get(i));
			count1++;
			int count = 0;
			do {
				if (i + 1 < al.size() && al.get(i) + 1 == al.get(i + 1)) {
					i++;
					count++;
					System.out.println("count "+count +"i value"+i);
					if (count > 1) {
						sb.delete(count1, count1 + 4);
					}
					sb.append("to" + al.get(i) + ",");
				}
			} while (i + 1 < al.size() && al.get(i) + 1 == al.get(i + 1));
		}
		System.out.println(sb);
	}
}

/*1) [1,2,3,4,6,7,10,15] --> input

output--> List<String>
	  [1 to 4
	  6 to 7
	  10
	  15]*/